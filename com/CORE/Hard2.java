package com.CORE;
/*2. Anne joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:
a. Its length is at least 6.
b. It contains at least one digit.
c. It contains at least one lowercase English character.
d. It contains at least one uppercase English character.
e. It contains at least one special character. The special characters are: !@#$%^&*()-+
*/
import java.util.Scanner;

class Hard2{
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