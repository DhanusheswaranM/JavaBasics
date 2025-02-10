package com.Array;

import java.util.*;
public class Medium5 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = obj.nextInt();
        int data[]=new int[size];
        int count[]=new int[100];
		System.out.println("enter the array elements: ");
		for(int i=0;i<size;i++) {
			data[i] = obj.nextInt();
			count[data[i]]++;
		}
		
		for(int i=0;i<100;i++) {
			if(count[i]>0) {
				System.out.println( i+" : "+count[i]);
			}
		}
	}
}
