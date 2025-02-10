package com.Oops;

public class Overloading_constructor {
	String Id;
	String Name;
	Overloading_constructor(){
		Id  = "N154";
		Name = "Max_CInemas";
	}
	
	Overloading_constructor(String id, String name){
		Id = id;
		Name = name;
	}
	public void getdisplay() {
		System.out.println("The theatre details ");
		System.out.println("The theatre ID : "+Id);
		System.out.println("The theatre Name : "+Name);
		System.out.println("--------");
	}
	
	public static void main(String args[]) {
		Overloading_constructor oc1 = new Overloading_constructor();
		Overloading_constructor oc2 = new Overloading_constructor("ARRS145" , "ARRS");
		oc1.getdisplay();
		oc2.getdisplay();
		
	}
}
