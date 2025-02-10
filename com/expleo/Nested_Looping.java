package com.expleo;

public class Nested_Looping {
	public static void main(String args[]) {
		/*int seat=0,screen=0,maxseat=5,maxscreen=2;
		while(screen<maxscreen) {
			seat=0;
			System.out.println("The seat are in Screen:"+(screen+1));
			while(seat<maxseat) {
				System.out.println("the seat available:"+(maxseat-seat));
				seat++;
			}
			System.out.println("the seats are filled in screen:"+(screen+1));
			screen++;
		}
		System.out.println("-------nested while is completed----------");
		do {
			System.out.println("The seats are in screen:"+(screen+1));
			seat=0;
			do {
				System.out.println("the seat are available:"+(maxseat-seat));
				seat++;
			}while(seat<maxseat);
			System.out.println("the seat are filled in screen:"+(screen+1));
			screen++;
			
		}while(screen<maxscreen);
		System.out.println("-------nested do while is completed----------");
		int premiumseat=5,vipseat=5,seatbooked=0;
		for(seatbooked=0;seatbooked<(premiumseat+vipseat);seatbooked++) {
			if(seatbooked>premiumseat) {
				System.out.println("The premium seat are booked");
				System.out.println("The vip seat 1 to 5 are reserved");
				break;
			}
			else {
				System.out.println("Premium seat available:"+(premiumseat-seatbooked));
			}
		}
		System.out.println("-------nested for with break is completed----------");
		for(seatbooked=0;seatbooked<(premiumseat+vipseat);seatbooked++) {
			if(seatbooked>premiumseat) {
				System.out.println("The premium seat are booked");
				System.out.println("The vip seat 1 to 5 are reserved");
				continue;
			}
			else {
				System.out.println("Premium seat available:"+(seatbooked+1));
			}
		}
		System.out.println("-------nested for with continue is completed----------");*/
		int v=5,p=5,e=5,seatbooked=0;
		for(seatbooked=0;seatbooked>(p+v+e);seatbooked++) {
			if(seatbooked>v) {
				System.out.println("the vip seat 1 to 5 are booked");
				continue;
			}
			else if(seatbooked>(v+p)) {
				System.out.println("the premium seat is booked: "+(seatbooked+(v+p)));
			}
		}
	}
}
