package com.practice.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertArrayToHashMap {

	public static void main(String[] args) {

		// Creating ArrayList
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Ram");
		arr.add("shyam");
		arr.add("Krishna");
		arr.add("Mohan");
		System.out.println("Creating Array :" + arr);

		// convert HashMap

		HashMap<String, Integer> hm = arr.stream()
				.collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, HashMap::new));

		System.out.println("Converting HashMap :" + hm);
	}
}
