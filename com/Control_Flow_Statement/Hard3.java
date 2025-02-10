package com.Control_Flow_Statement;

/*3. Ana planned to choose the four digit lucky number for her car. 
 * Her lucky numbers are 3, 5 and 7 Help her to find the number, 
 * whose sum is divisible by 3 or 5 or 7. 
 * Provide a valid car number, Fails to provide a valid input then display that number is not a valid car number.*/
import java.util.*; 

public class Hard3 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		String s=obj.next();
		int num = Integer.parseInt(s);
		int a = num;
		int length = String.valueOf(s).length();
		if(length == 4) {
			int res = 0;
			while(a > 0) {
				res += a % 10;
				a /= 10;
			}
			
			if(res % 3 == 0 || res % 5 == 0 || res % 7 == 0 ) {
				System.out.println(num+" It is lucky number");
			}
			else {
				System.out.println(num+" It is not a lucky number");
			}
		}
		else{
			System.out.println(num+" It is not a valid car number");
		}
	}
}	
