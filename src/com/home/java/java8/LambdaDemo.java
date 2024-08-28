package com.home.java.java8;

import java.util.ArrayList;
import java.util.List;

/*
In Java, Lambda expressions basically express instances of functional interfaces 
(An interface with a single abstract method is called a functional interface). 
Lambda Expressions in Java are the same as lambda functions 
which are the short block of code that accepts input as parameters and returns a resultant value.
 */
	
 interface GreetingService {
    void sayMessage(String message);
 }
	
 interface MathOperation {
    int operation(int a, int b);
 } 
 
public class LambdaDemo {

	 private int operate(int a, int b, MathOperation mathOperation) {
	    return mathOperation.operation(a, b);
	 }
	 
	 public static void main(String args[]) {
		 
		
		//without parenthesis
	    GreetingService greetService1 = message -> System.out.print("Hello " + message);
			
	    //with parenthesis
	    GreetingService greetService2 = (message) -> System.out.println(" " + message +"!");
		
	    //
	    System.out.println("Calling object where method implementain in Lambda");
	    greetService1.sayMessage("Sabir");
	    greetService2.sayMessage("Ahamed");
	    System.out.println();
	    
	    //with type declaration
	    MathOperation addition = (int a, int b) -> a + b;
			
	    //with out type declaration
	    MathOperation subtraction = (a, b) -> a - b;
			
	    //with return statement along with curly braces
	    MathOperation multiplication = (int a, int b) -> { return a * b; };
			
	    //without return statement and without curly braces
	    MathOperation division = (int a, int b) -> a / b;
	    
	    //Calling directly the objects method where implementation in lambda expression
	    System.out.println("Calling directly the objects method where implementation in lambda expression");
	    System.out.println("10 + 5 = " + addition.operation(10,5));
	    System.out.println("10 + 5 = " + addition.operation(10,5));
	    System.out.println("10 + 5 = " + addition.operation(10,5));
	    System.out.println("10 + 5 = " + addition.operation(10,5));
	    System.out.println();
	    
		//Create local object and call method to pass the Interface object 
	    System.out.println("Create local object and calling the method by passing the Interface object as a parameter");
	    LambdaDemo tester = new LambdaDemo();
	    System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	    System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	    System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	    System.out.println("10 / 5 = " + tester.operate(10, 5, division));
			
	    
	    
	    
	    System.out.println();
	    //Another Lambda Example
	    List<String> names = new ArrayList<>();

	      names.add("Mahesh");
	      names.add("Suresh");
	      names.add("Ramesh");
	      names.add("Naresh");
	      names.add("Kalpesh");

	      System.out.println("Printing using for each loop");
	      // Approach 1: for loop to print all elements
	      for (String name: names) {
	         System.out.println(name);
	      }

	      System.out.println("Printing using for each loop with lambda expression");
	      // Approach 2: lambda expression to print the elements in for each loop
	      names.forEach(name->System.out.println(name));

	      System.out.println("Printing using for each loop with method reference" );
	      // Approach 3: Method reference to print elements in for each loop
	      names.forEach(System.out::println);
	      
	 }
	
	 
}