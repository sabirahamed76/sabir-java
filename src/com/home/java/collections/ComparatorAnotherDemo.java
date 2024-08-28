package com.home.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dog implements Comparator<Dog>, Comparable<Dog> {
	   private String name;
	   private int age;
	   Dog() {
	   }

	   Dog(String n, int a) {
	      name = n;
	      age = a;
	   }

	   public String getDogName() {
	      return name;
	   }

	   public int getDogAge() {
	      return age;
	   }
	   
	   // Overriding the compareTo method to sort the age from java.lang.Comparable Class
	   public int compareTo(Dog d) {
	      return (this.name).compareTo(d.name);
	   }
	   
	   // Overriding the compare method from java.util.Comparator Class
	   public int compare(Dog d,Dog d1) {
	      return d.age - d1.age ;
	   }

	   

	   @Override
	   public String toString() {
	      return this.name + "," + this.age;
	   }
	}

public class ComparatorAnotherDemo {

	   public static void main(String args[]) {
	      // Takes a list o Dog objects
	      List<Dog> list = new ArrayList<>();

	      list.add(new Dog("Shaggy", 3));
	      list.add(new Dog("Lacy", 2));
	      list.add(new Dog("Roger", 10));
	      list.add(new Dog("Tommy", 4));
	      list.add(new Dog("Tammy", 1));

	      
	      

	      System.out.println("Sorted by name: by Comparable Interface");
	      Collections.sort(list);   // Sorts the array list
	      // printing the sorted list of names
	      System.out.println(list);
	      
	      System.out.println();

	      // Sorts the array list using comparator
	      System.out.println("Sorted by age: by Comparator Interface");
	      Collections.sort(list, new Dog());
	      // printing the sorted list of age
	      System.out.print(list);
	      System.out.println(" ");
	      
	   }
	}