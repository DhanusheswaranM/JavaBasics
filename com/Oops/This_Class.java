package com.Oops;
class Emp{
	int empId; //  instance variable
	String empName; //   instance variable
	
	Emp(int empId, String empName){
		this.empId=empId; //   local variable
		this.empName=empName; //   local variable
		
	}
	void display() {
		System.out.println("The employee ID : "+empId);
		System.out.println("The employee NAME : "+empName);
	}
}
public class This_Class {
	public static void main(String args[]) {
		Emp emp1 = new Emp(1245 , "TOM");
		emp1.display();
	}
	
}
