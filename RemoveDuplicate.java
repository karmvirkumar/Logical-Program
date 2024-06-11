package com.practice.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,2,4,4,6,6,8,8,9));

		List<Integer> li = arr.stream().distinct().collect(Collectors.toList());

		System.out.println(li);
	}

}
