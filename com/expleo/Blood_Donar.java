package com.expleo;
import java.util.*;
public class Blood_Donar {
	public static void main(String args[]) {
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
