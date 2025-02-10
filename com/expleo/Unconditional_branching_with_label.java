package com.expleo;

public class Unconditional_branching_with_label {
	public static void main(String args[]) {
		int maxseat=10,totalscreen=2,seat=0,screen=-1;
		Start:
			while(screen<totalscreen) {
				screen++;
				System.out.println("screen "+(screen)+" Seat booked detail");
				seat=0;
				while(seat<maxseat) {
					if(seat>=3 && screen==1) {
						System.out.println("seat 4&5 are reserved");
						continue Start;
					}
					else {
						System.out.println("seat no booked:"+(seat+1));
						seat++;
					}
				}
				System.out.println("All seats are filled in screen " +(screen+1));
			}
			
	}
}
