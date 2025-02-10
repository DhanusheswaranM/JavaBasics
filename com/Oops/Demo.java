package com.Oops;
/*
class ProjectLeader{
	String ProLeadName = "antony";
	String empId = "LeaderO1002";
	
	
}

class Programmer extends ProjectLeader{
	String ProName;
	String empId;
	
	void setProgrammerData(String name, String id) {
		ProName = name;
		empId = id;
	}
	void DisplayData() {
		System.out.println("The programmer name : "+ProName);
		System.out.println("The programmer employee id : "+empId);
		System.out.println("The project leader name : "+super.ProLeadName);   // by using the super keyword for the specific attribute from parent class
		System.out.println("The project leader employee id : "+super.empId);
	}
}
public class Demo {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.setProgrammerData("John" , "Programmer10023");
		p.DisplayData();
		 }
}
*/
/*
class ProjectLeader{
	String ProLeadName = "antony";
	String empId = "LeaderO1002";
	
	 void DisplayData() {
		 System.out.println("The project leader name : "+ProLeadName);
			System.out.println("The project leader employee id : "+empId);
	 }
	
}

class Programmer extends ProjectLeader{
	String ProName;
	String empId;
	
	void setProgrammerData(String name, String id) {
		ProName = name;
		empId = id;
	}
	void DisplayData() {
		System.out.println("The programmer name : "+ProName);
		System.out.println("The programmer employee id : "+empId);
		super.DisplayData();   //   super call the DisplayData in the parent class because the parent class has the same method name 
	}
}
public class Demo {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.setProgrammerData("John" , "Programmer10023");
		p.DisplayData();
		 }
}
*/
/*
// Inheritance and constructor
class Base{
	Base(){
		System.out.println("Base class is called");
	}
}
class Derived1 extends Base{
	Derived1(){
		System.out.println("Derived-1 class is called");
	}
}
class Derived2 extends Derived1{
	Derived2(){
		System.out.println("Derived-2 class is called");
	}
}
public class Demo{
	public static void main(String args[]) {
		Derived2 d2 = new Derived2();
		
	}
}*/
