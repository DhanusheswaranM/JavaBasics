package com.Array;
/*2. Write a program to sort the elements of an array in sequence.*/
import java.util.*;
public class Easy2 {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the no of elements : ");
		int num = obj.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the elements in the array : ");
		for(int i = 0 ; i < num ; i++) {
			arr[i] = obj.nextInt();
		}
		for(int i = 0 ; i < num ; i++) {
			for(int j = i+1 ; j< num ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The sorted array : ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
