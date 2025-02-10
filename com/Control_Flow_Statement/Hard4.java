package com.Control_Flow_Statement;
/*4. A cloth showroom has announced the following festival discounts on the purchase of items based on the total cost of the items purchased:

Less than Rs. 2000
5%
Rs. 2000 to less than Rs. 5000
25%
Rs. 5000 to less than Rs. 10,000
35%
Rs. 10,000 and above
50%
Write a program to input the total cost and to compute and display the amount to be paid by the customer availing the discount.*/
import java.util.*;
public class Hard4 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		double amount = obj.nextDouble();
		if(amount < 2000) {
			System.out.println(amount - (amount * 0.05));
		}
		else if(amount >= 2000 && amount < 5000) {
			System.out.println(amount - (amount * 0.25));
		}
		else if(amount >= 5000 && amount < 10000) {
			System.out.println(amount - (amount * 0.35));
		}
		else {
			System.out.println(amount - (amount * 0.50));
		}
	}
}
