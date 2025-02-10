package com.Oops;

class TheatreClass {
	String theatreID;
	String theatreName;
	
	public void setTheatreClass (String id, String name) {
		theatreID=id;
		theatreName=name;
	}
	
	public void getdisplay() {
		System.out.println("TheatreID : "+theatreID);
		System.out.println("TheatreID : "+theatreName);
	}
}
public class Object {
	public static void main(String args[]) {
		TheatreClass t1 = new TheatreClass();
		TheatreClass t2 = new TheatreClass();
		t1.theatreID="N344";
		t1.theatreName="ASCAR";
		System.out.println("Theatre 1 deatils");
		t1.getdisplay();
		t2.setTheatreClass("1001","ARRS");
		System.out.println("Theatre 2 deatils");
		t2.getdisplay();
	}
}
