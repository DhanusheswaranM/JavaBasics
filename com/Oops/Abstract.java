package com.Oops;
import java.util.*;

abstract class Shape{
	
	protected String color ;
	protected boolean filled ;
	void draw() {
		System.out.println("Drawing");
	}
	
	Shape(){
		color = "red";
		filled = true;
	}
	Shape(String color , boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color= color;
	}
	public boolean isFilled() {
		return this.filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	// implementation of the abstract class
	 abstract double getArea();// body is no need body is in the subclass
	 abstract double getPerimeter();
	 @Override
	 public String toString() {
		 return "Shape [ color = "+this.color+" , filled = "+this.filled+"]";
	 }
}

class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	Rectangle(){
		width = 0;
		length = 0;
	}
	Rectangle(double width , double length){
		this.length = length;
		this.width = width;
	}
	
	Rectangle(double width , double length , String color , boolean filled){
		super(color , filled);
		this.width = width;
		this.length =length;
	}
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return this.length;
	}
	public void setLength(double length) {
		this.length =length;
	}

	@Override
	 public double getArea() { 
		return length*width;
	}
	 
	 @Override
	public double getPerimeter() {
		return (2*(length + width));
	}
	
	@Override
	public String toString() {
		return "Rectangle [ Shape [ color = "+this.color+", filled = "+this.filled+"],width = "+this.width+", length = "+this.length+"]";
	}
}

class Square extends Rectangle{
	protected double side;
	Square(){
		super(1 , 1) ;
	}
	Square(double side){
		super(side, side) ;
	}
	Square(double side , String color , boolean filled){
		super(side , side , color , filled);
	}
	public double getSide() {
		return this.width;
	}
	public void setSide(double side) {
		this.width = this.length = side ;
	}
	@Override
	public void setWidth(double side) {
		setSide(side) ;
	}
	@Override
	public void setLength(double side) {
		setSide(side) ;
	}
	@Override
	public String toString() {
		return "Square [ Rectangle [ Shape [ color = "+this.color+", filled = "+this.filled+"], width = "+getWidth()+" , length = "+getLength()+"]]";
	}
}

class Circle1 extends Shape{
	protected double radius;
	
	Circle1(){
		radius = 1.0;
	}
	Circle1(double radius){
		this.radius = radius ;
	}
	Circle1(double radius , String color, boolean filled){
		super(color , filled);
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	 double getArea() {
		return (3.14*(radius*radius));
		
	}
	@Override
	double getPerimeter() {
		return (2*(3.14)*radius);
	}
	
	@Override
	public String toString() {
		return "Circle [ Shape [ color = "+this.color+", filled = "+this.filled+"] , radius = "+this.radius+"]";
	}
}

public class Abstract {
	public static void main(String args[]) {
		Shape r = new Rectangle(20 , 50 , "Green" , true);
		System.out.println(r);
		System.out.println("Rectangle Area : "+r.getArea());
		System.out.println("Rectangle Perimeter : "+r.getPerimeter());
		
		Shape c = new Circle1(5 , "Black" ,true);
		System.out.println(c);
		System.out.println("Circle Area : "+c.getArea());
		System.out.println("Circle Perimeter : "+c.getPerimeter());
		
		Shape s = new Square(3 , "Brown" , false);
		System.out.println(s);
		System.out.println("Square Area : "+s.getArea());
		System.out.println("Square Perimeter : "+s.getPerimeter());
	}
}

/*
enum PaymentStatus{
	UNPAID, COMPLETED;
}
abstract class Payment{
	
	protected static double amount;
	protected static int transactionid;
	protected static String CreatedOn;
	enum PymentStatus {UNPAID,COMPLETED}
	protected static PaymentStatus status ;
	Payment(int transid , String date){
		transactionid = transid;
		amount = 0;
		CreatedOn = date;
		status = PaymentStatus.UNPAID;
	}
	
	abstract void pay(double amt);
}
*/


/*
class  Card extends Payment{
	private int cardNumber;
	
	Card(int transid , String date){
		super(transid , date);
	}
	
	@Override
	void pay(double amt) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Card Number");
		cardNumber = input.nextInt();
		amount = amt;
		System.out.println("Thank you for make payment through card");
		status = PaymentStatus.COMPLETED;
	}
	
	void getCardDetails() {
		System.out.println("Transaction ID : "+transactionid);
		System.out.println("Amount : "+amount);
		System.out.println("Created on : "+CreatedOn);
		System.out.println("Payment Status : "+status);
		System.out.println("Card Number : "+cardNumber);
	}
}


class Cash extends Payment{
	private double CashAmount;
	
	Cash(int transid, String date){
		super(transid , date);
	}
	
	@Override
	void pay(double amt) {
		amount = amt;
		CashAmount = amount;
		System.out.println("Thank you for make cash payment");
		status = PaymentStatus.COMPLETED;
	}
	
	void getCashDetails() {
		System.out.println("Transaction ID : "+transactionid);
		System.out.println("Amount : "+amount);
		System.out.println("Created on : "+CreatedOn);
		System.out.println("Payment Status : "+status);
		System.out.println("Cash Amount : "+CashAmount);
	}
}


public class Abstract{
	public static void main(String args[]) {
		Card card = new Card(51123 , "03/04/2026");
		card.pay(150);
		card.getCardDetails();
		Cash cash = new Cash(1254 , "03/02/2025");
		cash.pay(130);
		cash.getCashDetails();
		
	}
}
*/