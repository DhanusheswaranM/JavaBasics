package com.expleo;

import java.util.*;

public class ConditionalDemo {
	public static void main(String args[]) {
	Scanner obj=new Scanner(System.in);
	/*boolean seatavailable=false ;
	System.out.println("Enter the no of seats:");
	String seatno=obj.next();
	if(seatavailable) {
		System.out.println("Yes !! the seat is successfully booked "+seatno);
	}
	else {
		System.out.println("Sorry the seat is not booked "+seatno+" because the seat is already booked");
	}*/
	/*System.out.println("Enter the value:");
	int a=obj.nextInt();
	if(a==1) {
		System.out.println("The color is Blue !");
	}
	else if(a==2) {
		System.out.println("The color is Red !");
	}
	else {
		System.out.println("The color is Green !");
	}*/
	System.out.println("Type of seat Available\nREGULAR\nPREMIUM\nEXECUTIVE\nVIP");
	String stype=obj.next();
	if(stype.equals("REGULAR")) {
		System.out.println("You have choosed the REGULAR seat and the cost is Rs.100");
	}
	else if(stype.equals("PREMIUM")) {
		System.out.println("You have choosed the PREMIUM seat and the cost is Rs.200");
	}
	else if(stype.equals("EXECUTIVE")) {
		System.out.println("You have choosed the EXECUTIVE seat and the cost is Rs.300");
	}
	else if(stype.equals("VIP")) {
		System.out.println("You have choosed the VIP seat so the and is Rs.400");
	}
	else {
		System.out.println("Sorry there is no other seat that you have choosed");
	}
	}
}
