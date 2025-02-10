package com.Array;
/*6. Write a program to find the duplicate number on a given integer array.*/
import java.util.Arrays;
import java.util.Scanner;

public class Easy6 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = obj.nextInt();
        int arr[]=new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = obj.nextInt();
		}
		Arrays.sort(arr);
		int i = 0;
		for( ; i < size-1 ; i++) {
			if(arr[i] == arr[i+1]) {
				break;
			}
		}
		System.out.print("Duplicate element: "+arr[i]);
	}
}
