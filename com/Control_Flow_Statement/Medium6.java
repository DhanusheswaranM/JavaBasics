package com.Control_Flow_Statement;
/**6. Calculate purchase amount to be paid after discount using if-else. 
 * Consider 10 % discount for the Sale amount above 1000 and 5% discount for the Sale amount less than 1000. 
 * Formula: 
 * Purchase Amount = price * quantity 
 * Discount Amount = Purchase amount * 0.10(10%) 
 * Paid Amount = Purchase Amount – Discount Amount*/
import java.util.*;
public class Medium6 {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the amount : ");
		float amount = obj.nextFloat();
		if(amount>=1000) {
			System.out.println("The purchase amount is "+amount+" and you have discount of 10% and you want to pay "+(amount-(amount*0.10)));
		}else {
			System.out.println("The purchase amount is "+amount+" and you have discount of 5% and you want to pay "+(amount-(amount*0.05)));
		}
	}
}
