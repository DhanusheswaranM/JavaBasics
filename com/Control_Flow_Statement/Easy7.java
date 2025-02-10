package com.Control_Flow_Statement;

/*7. Write a program using if statement to check whether the blood donor is eligible or not for donating blood. The rules laid down are as follows.
a. Age should be above 18 yrs but less than 55 yrs.
b. Weight should be more than 45kg.*/
import java.util.*;
public class Easy7 {
	public static void main (String args[]) {
	Scanner obj=new Scanner (System.in);
	System.out.println("Enter the age of the donar");
	int age=obj.nextInt();
	System.out.println("Enter the weight of the donar");
	float weight=obj.nextFloat();
	if((age>=18 && age<=55) && (weight>=45)) {
		System.out.println("The donar is eligible to donate the blood!!!");
	}
	else {
		System.out.println("The donar is not eligible to donate the blood!!!");
	}
	}
}
