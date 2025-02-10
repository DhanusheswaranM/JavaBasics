package com.Function;
import java.util.*;
public class Hard2 {
	public static void CalculateHighest(int cs,int ec, int me) {
		if(cs < 0 || ec < 0 || me < 0) {
			System.out.println("Input is invalid");
		}
		else if( cs == ec && ec == me) {
			System.out.println("None of the department has got the highest placement");
		}
		else if (cs == ec && cs > me) {
			System.out.println("Highest placement CS EC");
		}
		else if (cs == me && cs > ec) {
			System.out.println("Highest placement CS ME");
		}
		else if (me == ec && me > cs) {
			System.out.println("Highest placement ME EC");
		}
		else {
			if(cs > ec) {
				if(cs > me) {
					System.out.println("Highest placement CS");
				}
				else {
					System.out.println("Highest placement ME");
				}
			}
			else {
				System.out.println("Highest placement EC");
		}
	}
}
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the no of students placed in CS:");
		int cs=obj.nextInt();
		System.out.println("Enter the no of students placed in EC:");
		int ec=obj.nextInt();
		System.out.println("Enter the no of students placed in ME:");
		int me=obj.nextInt();
		CalculateHighest(cs,ec,me);
		
	}
	
}
		

