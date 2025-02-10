package com.Function;

import java.util.*;
public class Easy1 {
	public static boolean OddEven(int num) {
		if (num%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = obj.nextInt();
		
		if (OddEven(num)) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}
	
}
