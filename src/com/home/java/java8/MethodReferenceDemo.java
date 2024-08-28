package com.home.java.java8;

import java.util.Arrays;
import java.util.List;

class Student{
   String name;
   Student(String name){
      this.name = name;
   }
   public String toString(){
      return  this.name;
   }
}
   
public class MethodReferenceDemo {

	
   public static void main(String args[]) {
	   

      List<String> studentNames = Arrays.asList("Mahesh","Suresh","Ramesh","Robert","Jon");

      // create the list of student objects from names
      Student[] students =  studentNames.stream().map(Student::new).toArray(Student[]::new);

      List<Student> list = Arrays.asList(students);

      //Print List using Method Reference
      list.forEach(System.out::println);
      
   }
}


