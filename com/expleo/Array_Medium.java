package com.expleo;
/*6. Mark enters randomly twenty five numbers from the keyboard and stores it into an array. 
 * He wants to search if the number is present in the array and if it is present, 
 * he needs to display the number of times it appears in the array.*/
import java.util.*;
public class Array_Medium {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int arr[]= {1,5,7,8,9,6,55,44,77,88,33,44,222,22,22,55,88,66,66,88,99,33,100,54,1001,55};
		System.out.println("Enter the number that u want to search:");
		int num = obj.nextInt();
		int count = 0;
		
		for(int i = 0;i < arr.length;i++) {
			
			if(num == arr[i]) {
				count++;
			}
		}
		
		if(count > 0) {
			System.out.println(num+" has repeated " +count+ " time in array");
		}
		
		else {
			System.out.println(num+" number is not present in the array");
		}
	}
}
