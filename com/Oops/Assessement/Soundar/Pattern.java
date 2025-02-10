package com.Oops.Assessement.Soundar;


import java.util.Scanner;

public class Pattern {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	
	int n = sc.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++) {
			System.out.print("* ");	
		}
		System.out.println();
		if(i == n-1) {
			for(int m = 2;m<= n;m++) {
				for(int k=1;k <= m;k++) {
					System.out.print("* ");	
				}
				System.out.println(); 
		}
	}
	
}
	
}
}