package com.Oops;
class Customer{
	String customerName ;
	Account account ;
	
	Customer( String name , Account account  ){
		customerName = name;
		this.account = account ;
		}
	void viewCustomerDetails() {
		System.out.println("The Account Holder Name : "+customerName);
		System.out.println("The Bank Name : "+account.bankName);
		System.out.println("The Interest from the Bank : "+account.getInterestRate());
	}
}

class Account{
	protected RBI bank ;
	protected String bankName;
	
	Account(RBI bank , String bankname){
		this.bank = bank;
		bankName = bankname;
	}
	public double getInterestRate() {
		return bank.getInterestRate();
	}
	public String getBankName() {
		return bankName;
	}
}

class RBI{
	protected double InterestRate ;
	protected double minBalance ;
	protected double WithDrawlLimit ;
	
	RBI(){
		InterestRate = 4 ;
		minBalance = 1000 ;
		WithDrawlLimit = 10000 ;
	}
	public double getInterestRate() {
		return InterestRate ;
	}
	
	
}

class SBI extends RBI{
	public double getInterestRate() {
		return 5 ;
	}
}

class ICICI extends RBI{
	public double getInterestRate() {
		return 8 ;
	}
}
public class Banking {
	public static void main(String args[]) {
		RBI sbi = new SBI();
	     Customer c1 = new Customer("Alice", new Account(sbi, "SBI"));
	     c1.viewCustomerDetails();
	}
}
