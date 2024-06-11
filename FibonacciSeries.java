package com.practice.logical;

//previous two number ka sum 
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0, b=1;
		System.out.println(a+" "+b);
		int c;
		for(int i=1; i<=10; i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
}

