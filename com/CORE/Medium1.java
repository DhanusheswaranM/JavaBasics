package com.CORE;
/*1.In a real-time conferencing, there is a delay in getting the 3rd word of the text message received. 
 * To overcome this issue, the word “... Pls wait “is inserted as the third word in the given message.
 *  Write a code to fix it.*/
import java.util.*;
public class Medium1 {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		String s = obj.nextLine();
		String[] a = s.split("\\s+");    // splitting by space
		for(int i = 0 ;i < a.length ; i++) {
			if(i==2){
				System.out.println("\n...Pls wait");
			}
				System.out.print(a[i]+" ");
			
			
		}
	}
}