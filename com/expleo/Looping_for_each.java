package com.expleo;
import java.util.*;
public class Looping_for_each {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		/*int marks[]= {90,25,48,79,99};
		int max=marks[0];
		for(int index:marks) {
			if(index>max) {
				max=index;
			}
		}
		System.out.println("highest mark:"+max);*/
		String moviename[]= {"AAA","BBB","CCC","DDD"};
		String moviegenre[]= {"Action","Thriller","Horror","Action"};
		System.out.println("Enter the genre to be searched:");
		String genre=obj.next();
		int i=0;
		System.out.println(genre+" movies are");
		for(String M : moviegenre) {
			if(M.equals(genre)) {
				System.out.println(moviename[i]);
			}
			i++;
		}
	}
}
