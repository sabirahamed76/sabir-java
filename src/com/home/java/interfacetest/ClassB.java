package com.home.java.interfacetest;

public class ClassB implements InterB {
	public void BMethod(){
		System.out.println("BMethod");
	}
	public void AMethod(){
		
	}
	public static void main(String args[]){
		ClassB b=new ClassB();
		b.AMethod();
		b.BMethod();
	}
}
