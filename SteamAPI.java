package com.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SteamAPI {
	public static void main(String[] args) {
		
		//Stream.of()
		Stream<Integer> stream = Stream.of(2,4,6,8,12,14,17);
		stream.forEach(p -> System.out.println(p));
		
		//Stream.of(array)
	    Stream<Integer> steam = Stream.of(new Integer[] {11,12,13,14,15,16,17,18});
	    steam.forEach(p -> System.out.println(p));
	    
	    //List.stream()
	    List<Integer> li = new ArrayList<Integer>();
	    for(int i=0; i<10; i++) {
	    	li.add(i);
	    }
	    Stream<Integer> stream1 = li.stream();
	    stream1.forEach(p -> System.out.println(p));
	    
	    //
	    
	    
	    
	}

}
