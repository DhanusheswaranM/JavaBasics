package com.Array;


import java.util.*;

public class Hard1 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the no of childern : ");
        int size = obj.nextInt();
        int arr[]=new int[size];
        int totalchocolate=0;
       
		System.out.println("Enter the chocolates with each children: ");
		for(int i=0;i<size;i++) {
			arr[i] = obj.nextInt();
			totalchocolate +=arr[i];
		}

		if(totalchocolate%size==0) {
			System.out.print("yes!! chocolate can be equally shared ");
		}
		else {
			System.out.print("No!! chocolate cannot be shared equally ");
		}
	}
}
