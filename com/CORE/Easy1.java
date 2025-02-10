package com.CORE;
/*1.Write a program to encrypt the text “INDIA” to “KPFKC” and 
 * decrypt “KPFKC” to get the original string “INDIA”.*/
import java.util.*;
public class Easy1 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = obj.nextLine();
		char a[] = s.toCharArray();
		int UCcount = 0 ;
		for( int i = 0 ; i < a.length ; i++) {
			if( a[i] >= 'O' && a[i] <='Z') {
				UCcount++;
				break;
			}
		}
		if(UCcount == 0) {
			for(int i = 0 ; i < a.length ; i++) {
				System.out.print((char)(a[i]+2));
				}
		}
		else if(UCcount != 0) {
			for(int i = 0 ; i < a.length ; i++) {
				System.out.print((char)(a[i]-2));
				}
		}
	}
}
