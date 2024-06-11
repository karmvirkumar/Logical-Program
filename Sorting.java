package com.practice.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
	public static void main(String[] args) {

		List<String> city = new ArrayList<String>();
		city.add("Noida");
		city.add("Agara");
		city.add("Delhi");
		city.add("Banglore");

		List<String> naturalOrder = city.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		naturalOrder.forEach(System.out::println);// Agara,Banglore,Delhi,Noida

		List<String> naturalOrder1 = city.stream().sorted().collect(Collectors.toList());
		naturalOrder1.forEach(System.out::println);// Agara,Banglore,Delhi,Noida

		List<String> descendingOrder = city.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		descendingOrder.forEach(System.out::println); // Noida, Delhi, Banglore,Agara

//How can I filter employee list based on the "City filter list" and maintain the filter order
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Ram", "Noida"));
		emp.add(new Employee("Shyam", "Delhi"));
		emp.add(new Employee("Karmvir", "NCR"));
		emp.add(new Employee("Karmvir", "Gurgon"));
		emp.add(new Employee("Karmvir", "Banglore"));

		List<String> filterList = Stream.of("Noida", "Delhi", "NCR", "Pune").collect(Collectors.toList());
		List<Employee> newList = emp.stream().filter(e -> filterList.contains(e.getCity()))
				.sorted((a, b) -> filterList.indexOf(a.getCity()) - filterList.indexOf(b.getCity()))
				.collect(Collectors.toList());
		newList.stream().forEach(e -> {
			System.out.println(e.getCity()); // output: Noida, Delhi, NCR
		});
//Sort employee based on city.				
		List<Employee> sortedList = emp.stream().sorted(Comparator.comparing(Employee::getCity))
				.collect(Collectors.toList());
		sortedList.forEach(System.out::println);

	}
}