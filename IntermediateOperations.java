package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IntermediateOperations {

	public static void main(String[] args) {

		List<String> name = new ArrayList<>();
		
		name.add("Karmvir");
		name.add("Ram");
		name.add("Shyam");
		name.add("Radhe");
		
		//Intermediate-Operations ==> filter(), map(),flatMap(), distinct(),sorted(), peek(), limit(), skip()
		//Terminal Operations ==> forEach(), forEachOrdered(),toArray(), reduce(),
		                          //collect(), min(), max(),count(), anyMatch(),allMatch(), findFirst(), findAny()
		
		// Stream.filter()
		name.stream().filter((s) -> s.startsWith("R")).forEach(System.out ::println);
		
		//Stream.map()
		name.stream().filter((s) -> s.startsWith("K")).map(String :: toUpperCase).forEach(System.out :: println);
		
		//Stream max()
		List<Integer> list = Arrays.asList(2,3,5,7,8,12);
		Optional<Integer> maxNumber = list.stream().max((i, j) -> i.compareTo(j));
		System.out.println(maxNumber.get());
			
		// Stream min()
		List<Integer> List1 = Arrays.asList(1,4,3,5,6,2);
		Optional<Integer> minNumber = List1.stream().min((i, j) -> i.compareTo(j));
		System.out.println(minNumber.get());
		
		
	}

}
