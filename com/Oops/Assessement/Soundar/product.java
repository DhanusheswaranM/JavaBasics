package com.Oops.Assessement.Soundar;
import java.util.*;

public class product {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int maximum = 0;
		System.out.println("Enter the value");
		while(true) {
			int input = sc.nextInt();
			if(input > 100) {
				continue;
			}
			if(input  == -1) {
				break;
			}
			if(input > maximum) {
				maximum = input;
			}
		}
		System.out.println("Maximum Price"+maximum);	
	}
}