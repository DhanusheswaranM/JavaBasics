package com.Array;

import java.util.*;
public class Hard3 {
	    public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        ArrayList<Integer> arr = new ArrayList<>();
	        System.out.print("enter the elements: ");
	        while (true) {
	            int num = obj.nextInt();
	            if (num < 0) {
	                
	            	break;
	            }
	            arr.add(num);
	        }
	        
	        modifyArray(arr);
	        
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	    public static void modifyArray(ArrayList<Integer> arr) {
	        for (int i = 0; i < arr.size(); i++) {
	            int num = arr.get(i);
	            if (num % 7 == 0 && num % 8 == 0) {
	                arr.set(i, -6);  
	            } else if (num % 7 == 0) {
	                arr.set(i, -2); 
	            } else if (num % 8 == 0) {
	                arr.set(i, -9);
	            }
	        }
	    }
	}

