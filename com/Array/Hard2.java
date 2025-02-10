package com.Array;
/*Arun and Naveen are playing a dice game. Each one will get one chance to roll the dice. 
 * Dice values are recorded in two different tables. 
 * After 10 turns, the winner has to be decided by calculating each value recorded in each table.*/
import java.util.*;
public class Hard2 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int arundice[] = new int [10];
		int naveendice[] = new int [10];
		int aruncount=0,naveencount=0,draw=0;
		
		System.out.println("Enter the array for arun dice : ");
		for(int i = 0 ; i < arundice.length ; i++) {
			arundice[i] = obj.nextInt();
		}
		
		System.out.println("Enter the array for naveen dice : ");
		for(int i = 0 ; i < naveendice.length ; i++) {
			naveendice[i] = obj.nextInt();
		}
		
		for(int i = 0 ;i < arundice.length || i < naveendice.length ; i++) {
			if(arundice[i] > naveendice[i] ) 
				aruncount++;
			else if( naveendice[i] > arundice[i] )
				naveencount++;
			else
				draw++;
				
		}
		System.out.println("The arunpoint : "+aruncount+"\n"+"The naveenpoint : "+naveencount);
		if(aruncount > naveencount) 
			System.out.println("Arun wins !!!!!");
		else
			System.out.println("Naveen wins !!!!!");
		
		
	}
}
