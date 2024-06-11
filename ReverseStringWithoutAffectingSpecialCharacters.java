package com.practice.java8;

public class ReverseStringWithoutAffectingSpecialCharacters {
	public static void main(String[] args) {
		String str = "r#aa$pid@";
		char[] arr = str.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			//don't reverse when char is special char
			if (!Character.isAlphabetic(arr[i]))i++;
			else if (!Character.isAlphabetic(arr[j]))j--; //Reverse logic
            //if both are char
			else {
				char ch = arr[i]; //array of i
				arr[i] = arr[j];
				arr[j] = ch;
				i++;
				j--;
			}
		}
         //convert array to string
		String strData = new String(arr);
		System.out.println(strData);
	}
}
