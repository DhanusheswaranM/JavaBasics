package com.Array;
/*1. Write a program to check whether a specific element is present in this Array or not.*/
import java.util.*;
public class Medium1 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = obj.nextInt();
        int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		
		for(int i = 0 ; i < size ; i++) {
			arr[i] = obj.nextInt();
			
		}
		System.out.print("Enter the key to find : ");
		int key = obj.nextInt();
		boolean isThere = false;
		for(int i = 0 ; i < size ; i++) {
			if(key == arr[i] ){
				isThere = true;
			}
		}
		System.out.println(isThere);
			
	}
}
