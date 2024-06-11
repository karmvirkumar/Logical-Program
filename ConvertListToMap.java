package com.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

	public static void main(String[] args) {

		List<Hosting> list = new ArrayList<>();

		list.add(new Hosting(1, "gmail.com", 9000));
		list.add(new Hosting(2, "facebokk.com", 8000));
		list.add(new Hosting(3, "youtube.com", 3000));
		list.add(new Hosting(4, "instagram.com", 1000));

		Map<Integer, String> result1 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));
		System.out.println(result1);

		Map<String, Long> result2 = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites));
		System.out.println(result2);

		Map<Integer, Long> result3 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getWebsites));
		System.out.println(result3);

	}

}
