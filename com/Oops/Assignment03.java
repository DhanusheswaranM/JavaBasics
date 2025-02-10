package com.Oops;

class Account{
	private String id;
	private String name;
	private int balance = 0;
	
	public Account(String id , String name) {
		this.id = id;
		this.name = name;
	}
	public Account(String id , String name , int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
		}
	public int getBalance() {
		return this.balance;
	}
	public int credit(int amount) {
		return balance+=amount;
	}
	public int debit(int amount) {
		if(amount <= balance) {
			balance-=amount;
			return balance;
		}
		else {
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}
	public int transferTo(Account account, int amount) {
		if(this.balance >= amount) {
			this.debit(amount);// amount took from the acc1
			account.credit(amount); // amount deposit to the acc2
			return this.balance;
		}
		else {
			System.out.println("Amount exceeded balance for bank transfer");
			return balance;
		}
	}
	@Override
	public String toString() {
		return "Account[ id = "+this.id+", name = "+this.name+", balance = "+this.balance+"]";
	}
	}
public class Assignment03 {
	public static void main(String args[]) {
		Account acc1 = new Account("001211" ,"DANY");
		Account acc2 = new Account("13255" ,"Tom",50000);
		
		System.out.println("Acc1 has : "+acc1);
		System.out.println("Acc2 has : "+acc2);
		System.out.println("The output of acc1 CREDIT : "+acc1.credit(35000));
		System.out.println("The output of acc2 DEBIT : "+acc2.debit(35000)); // 35000 i have taken out
		acc1.transferTo(acc2 , 200);
		
		System.out.println("transfer from acc1 to acc2");
		System.out.println("The balance of the acc1 : "+acc1.toString());
		System.out.println("The balance of the acc2 : "+acc2.toString());
		acc2.transferTo(acc1 , 500);
		
		System.out.println("transfer from acc2 to acc1");
		System.out.println("The balance of the acc1 : "+acc1.toString());
		System.out.println("The balance of the acc2 : "+acc2.toString());
		
	}
}
