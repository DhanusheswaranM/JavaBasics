package com.Oops;


/*class Employee{
	int Id;
	String Name;
	
	public void getdisplay() {
		System.out.println("Default constructor values");
		System.out.println("Employee ID : "+Id);
		System.out.println("Employee name : "+Name);
	}
}
public class Constructor {
	public static void main(String args) {
		Employee emp = new Employee();
		emp.getdisplay();
	}
}*/
class Employee{
	int Id;
	String Name;
	
	Employee(){ ///constructor is used the object to be ready
		Id = 12355;
		Name = "Maran"; 
	}
	public void getdisplay() {
		System.out.println("values initiating");
		System.out.println("Employee ID : "+Id);
		System.out.println("Employee name : "+Name);
	}
}
public class Constructor {
	public static void main(String args[]) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		emp.getdisplay();
		emp1.getdisplay(); // 
	}
}
