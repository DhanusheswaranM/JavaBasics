package com.Control_Flow_Statement;

/*9. Write a program to print sum of digits of a given number.*/
import java.util.*;
public class Easy9 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=obj.nextInt(),result=0;
		while(num>0) {
			result+=(num%10);
			num/=10;
		}
		System.out.println(result);
	}
}
