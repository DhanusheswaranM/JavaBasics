package com.Array;
/*4. Write a program to find the frequency of each element in the array*/
import java.util.*;
public class Easy4 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int size = obj.nextInt();
		int arr[] = new int[size];
		int fre[] = new int[128];
		System.out.println("Enter the elements in the array : ");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = obj.nextInt();
			fre[arr[i]]++;
		}
		for(int j = 0 ; j < fre.length ;j++) {
			if(fre[j] > 0) {
				System.out.println(j+" : "+fre[j]);
			}
		}
	}
}
