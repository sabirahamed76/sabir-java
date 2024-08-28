/*
 * Static.java
 *
 * Created on November 27, 2008, 4:34 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.home.java.oops;

/**
 *
 * @author siddisab
 */
public class Static {
    
    //This variable can be accessed anywhere
    public static int i;
    public int j=10;
    
    //This block executed automatically
    static{
        i=10;
    }
    
    //This method can only access static variables
    public static int getI(){
        return ++i;
    }
    
    public int getJ(){
        ++i;
        return ++j;
    }
    
    public static void main(String args[]){
        System.out.println("The Value of I is = " + Static.getI());
        
        Static s=new Static();
        System.out.println("The Value of J is = " + s.getJ());
    }
    
}
