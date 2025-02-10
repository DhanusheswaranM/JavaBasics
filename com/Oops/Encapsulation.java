package com.Oops;
/*
class Employeee{
	private int empId;
	private String empName;
	
	public void setId(int id) {
		empId = id;
	}
	public void setName(String name) {
		empName = name;
	}
	public int getId() {
		return empId;
	}
	public String getName() {
		return empName;
	}
}
public class Encapsulation {
	//  getter is read only method , setter is write only method
	public static void main(String args[]) {
		Employeee ep = new Employeee();
		ep.setId(956);
		ep.setName("Antony");
		System.out.println("The employee NAME : "+ep.getName());
		System.out.println("The employee ID : "+ep.getId());
	}

}
*/

class Theatre{
	private static int theatrecount = 0;
	private String Id;
	private String Name;
	
	public void setID(String id) {
		Id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getName() {
		return Name;
	}
	public String getId() {
		return Id;
	}
}

public class Encapsulation{
	public static void main(String arg[]) {
		Theatre t1 = new Theatre();
		t1.setID("1452");
		t1.setName("ArrS");
		System.out.println("The theatre name : "+t1.getName());
		System.out.println("The theatre id : "+t1.getId());
		
		
	}
}
