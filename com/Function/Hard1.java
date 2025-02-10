package com.Function;

/*1. XYZ Technologies is in the process of increment the salary of the employees. 
 * This increment is done based on their salary and their performance appraisal rating.
a. If the appraisal rating is between 1 and 4, the increment is 10% of the salary.
b. If the appraisal rating is between 4.1 and 7, the increment is 25% of the salary.
c. If the appraisal rating is between 7.1 and 10, the increment is 30% of the salary.
Help them to do this, by writing a program that displays the incremented salary.
(Use separate function to calculate the increment)
Note : If either the salary is 0 or negative (or) if the appraisal rating is not in the range 1 to 10 (inclusive), then the output should be “Invalid Input”.
Sample Input 1 :
Enter the salary 80000
Enter the appraisal rating 3
Sample Output 1 :
88000
Sample Input 2 :
Enter the salary 75000
Enter the Performance appraisal rating 4.3
Sample Output 2 :
93750*/
import java.util.*;
public class Hard1 {
	public static void CalculateAppraisal(double salary, float appraisal) {
		if(salary > 0) {
			if(appraisal >= 1 && appraisal <= 4) {
				System.out.println(salary+(salary*0.10));
			}
			else if(appraisal >= 4.1 && appraisal <= 7) {
				System.out.println(salary+(salary*0.25));
			}
			else if(appraisal >= 7.1 && appraisal <= 10) {
				System.out.println(salary+(salary*0.30));
			}
			else {
				System.out.println("Invalid");
			}
		}
	}
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the salary : ");
		double salary = obj.nextDouble();
		System.out.println("Enter the appraisal : ");
		float appraisal = obj.nextFloat();
		CalculateAppraisal (salary, appraisal);
	}
}
