package com.Control_Flow_Statement;
/*5. Sam teaches his student to find the factorial of a number. 
 * He wanted to test the understanding of the student. 
 * For that, he provides a number. He wants the students to tell him that number is a factorial of which number. 
 * Help the student by writing a program to do this.
Note that the input should be a number greater than zero. 
If the input is less than or equal to zero, the output should be “Invalid Input”. 
Also, if the input provided is not exactly the factorial of a number, say, the input provided is 122, which is not a perfect factorial of a number; it should return “Sorry. The given number is not a perfect factorial*/
import java.util.*;
public class Hard5 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = obj.nextInt();
		int fact=1,a=1;
		if(num <= 0) {
			System.out.println("Invalid");
		}
		else {
			while(fact < num) {
				a++;
				fact*=a;
			}
			if(fact == num)
				System.out.println(a);
			else
				System.out.println("Sorry. The given number is not a perfect factorial");
		}
		}
	}
