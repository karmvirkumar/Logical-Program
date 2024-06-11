package com.practice.java8;

public class RemovingSpacialCharachter {
	
	public static void main(String[] args) {
		
		String str ="java@%$pro&%$pramming@!#$";
	    String resultStr =" ";
	    
	    for(int i=0; i<str.length(); i++) {
	    	
	    	//comparing alphabets with corresponding ASCII calue
	    	//A = (65) Decimal value.
	    	//Z= (122) Decimal value.
	    	if(str.charAt(i) > 65 && str.charAt(i) <= 122) {
	    		
	    		resultStr=resultStr+str.charAt(i);
	    	}
	    }
	    System.out.println(resultStr);
	}

}
