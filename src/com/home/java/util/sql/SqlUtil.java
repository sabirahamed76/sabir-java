package com.home.java.util.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;

import com.sun.corba.se.impl.io.TypeMismatchException;


public class SqlUtil {
	
	public static String commaSeparate(Long[] array) {
		if (array != null && array.length > 0) {
			StringBuilder sb = new StringBuilder(); 
			for (int i = 0; i < array.length; i++) {
				if (i > 0) {
					sb.append(",").append(array[i]);
				}
				else {
					sb.append(array[i]);
				}
			}			
			return sb.toString();
		}
		return null;
	}
	
	
	public static String commaSeparate(String[] array) {
		if (array != null && array.length > 0) {
			StringBuilder sb = new StringBuilder(); 
			for (int i = 0; i < array.length; i++) {
				String value = "";
				if(array[i] != null) {
					value = array[i].trim();
				}
				if (i > 0) {
					sb.append("', '").append(value);
				} else {
					sb.append("'").append(value);
				}
			}
			sb.append("'");
			return sb.toString();
		}
		return null;
	}

	public static boolean isSet(String str) {
		return str != null && str.trim().length() > 0;
	}
	
	
	public static void setParameters(PreparedStatement statement, List<Object> parameters) throws SQLException {
		
		for (int i = 0; i < parameters.size(); i++) {

			Object parameter = parameters.get(i);
			
			if (parameter instanceof String) {
				statement.setString(i+1, (String) parameter);
			}
			else if (parameter instanceof Long) {
				statement.setLong(i+1, (Long) parameter);
			}
			else {
				String msg = String.format("setParameters: Type is invalid for parameter # %d: %s. PreparedStatement: %s"
					, i, parameter.getClass().getSimpleName(), statement);
				throw new IllegalArgumentException(msg);
			}
		}
	} 
	
	
	public static void setHibernateParameters(Query query, List<Object> parameters) {
		
		for (int i = 0; i < parameters.size(); i++) {

			Object parameter = parameters.get(i);
			
			try {
				if (parameter instanceof String) {
					query.setString(i, (String) parameter);
					continue;
				}
				if (parameter instanceof Long) {
					query.setLong(i, (Long) parameter);
					continue;
				}
				if (parameter instanceof Integer) {
					query.setInteger(i, (Integer) parameter);
					continue;
				}
				if (parameter instanceof Boolean) {
					query.setBoolean(i, (Boolean) parameter);
					continue;
				}
				if (parameter instanceof Timestamp) {
					query.setTimestamp(i,  (Timestamp)parameter);
					continue;
				}
				if (parameter instanceof Date) {
					query.setDate(i, (Date) parameter);
					continue;
				}
				throw new TypeMismatchException(String.format("Type not supported: %s", parameter.getClass().getSimpleName()));
			}
			catch(Exception ex) {
				String msg = String.format("setParameters: Error when setting parameter # %d: Type '%s', Value '%s', Exception: %s, Query: %s"
					, i, parameter.getClass().getSimpleName(), parameter, ex.getMessage(), query.getQueryString());
				throw new RuntimeException(msg);
			}
		}
	}
	

}

