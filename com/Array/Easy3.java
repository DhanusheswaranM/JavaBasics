package com.Array;
/*3. Find max or min value in an array of primitives*/
import java.util.*;
public class Easy3 {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the no of elements : ");
		int num = obj.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the elements in the array : ");
		for(int i = 0 ; i < num ; i++) {
			arr[i] = obj.nextInt();
		}
		for(int i = 0 ; i < num ; i++) {
			for(int j = i+1 ; j< num ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The minimum element in the array : "+arr[0]);
		System.out.print("The maximum element in the array : "+arr[num-1]);
	}
}