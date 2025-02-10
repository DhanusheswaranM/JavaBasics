package com.Array;

import java.util.*;
public class Medium6 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int arr1[] = new int[15];
		int count[] = new int[128];
		System.out.println("Enter 15 random numbers : ");
		for (int i = 0; i < 15; i++) {
			arr1[i] = obj.nextInt();
			count[arr1[i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				System.out.println(i + " : " + count[i]);
			}
		}
	}
}
