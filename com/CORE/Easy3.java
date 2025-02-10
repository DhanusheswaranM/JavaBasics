package com.CORE;
/*3.Write a program to sort set of names stored in an array in alphabetical order.*/
import java.util.*;
public class Easy3 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = obj.nextLine();
		char a[] = s.toCharArray();
		for(int i = 0 ;i < a.length ; i++) {
			for(int j = i+1 ; j < a.length ; j++) {
				if(a[i] > a[j]) {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a);
	}
}