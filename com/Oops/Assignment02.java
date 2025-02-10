package com.Oops;

class InvoiceItem{
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	InvoiceItem(String id , String desc , int qty , double unitPrice){
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	String getId() {
		return this.id;
	}
	String getDesc() {
		return this.desc;
	}
	int getQty() {
		return this.qty;
	}
	double getUnitPrice() {
		return this.unitPrice;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getTotal() {
		return unitPrice*qty;
	}
	@Override
	public String toString() { // we can call the object name for the toString function
		return "InvoiceItem[id = "+id+", desc = "+desc+", qty = "+qty+", unitprice = "+unitPrice+", Total = "+getTotal()+"]";
	}
}
public class Assignment02 {
	public static void main(String args[]) {
		InvoiceItem it = new InvoiceItem("10021" , "the prodect is nice" , 12 , 5);
		System.out.println("The Invoice is "+it);
	}
}
