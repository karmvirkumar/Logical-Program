package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TcsInterview {
	
	public static void main(String[] args) {
		
		//Length of string
		List<String> list= Arrays.asList("apple", "banana", "pear", "grape");
		Map<Integer, List<String>> newList =list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(newList); //output: {4=[pear], 5=[apple, grape], 6=[banana]}
		
		//Bind single String
		List<String> listOfString= Arrays.asList("Hello", " ", "world", "!");
		String sinleString= listOfString.stream().collect(Collectors.joining());
		System.out.println(sinleString); //Hello world!
		
		
	}

}
