package com.expleo;
import java.util.*;
public class Character {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a single character that want");
		char a=obj.next().charAt(0);
		if((a>='a' && a<='z') || (a>='A' && a<='Z')) {
			System.out.println("You have enter the alphabet letter "+a);
		}
		else if((a>='0') && (a<='9')) {
			System.out.println("You have entered the digit "+a);
		}
		else {
			System.out.println("You have entered the Special character "+a);
		}
	}
}
