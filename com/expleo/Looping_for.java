package com.expleo;
import java.util.*;
public class Looping_for {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int maxseat=10;
		System.out.println("Enter the seat for for loop");
		
		int seat=obj.nextInt();
		for(int i=seat;i<maxseat;i++) {
			System.out.println("seat is:"+(maxseat-i));
		}
	}
}
