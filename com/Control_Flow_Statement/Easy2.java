package com.Control_Flow_Statement;

/*2. Write a program to check whether the given number is divisor of 7 using simple if statement.*/
import java.util.*;
public class Easy2 {
	public static void main (String args[]) {
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the number:");
		int num=obj.nextInt();
		if(num%7==0) {
			System.out.println("Yes the given number is divisible by 7");
		}
		else {
			System.out.println("No the given number is not divisible by 7");
		}
	}
}
