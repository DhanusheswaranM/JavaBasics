package com.Control_Flow_Statement;
/*4. Write a program using do-while loop to evaluate the series 1+2+3+…..+i.*/
import java.util.*;
public class Easy4 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=obj.nextInt(),a=1,res=0;
		do {
			res+=a;
			a++;
		}while(num>=a);
		System.out.println(res);
	}
}

