package com.Function;

import java.util.*;
public class Medium2 {
public static void Prime(int min,int max) {
		
		for(int i=min;i<=max;i++) {
        int x=2;
		boolean temp = true;
		while(x<=i/2) {
			if(i%x==0) {
				temp = false;
			}
			x++;
		 }
		if(temp)
		 System.out.print(i+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the min  limit: ");
		int min = obj.nextInt();
		System.out.println("Enter the max limit: ");
		int max = obj.nextInt();
		Prime(min,max);
	
	}
}
