package com.Control_Flow_Statement;
/*9. To check whether the given number is Armstrong number or not. 
 * Note: Armstrong number is 3 digit number, the sum of cubes of each digit is equal to the number itself.*/
import java.util.*;
public class Medium9 {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the number : ");
		String num = obj.next();
		int a = Integer.parseInt(num),len=num.length(),res=0,b=a;
		
		while (a > 0) {
			res+=Math.pow((a%10), len);
			a/=10;
		}
		if(res == b) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("Not Amstrong number");
		}
	}

}
