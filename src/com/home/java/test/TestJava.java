package com.home.java.test;

public class TestJava {

	public static void main(String[] args) {

		 int[] scores1 = { 1, 2, 3, 4, 5, 6};
	        int[] scores2 = { 7, 8, 9, 0, 11, 12};
	        System.arraycopy(scores2, 2, scores1, 3, 2);
	        for(int i :  scores1) System.out.print(i);
	}

}
