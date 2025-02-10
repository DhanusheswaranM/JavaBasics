package com.Control_Flow_Statement;
/*5. Write a program using for loop to print alphabets as follows:
az by cx dw ev fu gt hs ir jq kp lo mn nm ol pk qj ri sh tg uf ve wd xc yb za*/
import java.util.*;
public class Easy5 {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		char char1=0;
		char char2=0;
		for(int i=0;i<26;i++) {
			char1=(char)(97+i);
			char2=(char)(122-i);
			System.out.print(char1);
			System.out.print(char2+" ");
		}
	}
}

