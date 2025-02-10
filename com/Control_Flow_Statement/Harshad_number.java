package com.Control_Flow_Statement;
import java.util.*;
public class Harshad_number {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=obj.nextInt(),res=0,a=num;
		while(num > 0) {
			res += num%10;
			num /= 10;
			}
		if(a % res == 0) {
			System.out.println("It is harshad number");
		}else {
			System.out.println("It is not harshad number");
			}
		}
	}

