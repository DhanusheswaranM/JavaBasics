package com.Function;

import java.util.*;
public class Easy3 {
	public static float hike(float salary,float hike) {
		return salary+(salary*hike/100);
	}
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the salary: ");
		float salary = obj.nextFloat();
		System.out.print("Enter the hike: ");
		float hike = obj.nextFloat();
		float pay = hike(salary,hike);
		System.out.print("Final salary: "+pay);
	}	
}

