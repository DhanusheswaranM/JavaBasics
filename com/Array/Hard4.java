package com.Array;


import java.util.Arrays;
import java.util.Scanner;
public class Hard4 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size for array1");
		int num1 = obj.nextInt();
		int arr1[]=new int[num1];
		System.out.println("Enter the size for array2");
		int num2 = obj.nextInt();
		int arr2[]=new int[num2];
		System.out.println("Enter the size for array3");
		int num3 = obj.nextInt();
		int arr3[]=new int[num3];
		System.out.println("Enter the element in array1");
		for(int i=0;i<num1;i++) {
			arr1[i]=obj.nextInt();
		}
		System.out.println("Enter the element in array2");
		for(int i=0;i<num2;i++) {
			arr2[i]=obj.nextInt();
		}
		System.out.println("Enter the element in array3");
		for(int i=0;i<num3;i++) {
			arr3[i]=obj.nextInt();
		}
		
		System.out.println("The 3 arrays are merged");
		int arr4[]=new int [num1+num2+num3];
		for(int i=0;i<num1;i++) {
				arr4[i]=arr1[i];
		}
		for(int i=0;i<num2;i++) {
			arr4[num1+i]=arr2[i];
			
		}
		for(int i=0;i<num3;i++) {
			arr4[num1+num2+i]=arr3[i];
		}
		Arrays.sort(arr4);
		for(int a:arr4) {
			System.out.println(a);
		}
	}
}
