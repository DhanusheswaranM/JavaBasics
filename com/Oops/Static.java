package com.Oops;

/*public class Static {// static is managing memory efficiently, used for block, class , methods, variable and no need to create obj
	
	/*initialiazation of the variable using static block
	 * static variable is known as class variable it remains the updated value   */
	/*static int empId;
	static String empName;
	static {  // static method
		System.out.println("Static Block - 1");
		empId = 145;
		empName = "Alex";
	}
	static {   // static can change or update the value and it remains the last updated value
		System.out.println("Static Block - 2");
		empId = 256;
		empName = "Stark";
	}
	public static void main(String args[]) {
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name : "+empName);
	}
}*/
/*
 class Employe{
	int empId;
	String empName;
	static String Companyname = "EXPLEO solution";// static variable
	Employe(int id, String name){
		empId = id;
		empName = name;
	}
	Employe(int id, String name , String companyname){
		empId = id;
		empName = name;
		Companyname = companyname;
	}
	
	static void getCompany() { //   if i call the getcompany static method it will assign the common company name for all object in the class
		Companyname = "VEE -Technologies";  // inside the static method the value also static
	}
	void display() {
		System.out.println("The Company Name : "+Companyname);
		System.out.println("The Employee Name : "+empName);
		System.out.println("The Employee ID : "+empId);
	}
}
public class Static{
	public static void main(String args[]) {
		Employe ep = new Employe(1245 , "Mark");
		ep.display();
		Employe ep1 = new Employe(4551 , "Jeo" , "Tech-M");
		ep1.display();
		Employe.getCompany(); // It shows the common company for all objects because it update the company name for all 
		ep.display();
		ep1.display();
		
		
	}
}
*/
class Theatres{
	static int theatrecount = 0;
	String theatreId;
	String theatreName;
	
	Theatres(String id, String name){
		theatreId = id;
		theatreName = name;
		theatrecount++;
	}
	
	void display() {
		System.out.println("Theatre name : "+theatreName);
		System.out.println("Theatre ID : "+theatreId);
		System.out.println("Total number of theatres : "+theatrecount);
		
	}
}

public class Static{
	public static void main(String args[]) {
		Theatres t1 = new Theatres("245" , "adcfc");
		t1.display();
		Theatres t2 = new Theatres("248" , "vbhuj");
		t2.display();
	}
	
}
