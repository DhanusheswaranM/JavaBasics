package com.Control_Flow_Statement;
/*5. Write a program that reads continuously a month number (1 = Jan, 12 = Dec), the day that the month begins (1 = Mon, 7 = Sun), and displays the calendar for that month. 
 * If the selected month is February, the program should prompt the user to enter the month’s number of days, that is, 28 or 29. 
 * If the given month is out of [1, 12], the program should terminate program:*/
import java.util.Scanner;
public class Medium5 {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the month number : ");
		int month = obj.nextInt();
		int days_num=0;
		System.out.print("Enter the starting day of the month: ");
		int start = obj.nextInt();
		
		if(month==2) {
			System.out.print("enter the number of days in feb(28/29)");
			days_num = obj.nextInt();
		}
		else {
			if(month==1 || month==3|| month==5||month==7||month==8||month==10||month==12) {
				days_num=31;
			}
			else if(month==4||month==6||month==9||month==11) {
				days_num=30;
			}
			else {
				System.out.println("Month is not sufficient ");
				
			}
		}
		
		System.out.println("M T W T F S S");
		int mat[][]=new int[4][7];
		int k=1;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i==0 && j< start-1) {
					continue;
				}
				mat[i][j]=k;
				k++;
			}
		}
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i==0 && j< start-1) {
					System.out.print("- ");
					continue;
				}
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}	
		
	}
}

