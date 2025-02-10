package com.Oops;
class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Truck extends Vehicle{
	void run() {
		System.out.println("Truck is running");
	}
}
public class Overriding {
	public static void main(String args[]) {
		Vehicle vec = new Vehicle();
		Vehicle tru = new Truck();//up casting
		vec.run();
		tru.run();
	}
}