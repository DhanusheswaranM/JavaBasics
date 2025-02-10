package com.Array;
/*5. Given an n-dimensional array A[]. The aim is to identify the greatest element therein.*/
import java.util.Scanner;
public class Easy5 {
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
		System.out.print("The maximum element in the array : "+arr[num-1]);
	}
}