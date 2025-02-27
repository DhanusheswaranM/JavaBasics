package com.Oops;

class Person{
	private String name;
	private String address;
	
	public Person(String name , String address) {
		this.name = name;
		this.address = address;
		
	}
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person[name = "+this.name+" , address : "+this.address+"]";
	}
}
class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name , String address , String program , int year , double fee){
		super(name,address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	public String getProgram() {
		return this.program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return this.fee;
	}
	public void setfee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student["+super.toString()+" , program = "+this.program+", year = "+this.year+", fee = "+this.fee+"]";
		
	}
	
}
class Staff extends Person{
	private String school;
	private double pay;
	
	public Staff(String name, String address , String school, double pay) {
		super(name , address);
		this.school = school;
		this.pay = pay;
	}
	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return this.pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff["+super.toString()+" , school = "+school+", pay = "+pay+"]";
			}
}
public class Demo2_Heirarchical {
	public static void main(String args[]) {
		Staff stf = new Staff("Dhanush" , "KanyaKumari" ,"12345678 school" , 75000);
		Student stu = new Student("Dhanush" , "Chennai", "Java Program", 2025 , 80000);
		Person per = new Person("soundar" , "Coimbatore");
		
		System.out.println("The person details :"+per);
		System.out.println("The student details : "+stu);
		System.out.println("The staff details : "+stf);
		}
}
