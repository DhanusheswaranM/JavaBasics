package com.Control_Flow_Statement;
/*3. Write a program to calculate bill of a job work done as follows by using if-else statement.
a. Rate of typing 3 Rs. per page
b. Printing of 1s copy Rs. per page and later every copy 3 Rs. per page.*/
import java.util.*;
public class Medium3 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the how many pages to type : ");
		int pagetype = obj.nextInt();
		System.out.println("Enter the how many copies do you want : ");
		int pagecopy = obj.nextInt();
		int pagetypeRs=3,pagecopyRs=0;
		if(pagecopy == 1) {
			pagecopyRs=1;
			System.out.println("The amount is : "+((pagetype*pagetypeRs)+(pagetype*((pagecopy-1)*pagecopyRs))));
		}
			
			else {
				pagecopyRs=3;
				System.out.println("The amount is : "+((pagetype*pagetypeRs)+(pagetype*((pagecopy-1)*pagecopyRs))));
			}
	}

}
