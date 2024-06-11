package com.practice.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(11, "Laptop");
		map.put(12, "keyboard");
		map.put(13, "Mouse");
		map.put(14, "Cpu");

		// Map Key to List
		List<Integer> result = map.keySet().stream().collect(Collectors.toList());
		result.forEach(System.out::println);
		System.out.println(result);

		// Map Value to List
		List<String> result1 = map.values().stream().collect(Collectors.toList());
		result1.forEach(System.out::println);
		System.out.println(result1);

	}

}
