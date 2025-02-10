package com.expleo;

import java.util.Arrays;
import java.util.Scanner;
public class Array_Hard {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size for array1");
		int num1 = obj.nextInt();
		int arr1[]=new int[num1];
		System.out.println("Enter the size for array2");
		int num2 = obj.nextInt();
		int arr2[]=new int[num2];
		System.out.println("Enter the element in array1");
		for(int i=0;i<num1;i++) {
			arr1[i]=obj.nextInt();
		}
		System.out.println("Enter the element in array2");
		for(int i=0;i<num2;i++) {
			arr2[i]=obj.nextInt();
		}
		
		System.out.println("The 2 arrays are merged");
		int arr3[]=new int [num1+num2];
		for(int i=0;i<num1;i++) {
				arr3[i]=arr1[i];
		}
		for(int i=0;i<num2;i++) {
			arr3[num1+i]=arr2[i];
			
		}
		Arrays.sort(arr3);
		for(int a:arr3) {
			System.out.println(a);
		}
	}
}
