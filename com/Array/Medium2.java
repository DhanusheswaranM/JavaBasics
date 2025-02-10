package com.Array;
/*2. Roll the dice 100 times and display the frequency of each number rolled using arrays.*/
import java.util.*;
public class Medium2 {
  public static void main(String[] args) {      
	   int[] fre = new int[10];
	   Random random = new Random();
                 for (int i = 0; i < 100; i++) {
	         int roll = random.nextInt(10) + 1; 
	         fre[roll - 1]++;
	   }
	   System.out.println("Frequency of numbers rolled:");
	   for (int i = 0; i < fre.length; i++) {
	       System.out.println((i + 1) + ": " + fre[i]);
	  } 
	}
}

