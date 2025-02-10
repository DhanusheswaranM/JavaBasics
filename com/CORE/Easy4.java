package com.CORE;
/*4. Write a program to input a string in uppercase and print the occurrence of each character.*/
import java.util.*;
public class Easy4 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the string in capital letter");
		String str = obj.nextLine();
		System.out.println("Enter the character that find the occurrance of the character : ");
		char ch = obj.next().charAt(0);
		int count = Occurrance(str , ch);
		System.out.println("The character "+ch+" that have repeated "+count+" times");
	}
	public static int Occurrance(String str, char ch) {
		int count = 0 ;
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count ;
	}
}
