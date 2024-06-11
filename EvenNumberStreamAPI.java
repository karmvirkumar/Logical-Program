package com.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumberStreamAPI {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		
		Stream<Integer> stream = list.stream();
		//stream.forEach(p -> System.out.println(p));
		
		List<Integer> evenNumber = stream.filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println(evenNumber);
		
	}
}
