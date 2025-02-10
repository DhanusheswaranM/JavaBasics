package com.expleo;
import java.util.*;
public class Nested_if {
	public static void main (String args[]) {
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the age:");
		int age=obj.nextInt();
		System.out.println("Enter the weight:");
		int wei=obj.nextInt();
		if(age>18) {
			if(wei>50) {
				System.out.println("The person is eligible to donate blood");
			}else {
				System.out.println("The person is not eligible to donate blood because you are under weight ");
			}
		}
		else {
			System.out.println("The person is not eligible to donate blood because you are under age and under weight ");
		}
	}
}

