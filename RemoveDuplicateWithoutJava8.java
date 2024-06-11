package com.practice.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWithoutJava8 {

	// create method
	public static void removeDuplicates(int[] a) {

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);
		System.out.print(set);
	}

	public static void main(String[] args) {

		int a[] = {2,2,4,4,6,6,8,8,9};
		// method call
		removeDuplicates(a);
		
		//with java 8
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,2,4,4,6,6,8,8,9));
		List<Integer> li = arr.stream().distinct().collect(Collectors.toList());
		System.out.println(li);

	}

}
