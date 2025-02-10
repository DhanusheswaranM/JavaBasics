package com.Oops;
import java.util.*;

abstract class BrowsingCentre{
	String memId;
	String memName;
	String memLocation;
	
	
	BrowsingCentre(String memid , String memname , String memlocation){
		memId = memid;
		memName = memname;
		memLocation = memlocation;
	}
	public void DisplayMemberDetails() {
		System.out.println("ID : "+memId);
		System.out.println("Member Name : "+memName);
		System.out.println("Member Location : "+memLocation);
	}
	 abstract double setBill();
}
class PrimeMember extends BrowsingCentre{
	double weeklyamount ;
	
	PrimeMember(String memid , String memname , String memlocation , double amount){
		super(memid , memname , memlocation);
		weeklyamount = amount ;
	}
	@Override double setBill() {
		return weeklyamount ;
	}
	@Override
	public String toString() {
		return "ID : "+memId+"\nMember Name : "+memName+"\nMemberLocation : "+memLocation+"\nThe bill is : "+weeklyamount;
	}
}

class NormalMember extends BrowsingCentre{
	int hour ;
	static final double hourlyamount = 50 ;
	
	NormalMember(String memid , String memname , String memlocation , int hourused){
		super(memid , memname , memlocation);
		hour = hourused ;
	}
	@Override
	double setBill() {
		return hour*hourlyamount ;
	}
	public double getUsage() {
		return hour*hourlyamount ;
	}
	@Override
	public String toString() {
		return "ID : "+memId+"\nMember Name : "+memName+"\nMemberLocation : "+memLocation+"\nThe bill is : "+getUsage();
	}
	
}
public class Browsingcentre1 {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		PrimeMember prime = new PrimeMember("PM1002" , "Amar" , "Chennai" , 2000);
		
		
		System.out.println("-------The PRIME MEMBER Details: -------");
		System.out.println(prime);
		
		System.out.println("Enter how many normal members : ");
		int nm = obj.nextInt();
		NormalMember normal[] = new NormalMember[nm]; // array of objects
		
		System.out.println("Enter the details of the normal members : ");
		for(int i = 0 ; i < normal.length ; i++) {
			System.out.println("Enter id : ");
			String id = obj.next();
			System.out.println("Enter name : ");
			String name = obj.next();
			System.out.println("Enter location : ");
			String loc = obj.next();
			System.out.println("Enter hours : ");
			int hours = obj.nextInt();
			normal[i] = new NormalMember(id , name , loc , hours);
		}
		/*normal[0] = new NormalMember("NM1120" , "Akash" , "Bangalore" ,50);
		normal[1] = new NormalMember("NM1203" , "Ram" , "Mumbai" ,10);
		normal[2] = new NormalMember("NM2563" , "Ganesh" , "Coimbatore" ,20);
		normal[3] = new NormalMember("NM2561" , "Jeo" , "Hydrabed" ,30);
		normal[4] = new NormalMember("NM1452" , "Yasik" , "Chennai" ,25);*/
		
		
		System.out.println("------The NORMAL MEMBER Details:----");
		for(NormalMember normem : normal) {
			System.out.println(normem);
			System.out.println("----------------------------------------");
		}
		
		
		System.out.println("*********The normal members paying more than 2000 :  ***********");
		for(NormalMember normem : normal) {
			if(normem.getUsage() > 2000) {
				System.out.println(normem);
			}
		}
		
	}
}
