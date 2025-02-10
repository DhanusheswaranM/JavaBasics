package com.expleo;
import java.util.*;
public class Switch_case {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Type of seat Available\nREGULAR\nPREMIUM\nEXECUTIVE\nVIP\nChoose anyone of them!!!");
		String stype=obj.next();
		switch (stype) {
		case "PREMIUM":{
			System.out.println("you have entered the PREMIUM type");
			break;
		}
		case "VIP":{
			System.out.println("you have entered the VIP type");
			break;
		}
		case "REGULAR":{
			System.out.println("you have entered the REGULAR type");
			break;
		}
		case "EXECUTIVE":{
			System.out.println("you have entered the EXECUTIVE type");
			break;
		}
		default :{
			System.out.println("no seat is available");
			break;
		}
		}
	}
}
