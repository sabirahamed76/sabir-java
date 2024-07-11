package com.home.java.db;

import java.io.Serializable;

public class DeleteDBForm implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String idCsv;	
	private Long txnCount;
	
	public String getIdCsv() {
		return idCsv;
	}
	public void setIdCsv(String idCsv) {
		this.idCsv = idCsv;
	}
	public Long getTxnCount() {
		return txnCount;
	}
	public void setTxnCount(Long txnCount) {
		this.txnCount = txnCount;
	}
	
	
	
	
}
