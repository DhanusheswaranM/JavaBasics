package com.CORE;
import java.lang.*;
import java.util.*;
/*public class DemoString {
	public static void main(String args[]) {
		String s1 = "\nHai ram";
		String s2 = "\nHai Raman";
		System.out.println("THe nlength of s1 : "+s1.length());
		System.out.println("THe nlength of s2"
				+ " : "+s2.length());
		
	}
}
*//*
public class DemoString {
	public static void main(String args[]) {
		String s1 = "\nHai ram"+" Welcome";
		System.out.println(s1);
		String s2 = 20+30+" Sachin "+20+30;//before string literals it not taken as string
		System.out.println(s2);
	}
}*/
/*public class DemoString {
	public static void main(String args[]) {
		String s1 = "Hai ram"+" Welcome ";
		String s2 = 20+30+" Sachin "+20+30;//before string literals it not taken as string
		String s3 = s1.concat(s2);
		System.out.println("s1 : "+s1+"\ns2 : "+s2+"\ns3 : "+s3);
		String s4 = s2.concat(s1);
		System.out.println("s1 : "+s1+"\ns2 : "+s2+"\ns3 : "+s3+"\ns4 : "+s4);
	}
}+*/
/*
public class DemoString {
	public static void main(String args[]) {
		String s1 = "Education";
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(3 , 6));
	}
}*/
/*public class DemoString {
	public static void main(String args[]) {
		String s1 = "Hai ram Welcome ";
		System.out.println("UpperCase : "+s1.toUpperCase());
		System.out.println("LowerCase : "+s1.toLowerCase());
		String s2 = " Hai welcome ";
		System.out.println("Trim :"+s2.trim());//removes the whitespace of the starting and ending of the String
		String s3 = "Discover";
		System.out.println("Starts with Dis: "+s3.startsWith("Dis"));
		System.out.println("Ends with er: "+s3.endsWith("er"));
	}
}*/
/*public class DemoString {
	public static void main(String args[]) {
		String s = "Welcome";
		char a[] = s.toCharArray();
		System.out.println("The String is "+s);
		for(int i = 0 ; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}*/
/*
public class DemoString {
	public static void main(String args[]) {
		String s1 = "ComputeR";
		String s2 = "ComputeR";
		if(s1.equals(s2))//equals methods is case sensitive
			System.out.println("String are equal");
		else
			System.out.println("String are not equal");
		
		String s3 = "Education";
		String s4 = "education";
		if(s3.equalsIgnoreCase(s4))//equalsIgnoreCase  methods ignores the cases(upper or lower case)
			System.out.println("String are equal");
		else
			System.out.println("String are not equal");
		String s5 = "Monitor";
		String s6 = "Mouse";
		if(s5 == s6)//compares the reference not a content
			System.out.println("String are equal");
		else
			System.out.println("String are not equal");
	}
}*/
/*
public class DemoString {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		String s = "INDIA";
		char a[] = s.toCharArray();
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print((char)(a[i]+2));
		}
	}
}*/
/*
public class DemoString {
	public static void main(String args[]) {
		String s = "abcdef34gh_ijk-/lmn";
		char a[] = s.toCharArray();
		for(int i = 0 ; i < a.length ;i++) {
			if((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A' && a[i] <= 'Z')) 
				System.out.print(a[i]);
		}
	}
}*/
/*
public class DemoString {
	public static void main(String args[]) {
		String s = "Welcome";// A=65  a=97
		char a[] = s.toCharArray();
		for(int i = 0 ;i < a.length ; i++) {
			for(int j = i+1 ; j < a.length ; j++) {
				if(a[i] > a[j]) {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a);
	}
}*/
/*
public class DemoString {
	public static void main(String args[]) {
		Scanner obj = new Scanner (System.in);
		String s = obj.nextLine();
		String[] a = s.split("\\s+");
		for(int i = 0 ;i < a.length ; i++) {
			if(i==2){
				System.out.println("\n...Pls wait");
			}
				System.out.print(a[i]+" ");
			
			
		}
	}
}*/
/*
public class DemoString {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("1.Sender 2.REceiver.Enter your choice");
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
					if(a[i] == 'Z') {
						System.out.print((char)(a[i]-26+1));
					}else
						System.out.print((char)(a[i]+1));
					}
				}
			if(key == 2) {
				
				System.out.println("Op :\nThe encrypted text is...");
				for(int i = 0 ; i < a.length ; i++) {
					if(a[i] == 'Z') {
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
					if(a[i] == 'Z') {
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
					if(a[i] == 'Z') {
						System.out.print((char)(a[i]-26+1));
					}
					else {
						System.out.print((char)(a[i]-1));
					}
					}
				}
			if(key == 2) {
				
				System.out.println("Op :\nThe encrypted text is...");
				for(int i = 0 ; i < a.length ; i++) {
					if(a[i] == 'Z') {
						System.out.print((char)(a[i]-26+2));
					}
					else {
						System.out.print((char)(a[i]-2));
					}
				}
			}
			if(key == 3) {
				
				System.out.println("Op :\nThe encrypted text is...");
				for(int i = 0 ; i < a.length ; i++) {
					if(a[i] == 'Z') {
						System.out.print((char)(a[i]-26+3));
					}
					else {
						System.out.print((char)(a[i]-3));
					}
				}
			}
		}
	}
}*/
/*
class DemoString{
	public static void main(String args[]) {
		StringBuffer s1 = new StringBuffer("Hello ");
		s1.append("World");
		System.out.println(s1);
		s1.insert(0, "hai");
		System.out.println(s1);
	}
}*/
/*
class DemoString{
	public static void main(String args[]) {
		StringBuffer s1 = new StringBuffer("SUCCESS");
		s1.replace(2,3,"XXXX");
		System.out.println(s1);//   op->>>>SUXXXXCESS
	}
}*/
/*class DemoString{
	public static void main(String args[]) {
		StringBuffer s1 = new StringBuffer("SUCCESS");
		s1.delete(2,4);
		System.out.println(s1);//   op->>>>SUESS
	}
}*//*
class DemoString{
	public static void main(String args[]) {
		StringBuffer s1 = new StringBuffer("SUCCESS");
		s1.reverse();
		System.out.println(s1);//   op->>>>SSECCUS
	}
}*/
/*class DemoString{
	public static void main(String args[]) {
		StringBuffer s1 = new StringBuffer();// 16 capacity
		System.out.println("s1 :"+s1+" & capacity : "+s1.capacity());
		s1.append("Welcome to java course ");
		System.out.println("s1 :"+s1+" & capacity : "+s1.capacity());
		s1.append("java is my favourite language");
		System.out.println("s1 :"+s1+" capacity : "+s1.capacity());
		
	}
}*/
/*
class DemoString{
	public static void main(String args[]) {
		String s1 = "zbc";
		String s2 = "def";
		System.out.println(s1.compareTo(s2));
	}
}*/
class DemoString{
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = obj.nextLine();
		char a[] = str.toCharArray();
		int len = a.length;
		int digit = 0 , LC = 0 , UC = 0 , SC = 0;
		for(int i = 0 ; i < len ; i++) {
			if(a[i] >= 'a' && a[i] <= 'z') {
				LC++;
			}
			else if(a[i] >= 'A' && a[i] <= 'Z') {
				UC++;
			}
			else if(a[i] >= '0' && a[i] <= '9') {
				digit++;
			}
			else {
				SC++;
			}
		}
		if((len >= 6) && (LC >= 1) && (UC >= 1) && (SC >= 1)) {
			System.out.println("Strong");
		}
		else if((len >= 2 ) && (((LC >= 1) && (UC >= 1) || (SC >= 1)) || ((LC >= 1) || (UC >= 1) && (SC >= 1)))){
			System.out.println("Moderate");
		}
		else {
			System.out.println("Weak");
			
		}
	}
}