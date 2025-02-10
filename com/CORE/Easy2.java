package com.CORE;
/*2.A string S is passed as the input. 
 * S can contain alphabets, numbers and special characters. 
 * The program must print only the alphabets in S.*/
import java.util.*;
public class Easy2 {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the String with combination all keys in key board");
		String s = obj.nextLine();
		char a[] = s.toCharArray();
		for(int i = 0 ; i < a.length ;i++) {
			if((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A' && a[i] <= 'Z')) 
				System.out.print(a[i]);
		}
	}
}