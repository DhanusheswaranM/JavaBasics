package com.Oops;

public class Garbage_collector {
	public static void main(String args[]) {
		Garbage_collector obj = new Garbage_collector();
		obj.finalize();
		System.gc();  // Requesting JVM for running Garbage Collector
		System.out.println("Inside the main() method");
	}
	@Override
	protected void finalize() {
		System.out.println("Object is destroyed by the Garbage Collection");
	}
}