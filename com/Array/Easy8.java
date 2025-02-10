package com.Array;
/*8. Write a program to find the missing number in a given integer array of 1 to 100.*/
import java.util.*;
public class Easy8 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = obj.nextInt();
        int arr[] = new int[size];
		
		System.out.println("Enter the array elements: ");
		int sum = 0;
		for(int i=0;i<size;i++) {
			arr[i] = obj.nextInt();
			sum += arr[i];
		}
		int val=((arr.length)*(arr.length+ 1))/2;
		System.out.print("missing element: "+ (sum-val+1));
	}
}
