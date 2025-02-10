package com.expleo;
import java.util.*;
public class Looping_do_while {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int maxseat=10;
		System.out.println("Enter the seat number:");
		int seat=obj.nextInt();
		do {
			System.out.println("The seats available:"+(maxseat-seat));
			seat++;
		}
		while(seat<maxseat);
			System.out.println("The seats are filled");
	}
}
