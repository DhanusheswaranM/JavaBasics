/*Inheritance is allows the hierarchal classification
 * inheritance represents the IS-A relation which is called as parent-chile relation
 * child/derived/subclass/extended class->>child class
 * base/super/parent ->base class 
 */

package com.Oops;
/*
class Employ{
	String empName;
	int empId;
	
	void Data(String name, int id) {
		empName = name;
		empId = id;
	}
	
	void displayData() {
		System.out.println("The employee name : "+empName );
		System.out.println("the employee id : "+empId);
	}
}

class Manager extends Employ{
	String dept;
	
	void Dept(String dept) {
		this.dept = dept;
	}
	void displayDept() {
		System.out.println("The "+empName+" is in the department of "+dept);
	}
}
public class Inheritance {
	public static void main(String args[]) {
		Manager m = new Manager();
		m.Data("Mark",214 );
		m.Dept("Admin");
		m.displayData();
		m.displayDept();
	}
}*/
/*class Person{
	private String Name;
	private String Address;
	private int Mobile;
	private String Email;
	private String Gender;
	
	protected void createPersonDetails(String name, String address, int mobile, String email, String gender) {
		Name = name;
		Address = address;
		Mobile = mobile;
		Email = email;
		Gender = gender;
	}
	protected void viewPersonDetails() {
		System.out.println("Name : "+Name);
		System.out.println("Address : "+Address);
		System.out.println("Mobile : "+Mobile);
		System.out.println("Email : "+Email);
		System.out.println("Gender : "+Gender);
	}
}
class Admin extends Person{  // Single level Inheritance
	String userType;
	
	Admin(){
		userType = "Administrator";
	}
	public void viewadmindetails() {
		System.out.println("User Type : "+userType);
	}
}

public class Inheritance{
	public static void main(String args[]) {
		Admin a = new Admin();
		a.createPersonDetails("Antony", "Chennai", 9955443, "xyz@gmail.com", "Male" );
		a.viewadmindetails();
		a.viewPersonDetails();
		
	}
}
*/
/*
class Person{
	private String Name;
	private String Address;
	private int Mobile;
	private String Email;
	private String Gender;
	
	protected void createPersonDetails(String name, String address, int mobile, String email, String gender) {
		Name = name;
		Address = address;
		Mobile = mobile;
		Email = email;
		Gender = gender;
	}
	protected void viewPersonDetails() {
		System.out.println("-----Person Details-----");
		System.out.println("Name : "+Name);
		System.out.println("Address : "+Address);
		System.out.println("Mobile : "+Mobile);
		System.out.println("Email : "+Email);
		System.out.println("Gender : "+Gender);
	}
}

class User extends Person{ // Single Inheritance
	private int UserId;
	private String password;
	private boolean Status;
	
	void setUserdetails(int userid, String password) {
		UserId = userid;
		this.password = password;
	}
	void DisplayUserDetails() {
		System.out.println("-----User Details-----");
		System.out.println("User Id : "+UserId);
	}
}
class Admin extends User{  //   Multi-level Inheritance
	String userType;
	
	Admin(){
		userType = "Administrator";
	}
	public void viewadmindetails() {
		System.out.println("-----User type-----");
		System.out.println("User Type : "+userType);
	}
}

public class Inheritance{
	public static void main(String args[]) {
		Admin a = new Admin();
		a.createPersonDetails("Antony", "Chennai", 9955443, "xyz@gmail.com", "Male" );
		a.setUserdetails(1254 , "Pass1234");
		a.viewadmindetails();
		a.DisplayUserDetails();
		a.viewPersonDetails();
		
	}
}*/
/*class CricketPlayer{
	String playerName;
	String teamName;
	
	void setPlayerData(String name , String team) {
		playerName = name;
		teamName = team;
		
	}
	void displayData() {
		System.out.println("The player Name : "+playerName);
		System.out.println("The Team Name : "+teamName);
	}
}

class BatsMan extends CricketPlayer{ // Heirarchical Inheritance
	int highest_score;
	float batAvg;
	
	void setBatsManData(int score , float avg) {
		highest_score = score;
		 batAvg = avg;
	}
	void displayBatsman() {
		System.out.println("Batsman details");
		System.out.println("The highset score : "+highest_score);
		System.out.println("The Batting avge : "+batAvg);
	}
}
class BowlerMan extends CricketPlayer{ // Heirarchical Inheritance
	int no_of_wicket;
	float bowAvg;
	
	void setBowlerData(int wicket , float avg) {
		no_of_wicket = wicket;
		 bowAvg = avg;
	}
	void displayBowler() {
		System.out.println("Bowler details");
		System.out.println("The no of wicket : "+no_of_wicket);
		System.out.println("The Bow avge: "+bowAvg);
	}
}

public class Inheritance{
	public static void main(String args[]) {
		BatsMan bat = new BatsMan();
		BowlerMan bow = new BowlerMan();
		
		bat.setPlayerData("Kohli" , "INDIA");
		bat.setBatsManData(150 , 3.5f);
		bow.setPlayerData("Sachin", "India");
		bow.setBowlerData(90 , 3.6f);
		
		bat.displayData();
		bat.displayBatsman();
		bow.displayData();
		bow.displayBowler();
		
		
	}
}*/
/*
class Person{
	private String Name;
	private String Address;
	private int Mobile;
	private String Email;
	private String Gender;
	
	protected void createPersonDetails(String name, String address, int mobile, String email, String gender) {
		Name = name;
		Address = address;
		Mobile = mobile;
		Email = email;
		Gender = gender;
	}
	protected void viewPersonDetails() {
		System.out.println("-----Person Details-----");
		System.out.println("Name : "+Name);
		System.out.println("Address : "+Address);
		System.out.println("Mobile : "+Mobile);
		System.out.println("Email : "+Email);
		System.out.println("Gender : "+Gender);
	}
}

class User extends Person{ // Single Inheritance
	private int UserId;
	private String password;
	private boolean Status;
	
	void setUserdetails(int userid, String password) {
		UserId = userid;
		this.password = password;
	}
	void DisplayUserDetails() {
		System.out.println("User Id : "+UserId);
	}
}
class Admin extends User{  //   Multi-level Inheritance
	String userType;
	
	Admin(){
		userType = "Administrator";
	}
	public void viewadmindetails() {
		System.out.println("User Type : "+userType);
	}
}
class Customer extends Person{   // Heirarchical Inheritance
	String userType;
	Customer(){
		userType = "Customer";
	}
	void getUserType() {
		System.out.println("\nUser Type :"+userType);
	}
}
class Officer extends Person{    // Heirarchical Inheritance
	String userType;
	
	Officer(){
		userType = "Officer";
	}
	void getUserType() {
		System.out.println("\nUser Type :"+userType);
	}
}

public class Inheritance{
	public static void main(String args[]) {
		Admin a = new Admin();
		a.createPersonDetails("Admin - Antony", "Chennai", 9955443, "xyz@gmail.com", "Male" );
		a.setUserdetails(1254 , "Pass1234");
		a.viewadmindetails();
		a.DisplayUserDetails();
		a.viewPersonDetails();
		Customer c = new Customer();
		c.createPersonDetails("Customer - Mary", "Bangaluru", 956214, "123xyz@gmail.com", "Female" );
		c.getUserType();
		c.viewPersonDetails();
		Officer o = new Officer();
		o.createPersonDetails("Officer - Mark", "Coimbatore", 9566222, "xyz123@gmail.com", "Male" );
		o.getUserType();
		o.viewPersonDetails();
		
		
	}
}
*/

//Inheritance and constructor
class Base1{
	Base1(){
		System.out.println("Base-1 class is called");
	}
}
class Derived01 extends Base1{
	Derived01(){
		System.out.println("Derived-01 class is called");
	}
}
class Derived02 extends Derived01{
	Derived02(){
		System.out.println("Derived-02 class is called");
	}
}
public class Inheritance{
	public static void main(String args[]) {
		Derived02 d2 = new Derived02();
		
	}
}