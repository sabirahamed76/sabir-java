package com.home.java.core;

/*
Use the static variable for the property that is common to all objects. 
*/
class Outer {
	static int a = 10;
    static int b;
    
    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    
   static class Inner {
      public static void print() {
         System.out.println("This is Inner class");
      }
   }
   
   public static void print() {
       System.out.println("This is Outer class");
       System.out.println("Value of b : "+b);
    }
   
}
	
public class StaticDemo {

	public static void main(String[] args) {
		System.out.println("from main");
		Outer.Inner.print();
		Outer.print();
	}



}
