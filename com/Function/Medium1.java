package com.Function;

import java.util.Scanner;
public class Medium1 {
	public static void OddEven(int num) {
		int oddcount=0;
		int evencount=0;
		for(int i = 1;i <= num ; i++) {
			if (i%2 == 0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.print("odd: "+ oddcount +" even: "+ evencount);
		System.out.println("\nabsolute diff b/w odd and even count: "+ ((oddcount > evencount) ? (oddcount - evencount) : (evencount - oddcount)));
		
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = obj.nextInt();
		
		OddEven(num);
	}

	
}
