package com.Function;

/*4. Write a function to find whether the blood donor is eligible or not for donating blood. 
The rules laid down are as follows.
a. Age should be above 18 yrs but not more than 55 yrs.
b. Weight should be more than 45kg.*/
import java.util.*;
public class Medium4 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = obj.nextInt();
		System.out.println("Enter the weight:");
		float wei = obj.nextFloat();
		boolean a=Age(age);
		boolean b=Weight(wei);
		if(a == true && b == true) {
			System.out.println("You are eligible to donate blood");
		}
		else if(a == true && b== false) {
			System.out.println("You are not eligible to donate blood, because you have not sufficient weight");
		}
		else if(a == false && b== true) {
			System.out.println("You are not eligible to donate blood, because you have not sufficient age");
		}
			else {
			System.out.println("You are not eligible to donate blood, because you have not sufficient age and sufficient weight");
		}
		
	}
	public static Boolean Age(int age) {
		return (age >= 18 && age <=55) ;
			
	}
	public static Boolean Weight(float wei) {
		return (wei>45);
	}
}
		
