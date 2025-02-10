package com.expleo;
import java.util.*;
public class Employee {
	public static void main(String args[]) {
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the employee details");
		System.out.println("enter the employee name:");
		String name=obj.next();
		System.out.println("enter the employee daily wages:");
		int wage=obj.nextInt();
		System.out.println("enter the employee no of working days:");
		float noofdays=obj.nextFloat();
		System.out.println("EMPLOYEE NAME: "+name+"\nEMployee NO OF DAYS WORKED: "+noofdays);
		System.out.println("THE EMPLOYEE SALARY: " +(wage*noofdays));
	}
}
