/*
 * Override.java
 *
 * Created on November 24, 2008, 5:41 PM
 *
 * This is the example for Inheritance
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.home.java.core;

/**
 *
 * @author siddisab
 */
class A {
    int i, j;
    A(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.print("i=" + i + " j=" + j + " ");
    }
}

class B extends A {
    int k;
    B(int a, int b) {
        super(a, b);
    }
    B(int a, int b,int c) {
        super(a, b);
        k=c;
    }
    void show() {
        super.show();
        System.out.println("k=" + k);
    }
    void show(int k) {
        this.k=k;
        super.show();
        System.out.println("k=" + k);
    }
    
}

class Override {
    public static void main(String args[]) {
        B subOb = new B(1, 2,3);
        subOb.show(); 
        
        B subOb1 = new B(1, 2);
        subOb1.show(3); 
        
    }
}
