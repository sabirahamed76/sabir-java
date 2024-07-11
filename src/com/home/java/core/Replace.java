/*
 * CallBy.java
 *
 * Created on November 24, 2008, 5:23 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.home.java.core;

import java.util.ArrayList;
import java.util.Collections;




public class Replace {
    public static void main(String args[]) {
        
    	String rule1="AB";  String res1="AA";
        String rule2="BA";  String res2="AA";
        String rule3="CB";  String res3="CC";
        String rule4="BC";  String res4="CC";
        String rule5="AA";  String res5="A";
        String rule6="CC";  String res6="C";
        
        String[] rule = {"AB","BA","CB","BC","AA","CC"};
        String[] res = {"AA","AA","CC","CC","A","C"};
        
        String S="ABBCC";
        
        
        for(int i=0; i<rule.length; i++){
       	 if (S.contains(rule[i])){
       		S= S.replace(rule[i], res[i]);
       	 }
       	 
        }
        
        S= S.replace(rule[5], res[5]);
        System.out.println(S);
        
    }
}
