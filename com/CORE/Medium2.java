package com.CORE;
/*2.Write a C# program to generate password from first name and last name. 
 * password includes 1st three character in first name, last three character in last name and length of first and last name.*/
import java.util.*;
public class Medium2 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the 1st name :");
		String firstname = obj.nextLine();
		System.out.println("Enter the 2nd name :");
		String secondname = obj.nextLine();
		int len = firstname.length() +secondname.length();
		System.out.println(firstname.substring(0,3) + secondname.substring(((secondname.length())-3),(secondname.length())) + len);
	}
}
