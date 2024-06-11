package com.practice.java8;

public class Test {

	public static void main(String[] args) {

		String s1 = new String("Ram");
		String s2 = new String("Ram");

		if (s1 == s2) {
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 != s2");
		}

		if (s1.equals(s2)) {
			System.out.println("Both String are equal");
		} else {
			System.out.println("Both String are diffrent");
		}

	}

}
//1st one: check reference 
//2nd one : check content or information