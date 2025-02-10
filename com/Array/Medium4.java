package com.Array;

import java.util.HashSet;
import java.util.*;
public class Medium4 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = obj.nextInt();
        int arr[]=new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=obj.nextInt();
		}
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<size;i++) {
			h.add(arr[i]);
		}
		System.out.println("The unique elements are: ");
		for(int val:h) {
			System.out.print(val+" ");
		}
		
	}
}
