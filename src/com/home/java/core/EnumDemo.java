package com.home.java.core;


enum Mobile {
   Samsung,
   Nokia,
   Motorola
}


enum WEEKDAY {
	
	// create values of enum
	MONDAY("Day 1"),
	TUESDAY("Day 2"),
	WEDNESDAY("Day 3"),
	THRUSDAY("Day 4"),
	FRIDAY("Day 5"),
	SATURDAY("Day 6"),
	SUNDAY("Day 7");
	
	private final String description;
	// private construtor to set default value
	private WEEKDAY(String description) {
		this.description = description;
	}
	// getter method to get the description
	public String getDescription () {
		return this.description;
	}
}


public class EnumDemo {


   public static void main(String args[]) {
      
      //print an Enum
      System.out.println(Mobile.Motorola);

      Mobile mobile = Mobile.Samsung;
      System.out.print("From Switch statement ");
      //Usage in Swith statment
      switch(mobile) {
         case Samsung:
            System.out.println("Samsung");
            break;
         case Nokia:
            System.out.println("Nokia");
            break;
         case Motorola:
            System.out.println("Motorola");
      }
      
      System.out.print("From If statement ");
      //Usage in IF statment
      if(mobile == Mobile.Samsung) {
         System.out.println("Record Matched");
      }
      
      System.out.println();
      System.out.println(WEEKDAY.MONDAY + "=" + WEEKDAY.MONDAY.getDescription());
   }
}


