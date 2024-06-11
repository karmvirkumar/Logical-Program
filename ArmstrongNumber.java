package com.practice.logical;

public class ArmstrongNumber {
	
	// 153 is Armstrong number => 1*1*1 + 5*5*5 + 3*3*3 = 153
	// 370 is Armstrong number => 3*3*3 + 7*7*7 + 0*0*0 = 370
	
	public static void main(String[] args) {
		//Find the length.
		int no=153;
		int t1=no;
		int length=0;
		while(t1 !=0 ) {
			length= length+1;
			t1=t1/10;
		}
		//reverse of number.
		int t2=no;
		int arm=0;
		while(t2 !=0 ) {
			int mul=1;
			int rem=t2%10;
			for(int i=1; i<=length; i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no) {
			System.out.println(no + ":is armstrong number");
		}else {
			System.out.println(no+ ":is not armstrong number");
		}
	}
	
	

}
