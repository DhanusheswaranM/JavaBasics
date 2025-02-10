package com.Oops.Assessement.Soundar;

import java.util.*;
public class Amicable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum=0,sum1=0;
		if(x > 0 || y > 0 ) {
		
		for(int i=1;i<x;i++) {
			
			if(x % i == 0) {
				sum = sum + i;
			}
		}
		for(int j=1;j<y;j++) {
			
		if(y % j == 0) {
			sum1 = sum1 + j;
		}
		}
		
		if(sum == y && sum1 == x) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		}
	else {
		System.out.println("false");
	}
	}

}