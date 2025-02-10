package com.Oops;
/*class Sample{
	final double pi  = 3.14159;
	public Sample() {
		pi = 3.14;
	}
}
public class Final{
	public static void main(String args[]) {
		Sample obj = new Sample();
		System.out.println(obj.pi); // outcomes will be the error because the "final" keyword is used in the "pi" variable
	}
}*/
class Base{
	public final void display(String s) {
		System.out.println(s);
	}
}

class Sample extends Base{
	public void display(String s) { // cannot the final method in parent class
		System.out.println(s);
	}
}
public class Final {
	public static void main(String args[]) {
		Sample obj = new Sample();
		obj.display("Try me");
	}
}