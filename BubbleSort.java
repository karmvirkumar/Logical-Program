package com.practice.logical;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 36, 19, 29, 12, 5 };

		int temp;
		for (int i = 0; i < a.length; i++) {
			int fixNum = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					fixNum = 1; // agar fixNum ki value 1 hoga to swaping complete hp gya.
					           // ahar fixNum ki value 0 to sika matlab swap nhi hua.
				}
			}

			if (fixNum == 0) {
				break;
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

}
