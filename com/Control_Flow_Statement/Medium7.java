package com.Control_Flow_Statement;

/*7. To input basic salary of an employee and calculate gross salary based on the condition given below 
 * using if-else-if ststement: 
 * Basic Salary <= 10000 : HRA = 20%, DA = 80% 
 * Basic Salary is between 10001 to 20000: HRA = 25%, DA = 90% 
 * Basic Salary >= 20001 : HRA = 30%, DA = 95% 
 * Gross Salary=Basic Salary + HRA + DA*/
import java.util.*;
public class Medium7 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the salary");
		float salary=obj.nextFloat();
		double hra = 0,da = 0;
		if(salary <= 10000) {
			hra = 0.20 * salary;
			System.out.println(hra);
			da = 0.80 * salary;
			System.out.println(da);
			System.out.println("Gross salary is "+(salary + hra + da));
		}
		else if(salary >= 10001 && salary <= 20000) {
			hra = 0.25 * salary;
			da = 0.90 * salary;
			System.out.println("Gross salary is "+(salary + hra + da));
		}
		else {
			hra = 0.30 * salary;
			da = 0.95 * salary;
			System.out.println("Gross salary is "+(salary + hra + da));
		}
	}
}	
