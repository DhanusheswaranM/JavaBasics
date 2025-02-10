package com.Control_Flow_Statement;

/*2. Mark is purchasing certain glossary items in a supermarket. 
 * While purchasing certain items, a discount of 15% is offered to him if the quantity purchased is more than 500. Help, Mark to calculate the total expenses.
 */
import java.util.*;
public class Medium2 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the amount");
		int num=obj.nextInt();
		double dis=0.15;
		if(num>500) {
			System.out.println("The total expense is "+(num-((float)num*dis)));
		}else {
			System.out.println("The total expense is "+num);
		}
	}
}
