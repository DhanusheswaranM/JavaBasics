package com.Control_Flow_Statement;
/*1. Numbers and Alphabets has equivalent ASCII values 
 * i.e Numbers (0 to 9) equivalent ASCII value is 48 to 57, 
 * uppercase alphabet (A to Z) equivalent ASCII value is 65 to 90 and 
 * lowercase alphabet (a to z) equivalent ASCII value is 97 to 120. 
 * Write a program to sort numbers 0 to 9, alphabets in upper and lowercase using equivalent ASCII values.*/
import java.util.*;
public class Hard1 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = obj.nextLine();
		char arr[] = str.toCharArray();
		for(int i = 0; i < arr.length ; i++) {
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(char c : arr) {
			System.out.print(c+" ");
		}
		
	}
}
