package com.Control_Flow_Statement;

/*10. Write a program to print the following number pattern 
Sample I/O 
Enter the N value: 5 
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5  */
import java.util.*;
public class Easy10 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=obj.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}
