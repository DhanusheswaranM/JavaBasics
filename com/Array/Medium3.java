package com.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;
public class Medium3 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = obj.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i] = obj.nextInt();
		}
		Arrays.sort(arr);
		ArrayList<Integer> al=new ArrayList<>();
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<size-1;i++) {
			if(arr[i+1]==arr[i]){
				al.add(arr[i]);
			}
			h.add(arr[i]);
		}
		h.add(arr[size-1]);
		System.out.println("duplicate elements: " );
		for(int val: al) {
			System.out.print(val+" ");
		}
		System.out.println("\nunique elements: " );
		for(int val: h) {
			System.out.print(val+" ");
		}
		
	}
}
