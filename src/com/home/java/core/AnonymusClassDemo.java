package com.home.java.core;


class Car {
   private Integer powerTimes=1;
   public String engineType=null;
   
   public String getEngineType() {
      return engineType;
   }
   public void displayEngine() {}
}

class TurboCar extends Car{	
	public void displayEngine() {
		System.out.println(getEngineType()+ " Engine");	
	}
}

public class AnonymusClassDemo {
	
	public static void main(String args[]) {
		//Usual way of create object by extend and override method displayEngine
		TurboCar turboCar = new TurboCar();
		turboCar.engineType="TURBO";
		turboCar.displayEngine();
      
      
      //Create an anonymus class to override displayEngine method implementations without creating class
      Car c2 = new Car() {
    	  String engineType="V2 POWER";
    	  Integer powerTimes=7;
         
         @Override
         public void displayEngine() {
        	 if (engineType.equals("V2 POWER")) {
        		 Integer a=powerTimes*10;
        		 String message = "V2 Powerful Engine with "+ powerTimes + " times more than normal";
        		 System.out.println(message);
        	 }
         }
      };
      c2.displayEngine();
   }
}
