package com.practice.java8;

import java.util.List;
import java.util.stream.Collectors;
public class StreamMethod {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(2,4,5,6,7,8,9,12,14,1,15);
		List<Integer> newNumber= numbers.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(newNumber);
		
		//sorted
		numbers.stream().sorted().forEach(System.out::println);
		
		//Min
		Integer integer = numbers.stream().min((x,y) -> x.compareTo(y)).get();
		System.out.println("Min Number :"+integer);
		
		//Max
		
		Integer integer2 = numbers.stream().max((x,y) -> x.compareTo(y)).get();
		System.out.println("Max Number :"+integer2);
		
		//boolean value function (true/ false)
		List<String> names = List.of("Ram", "Rasu", "Supi", "Siva");
		List<String> newName = names.stream().filter(e -> e.startsWith("R")).collect(Collectors.toList());
		System.out.println(newName);
		
	}
}
