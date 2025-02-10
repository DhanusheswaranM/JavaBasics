package com.Array;
/*7. Write a program to merge two arrays into a third array. Display the values of three arrays.*/
import java.util.*;
public class Easy7 {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of array 1: ");
		int size1 = obj.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Eter the size of array 2: ");
		int size2 = obj.nextInt();
		int arr2[] = new int[size2];
		
		System.out.println("Enter the array-1 elements: ");
		for(int i = 0 ; i < size1 ; i++) {
			arr1[i] = obj.nextInt();
		}
		
		
		System.out.println("Enter the array-2 elements: ");
		for(int i = 0 ; i < size2 ; i++) {
			arr2[i] = obj.nextInt();
		}
		int arr3[] = new int[size1+size2];
		
		for(int i = 0 ; i < size1+size2 ; i++) {
			if(i < size1) {
				arr3[i] = arr1[i];
			}
			else {
				arr3[i] = arr2[i-size1];
			}
		}
		System.out.println("Two array added :");
		for(int i = 0 ; i < arr3.length ; i++) {
			System.out.print(arr3[i]+" ");
		}
		
	}
}

