package com.Oops;

class Theatreclass {
	String theatreID;
	String theatreName;
	
	public void setTheatreclass (String id, String name) {
		theatreID=id;
		theatreName=name;
	}
	
	public void getdisplay() {
		System.out.println("-------Theatre Details--------");
		System.out.println("TheatreID : "+theatreID);
		System.out.println("TheatreID : "+theatreName);
		System.out.println("-------**************--------");
	}
}
public class Array_of_object {
	public static void main(String args[]) {
		Theatreclass t1 = new Theatreclass();
		Theatreclass t2 = new Theatreclass();
		t1.theatreID="N344";
		t1.theatreName="ASCAR";
		System.out.println("Theatre 1 deatils");
		t1.getdisplay();
		t2.setTheatreclass("1001","ARRS");
		System.out.println("Theatre 2 deatils");
		t2.getdisplay();
		Theatreclass t3[]=new Theatreclass[2];
		for(int i = 0 ; i < t3.length ; i++) {  //it creates the memory for the object
			t3 [i] = new Theatreclass();
		}
		t3[0].setTheatreclass("N3455","KPR");
		t3[1].setTheatreclass("A4644","SPR");
		for(int i = 0 ;i < t3.length ;i++) {
			t3[i].getdisplay();
		}
	}
}
