package com.Control_Flow_Statement;

/*3. Use switch case structure to print the appropriate message to recognize the entered character is vowel, consonant or symbol.*/
import java.util.*;
public class Easy3 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Press any key at once");
		char c=obj.next().charAt(0);
		if(c>='a' && c<='z' || c>='A' && c<='Z') {
			if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I'|| c=='O' ||c=='U' ) {
				System.out.println("You have entered the vowel");
			}
			else {
				System.out.println("You have entered the consonant");
			}
		}
		else if(c>='0' && c<='9') {
			System.out.println("You have entered the digits");
		}
		else {
			System.out.println("You have entered the symbol");
		}
	}
}
