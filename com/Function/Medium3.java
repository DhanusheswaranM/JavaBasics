package com.Function;

import java.util.*;
public class Medium3 {
	public static void payment(int hour) {
		int ot = hour-40;
		float pay = ot*15;
		System.out.print("over time pay for 5 employees are:"+ pay*5);
		
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the hours: ");
		int hour = obj.nextInt();
		
		payment(hour);
	}
	
}

