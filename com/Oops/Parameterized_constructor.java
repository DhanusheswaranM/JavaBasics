package com.Oops;
/*
class Employees{
	int Id;
	String Name;
	 Employees(int id, String name){
		Id = id;
		Name = name;
	}
	
	Employees(){ ///constructor is used the object to be ready
		Id = 12355;
		Name = "Maran"; 
	}
	public void getdisplay() {
		System.out.println("values initiating");
		System.out.println("Employee ID : "+Id);
		System.out.println("Employee name : "+Name);
		}
	}
public class Parameterized_constructor { // main class
	
	public static void main(String args[]) {
		
		Employees emp1 = new Employees ();
		Employees emp2 = new Employees (1241,"Jhon");
		
		emp1.getdisplay();
		emp2.getdisplay();
	}

}*/
class Theatreclasses{
	String Id;
	String Name;
	
	public Theatreclasses( String id , String name){
		Id=id;
		Name=name;
	}
	
	Theatreclasses(){
		Id="SPI2566";
		Name="SPI_cinemas";
	}
	
	public void getdisplay() {
		System.out.println("The theatre details ");
		System.out.println("Theatre ID : "+Id);
		System.out.println("Theatre NAME : "+Name);
	}
}

public class Parameterized_constructor{
	public static void main(String args[]) {
		Theatreclasses tc1 = new Theatreclasses();
		Theatreclasses tc2 = new Theatreclasses("SPI2541" , "SPI Cinemas");
		tc1.getdisplay();
		tc2.getdisplay();
	}
}