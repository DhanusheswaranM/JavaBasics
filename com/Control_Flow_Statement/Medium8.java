package com.Control_Flow_Statement;
/*8. Accepts a string and calculate the number of digits and letters. Sample I/O:
Enter String: India became independent in 1947 Output: Letters: 24, Digits: 4, Other Symbols: 4 */
import java.util.*;
public class Medium8 {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = obj.nextLine();
		int l=0,d=0,s=0;
		for(int i = 0 ; i < str.length() ; i++) {
			char c = str.charAt(i);
			if((c >= 'a' && c <= 'z') || (c >= 'A' &&  c<= 'Z'))
				l++;
			else if(c >= '0' && c <= '9')
				d++;
			else if(c == ' ')
				s++;
			else
				s++;
			
		}
		System.out.println("Letters : "+l+" Digits : "+d+" Others symbols : "+s);
		
	}
}
