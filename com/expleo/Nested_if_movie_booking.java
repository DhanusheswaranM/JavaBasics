package com.expleo;
import java.util.*;
public class Nested_if_movie_booking {
	public static void main(String args[]) {
		Scanner obj=new Scanner (System.in);
		boolean seatAvailable=true;
		String username="DhanusheswaranM";
		int password=12345;
		System.out.println("Enter the username:");
		String user=obj.next();
		System.out.println("Enter the password:");
		int pass=obj.nextInt();
		if(user.equals(username) && pass==password) {
			if(seatAvailable) {
				System.out.println("Your seat is available");
			}else {
				System.out.println("Your seat is not available");
			}
		}else {
			System.out.println("You have entered the incorrect useraname/password");
		}
	}
}
