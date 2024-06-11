package com.practice.logical;

import java.util.Arrays;

public class OddAndEven {

	public static void main(String[] args) {

		//odd number
		int[] numbers = { 2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66 };
		Arrays.stream(numbers).filter(o -> o % 2 != 0).forEach(System.out::println);

		//even number
		
		  int[] number = {2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66};
	      Arrays.stream(number).filter(o -> o % 2 == 0).forEach(System.out::println);
	}
}
