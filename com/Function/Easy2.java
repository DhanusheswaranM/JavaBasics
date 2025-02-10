package com.Function;

import java.util.*;
public class Easy2 {
	public static boolean Prime(int num) {
		
		for( int i = 2 ; i <= num/2 ; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = obj.nextInt();
		
		if (Prime(num)) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a prime number");
		}
	}

	
}
