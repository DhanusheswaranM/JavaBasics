package com.Array;
/*1. Write a program to add even and odd numbers from 1 to 10. Store and display their results in two separate arrays.*/
import java.util.*;
public class Easy1 {
	
	public static void CalculateOddEven(int arr[], int odd, int even) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("the odd numbers : "+odd+"\nthe even numbers : "+even);
	}
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the no of elements in array : ");
		int r = obj.nextInt();
		int arr[] = new int[r];
		System.out.println("Enter the elements in the array : ");
		for(int i = 0; i < r ;i++) {
			arr[i] = obj.nextInt();
		}
		int odd=0,even=0;
		
		CalculateOddEven (arr, odd, even);
	}
}
