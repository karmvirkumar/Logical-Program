package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
	public static void main(String[] args) {

		//One-to-one mapping occurs in map().
		//map() is used only for transformation.
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Ram");
		arr.add("Rasu");
		arr.add("Shyam");
		arr.add("Radhe");
		System.out.println("list of name"+ arr);
		
		List list = arr.stream().map(s -> s.length()).collect(Collectors.toList());
		System.out.println("After Used Map" +list);
		
		//One-to-many mapping occurs in flatMap().
		//flatMap() is used both for transformation and mapping.
		
		List<List<Integer>> number = new ArrayList<>();
		number.add(Arrays.asList(1, 2));
		number.add(Arrays.asList(4, 6));
		number.add(Arrays.asList(5, 9));
		number.add(Arrays.asList(8, 2));
		number.add(Arrays.asList(9, 5));
		System.out.println("Without flat Map"+number);
		
		List<Integer> flatList = number.stream().flatMap(li -> li.stream()).collect(Collectors.toList());
		System.out.println("After used flateMap"+flatList);
	}

}
