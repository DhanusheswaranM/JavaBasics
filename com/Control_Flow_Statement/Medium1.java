package com.Control_Flow_Statement;

/*1. Keeping in mind there are 86400 seconds per day, 
 * write a program that calculates how many seconds there are in a week if a week is 7 days.*/
import java.util.*;
public class Medium1 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of days");
		int num=obj.nextInt();
		int sec=86400;
		System.out.println("One day has 86400sec So there is "+(num*sec)+" seconds in "+num+" days");
	}
}
