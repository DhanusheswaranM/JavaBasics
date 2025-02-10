package com.CORE;
import java.util.*;
public class Hard1 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("1.Sender 2.Receiver.Enter your choice");
		int ch = obj.nextInt();
		if(ch == 1) {
			System.out.println("Enter the key: ");
			int key = obj.nextInt();
			obj.nextLine();
			System.out.println("Enter the original text : ");
			String text = obj.nextLine();
			char a[] = text.toCharArray();
			if(key == 1) {
				
				System.out.println("Op :\nThe encrypted text is...");
				for(int i = 0 ; i < a.length ; i++) {
					if(a[i] == 'Z' || a[i] == 'z') {
						System.out.print((char)(a[i]-26+1));
					}else
						System.out.print((char)(a[i]+1));
					}
				}
			if(key == 2) {
				
				System.out.println("Op :\nThe encrypted text is...");
				for(int i = 0 ; i < a.length ; i++) {
					if(a[i] == 'Z' || a[i] == 'z') {
						System.out.print((char)(a[i]-26+2));
					}
					else {
						System.out.print((char)(a[i]+2));
					}
				}
			}
			if(key == 3) {
				
				System.out.println("Op :\nThe encrypted text is...");
				for(int i = 0 ; i < a.length ; i++) {
					if(a[i] == 'Z' || a[i] == 'z') {
						System.out.print((char)(a[i]-26+3));
					}
					else {
						System.out.print((char)(a[i]+3));
					}
				}
			}
		}
		else if(ch == 2) {
			System.out.println("Enter the key: ");
			int key = obj.nextInt();
			obj.nextLine();
			System.out.println("Enter the original text : ");
			String text = obj.nextLine();
			char a[] = text.toCharArray();
			if(key == 1) {
				
				System.out.println("Op :\nThe encrypted text is...");
				for(int i = 0 ; i < a.length ; i++) {
					if(a[i] == 'a' || a[i] == 'A') {
						System.out.print((char)(a[i]+26-1));
					}
					else {
						System.out.print((char)(a[i]-1));
					}
					}
				}
			if(key == 2) {
				
				System.out.println("Op :\nThe encrypted text is...");
				for(int i = 0 ; i < a.length ; i++) {
					if(a[i] == 'a' || a[i] == 'A') {
						System.out.print((char)(a[i]+26-2));
					}
					else {
						System.out.print((char)(a[i]-2));
					}
				}
			}
			if(key == 3) {
				
				
				System.out.println("Op :\nThe encrypted text is...");
				for(int i = 0 ; i < a.length ; i++) {
					if(a[i] == 'a' || a[i] == 'A') {
						System.out.print((char)(a[i]+26-3));
					}
					else {
						System.out.print((char)(a[i]-3));
					}
				}
			}
		}
	}
}