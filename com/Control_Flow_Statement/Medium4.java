package com.Control_Flow_Statement;
/*4. Write a program to calculate bill for Internet browsing. 
 * The conditions are: a. 1 hr 50 Rs. b. 1min 1 Re. c. 5 hrs 200 Rs. d. User can only browse maximum 7 hrs*/
import java.util.*;
public class Medium4 {
	public static void main(String args[]){
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the internet browsing time in\n1.Hours \n2.Minutes\nChoose the number that you that browsed for minutes or hours");
		int ch = obj.nextInt();
		int sum = 0 ;
		if(ch == 1) {
			System.out.println("Enter how many hours you have browsed : ");
			int hours = obj.nextInt();
			if(hours > 7) {
				System.out.println("The browsing time should not more than 7 hrs");
			}
			else {
				if(hours >= 5 && hours <= 7) {
					sum = 5*200;
					hours-=5;
				}
				if(hours<5) {
					sum += (hours*50);
				}
			}
		}
		else if(ch == 2) {
			System.out.println("Enter how many minutes that you have browsed : ");
			int min = obj.nextInt();
			if(min > 0 && min < 60) {
				sum = min;
			}
		}
		System.out.println("Your internet bill is : "+sum);
	}
}
