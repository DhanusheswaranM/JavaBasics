package com.expleo;
import java.util.*;
public class Function_Demo {
	public static void main(String args[]) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value:");
		/*int num=obj.nextInt();
		int a=num;
		int result=0;
		while(num>0) {
			int rem=num%10;
			result=result+(rem*rem*rem);
			num/=10;
		}
		if(a==result) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("Not Amstrong Number");
		}
		*/
		String num=obj.next();
		int a=Integer.parseInt(num);
		int b=a;
		int len=num.length();
		int result=0;
		while(b>0) {
			int rem=b%10;
			result+=Math.pow(rem, len);
			b/=10;
		}
		if(result==a) {
			System.out.println("amstrong");
		}else {
			System.out.println("not amstrong");
		}
		
	}

	
}
