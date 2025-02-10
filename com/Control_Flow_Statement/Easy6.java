package com.Control_Flow_Statement;

/*6. Write a program that reads an integer continuously and displays "Hello" as many times as the value of the integer. If the user enters a negative number, the insertion of integers should end and the program should display the total number of the displayed "Hello".*/
import java.util.*;
public class Easy6 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int count=0,num=0;
		do {
			System.out.println("Enter the number");
			num=obj.nextInt();
			count++;
			System.out.println("hello");
		}while(num > 0 );
		System.out.println("the count of hello is:"+count);
	}
}
