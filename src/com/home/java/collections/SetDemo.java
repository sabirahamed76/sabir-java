package com.home.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	

	public void hashSetSample() {
		// Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
	
	public void linkedHashSetSample() {
		// Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs
            = new LinkedHashSet<String>();

        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
	}
	
	public void treeSetSample() {
		// Creating TreeSet and
        // adding elements
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Geeks");
        ts.add("For");
        ts.add("Geeks");
        ts.add("Is");
        ts.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
	}
	
	
	
	public static void main(String args[]) {
		SetDemo sd = new SetDemo();
		//Set Example
		System.out.println("=============HASH SET EXAMPLE==================");
		sd. hashSetSample();
		
		System.out.println("=============LINKED HASH SET EXAMPLE==================");
		sd.linkedHashSetSample() ;
		
		System.out.println("=============TREE SET EXAMPLE==================");
		sd.treeSetSample() ;
	}
}
