package com.home.java.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
        // List of lists of names
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Reflection", "Collection", "Stream"),
            Arrays.asList("Structure", "State", "Flow"),
            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );
        System.out.println("=============");
        System.out.println("Initial List:");
        System.out.println("=============");
        listOfLists.forEach(System.out::println);
        
        
        
        
       // flatMap: the list of lists into a single stream
        List<String> names = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());;
        System.out.println();
        System.out.println("==========================");
        System.out.println("FlatMap: Convert to Single List");
        System.out.println("==========================");
        names.forEach(System.out::println);

       

        // count: Count the number of names
        long count = names.stream().count();
        System.out.println();
        System.out.println("==========================");
        System.out.println("count: Number of items");
        System.out.println("==========================");
        System.out.println(count);
        

        // findFirst: Find the first name
        Optional<String> firstName = names.stream().findFirst();
        System.out.println();
        System.out.println("==========================");
        System.out.println("findFirst: Get the First Item");
        System.out.println("==========================");
        firstName.ifPresent(System.out::println);
        

        // reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream()
        		.reduce(
        				"",
            (partialString, element) -> partialString + " " + element
        );
        System.out.println();
        System.out.println("==========================");
        System.out.println("reduce: Concatenated Items");
        System.out.println("==========================");
        System.out.println(concatenatedNames.trim());
        
       // equals: Check a String Exisits
        Boolean bool = names.stream()
        		.equals("State");
        System.out.println();
        System.out.println("==========================");
        System.out.println("equals: Check if State exisits");
        System.out.println("==========================");
        System.out.println(bool);
        
        
        // collect: Collect names starting with 'S' into a list
        List<String> sNames = names.stream()
                                   .filter(name -> name.startsWith("S"))
                                   .collect(Collectors.toList());
        System.out.println();
        System.out.println("==========================");
        System.out.println("startsWith: Items starting with 'S'");
        System.out.println("==========================");
        sNames.forEach(System.out::println);


        // allMatch: Check if all names start with 'S'
        boolean allStartWithS = names.stream().allMatch(
            name -> name.startsWith("S")
        );
        System.out.println();
        System.out.println("==========================");
        System.out.println("allMatch: Check all start with 'S'");
        System.out.println("==========================");
        System.out.println(allStartWithS);

        // anyMatch: Check if any name starts with 'S'
        boolean anyStartWithS = names.stream().anyMatch(
            name -> name.startsWith("S")
        );
        System.out.println();
        System.out.println("==========================");
        System.out.println("anyMatch: Check any start with 'S'");
        System.out.println("==========================");
        System.out.println(anyStartWithS);
        
        
     // Create a set to hold intermediate results
        Set<String> intermediateResults = new HashSet<>();

        // Stream pipeline demonstrating various intermediate operations
        List<String> result = listOfLists.stream()
            .flatMap(List::stream)                             // Flatten the list of lists into a single stream
            .filter(s -> s.startsWith("S"))                   // Filter elements starting with "S"
            .map(String::toUpperCase)                     // Transform each element to uppercase
            .distinct()                                           // Remove duplicate elements
            .sorted()                                            // Sort elements
            .peek(s -> intermediateResults.add(s)) // Perform an action (add to set) on each element
            .collect(Collectors.toList());                // Collect the final result into a list

        // Print the intermediate results
        System.out.println();
        System.out.println("=================================");
        System.out.println("Intermediate Result:");
        System.out.println("=================================");
        intermediateResults.forEach(System.out::println);

        // Print the final result
        System.out.println();
        System.out.println("==========================");
        System.out.println("Processed Final Result:");
        System.out.println("==========================");
        result.forEach(System.out::println);
        
    }
}
