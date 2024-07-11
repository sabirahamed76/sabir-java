/*
 * Arraylist.java
 *
 * Created on January 13, 2009, 3:49 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.home.java.core;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arraylist {
    
    public static ArrayList GetUniqueValues(Collection values){
            return (ArrayList)Union(values, values);
        }
    public static Collection Union(Collection coll1, Collection coll2){
        Set union = new HashSet(coll1);
        union.addAll(new HashSet(coll2));
        return new ArrayList(union);
    }

    public static void main (String args[]){
        List a=new ArrayList();
        
           
        a.add("a1");
        a.add("a1");
        a.add("a1");
        a.add("a2");
        a.add("a3");
        a.add("a3");
        a.add("b1");
        a.add("b1");
        a.add("b2");
        a.add("b2");
        a.add("b2");
        a.add("b3");
        int k=0;
        /*for (Object y : GetUniqueValues(a)){
            k++;
        } */      
        String[][] b=new String [k][2];
        k=0;
        /*for (Object y : GetUniqueValues(a)){
             b[k++][0]=(String)y;
        }*/
        for (int i = 0; i < b.length; i++) {
            int count=0;
            for (int j=0; j<a.size(); j++){
                if (b[i][0].equals(a.get(j))){
                    count++;
                }
            }
            b[i][1]=new Integer(count).toString();
        }
            

        for (int i=0; i<b.length;  i++){
            System.out.println(b[i][0] + " = " + b[i][1] + " time(s) make it dark");
        }
        
        
        
        
   }
    
}
