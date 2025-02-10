package com.expleo;
import java.util.*;
public class Looping_While {//entry control
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int maxseat=10;
		System.out.println("Enter the seat number:");
		int seat=obj.nextInt();
		while(seat<maxseat) {
			System.out.println("Seats are available:"+(maxseat-seat));
			seat++;
		}
		System.out.println("The seats are filled");
	}
}
