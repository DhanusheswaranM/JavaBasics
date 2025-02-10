package com.Oops;

class Adder{
	static int add(int a, int b) {
		return a + b;
	}
	static double add(double a, double b) {
		return a + b;
	}
}
public class Overloading {  // compile time
	public static void main(String args[]) {
		
		System.out.println("The integer add method : "+Adder.add(10 , 50));
		System.out.println("The double add method : "+Adder.add(15.22 , 50.361));
		System.out.println("The double -> int add method : "+(int)Adder.add(15.22 , 50.361));
	}
}
