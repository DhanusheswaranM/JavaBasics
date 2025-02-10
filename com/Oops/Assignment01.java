package com.Oops;


 class Circle {
	
	double radius =1.0;
	String color = "red";
	Circle(){
		
	}
	Circle(double radius){
		this.radius = radius;
	}
	Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
	}
	double getRadius() {
		return radius;
	}
	String getColor() {
		return color;
	}
	void setRadius(double radius ){
		this.radius = radius;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	double getArea(){
		return (3.14 * radius * radius);
	}
	
	@Override
	public String toString() {
		return "Circle{radius is "+radius+", color is "+color+",Area is "+getArea()+"}";
	}



	
}
public class Assignment01 {
	public static void main(String args[]) {
		Circle cir1 = new Circle();
		System.out.println("1st circle");
		System.out.println("The radius : "+cir1.radius);
		System.out.println("The color : "+cir1.color);
		System.out.println("Area : "+cir1.getArea());
		System.out.println("-----------");
		
		Circle cir2 = new Circle();
		cir2.setRadius(2);
		cir2.setColor("blue");
		System.out.println("2nd circle");
		System.out.println("The radius :"+cir2.getRadius());
		System.out.println("The color :"+cir2.getColor());
		System.out.println("Area : "+cir2.getArea());
		System.out.println("-----------");
		
		Circle cir3 = new Circle(2.0);
		System.out.println("3rd circle");
		System.out.println("Area : "+cir3.getArea());
		System.out.println("-----------");
		Circle cir4 = new Circle(3.0,"Black");
		System.out.println("4th circle");
		System.out.println("Area : "+cir4.getArea());
		 
		System.out.println("-----------");
		System.out.println(cir3.toString());
		System.out.println("-----------");
		System.out.println(cir4.toString());
	}
}
