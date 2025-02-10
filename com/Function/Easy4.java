package com.Function;
import java.util.*;
public class Easy4 {
	public static boolean Vote(int age) {
		if (age >= 18) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = obj.nextInt();
		
		if (Vote(age)) {
			System.out.println("You are eligible vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}
	
}
