package com.practice.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateCharacter {

	public static void main(String[] args) {

		String input = "javais a programming language ja";

		Map<Character, Long> result = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(result);
	}

}
