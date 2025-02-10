package com.Control_Flow_Statement;

/*1. Write a program to get employee details, wages and number of days worked from user and find total salary.*/
import java.util.*;
public class Easy1 {
	public static void main (String args[]) {
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the employee details");
		System.out.println("enter the employee name:");
		String name=obj.next();
		System.out.println("enter the employee daily wages:");
		int wage=obj.nextInt();
		System.out.println("enter the employee no of working days:");
		float noofdays=obj.nextFloat();
		System.out.println("EMPLOYEE NAME: "+name+"\nEmployee NO OF DAYS WORKED: "+noofdays);
		System.out.println("THE EMPLOYEE SALARY: " +(wage*noofdays));
	}
}

