package com.Oops;

import java.util.*;
class Tollbooth{
	int noofvehicle;
	double total;
	int payed ;
	int notpayed ;
	
	Tollbooth(){
		noofvehicle = 0 ;
		total = 0 ;
		payed = 0;
		notpayed = 0;
	}
	void payingVehicle() {
		noofvehicle++ ;
		total += 0.50 ;
		payed ++ ;
	}
	void nopayingVehicle() {
		noofvehicle++ ;
		notpayed++ ;
	}
	
	void displayVehicleDetails() {
		System.out.println("The no of vehicle passed : "+noofvehicle);
		System.out.println("The total amount collected : "+total);
		System.out.println("The no of payed vehicle : "+payed);
		System.out.println("The no of not payed vehicle : "+notpayed);
		System.out.println("amount sortage is :"+((noofvehicle*0.50)-total));
	}
}

public class TollBoothCollection {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		Tollbooth toll = new Tollbooth();
		int ch;
		do {
			System.out.println("Enter the vehicle details:");
			System.out.println("1.Paying Vehicle\n2.Not Paying Vehicle\n3.Display the details of the vehicle passed through the toll\n---Choose any one for your convinent---");
			ch = obj.nextInt();
			if(ch == 1) {
				toll.payingVehicle();
			}
			else if(ch == 2) {
				toll.nopayingVehicle();	
			}
			else if(ch == 3) {
				toll.displayVehicleDetails();
				break;
			}
			else {
				System.out.println("You have not choosen the sufficient option");
			}
			
		}while(ch >= 1 && ch <= 3);
	}
}
