package javapractice.palindrome;

import java.util.Scanner;
public class PalindromeNumber {
	
	
	public static void main(String [] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String reverse = "";
		String s = Integer.toString(a);
		for (int i =s.length()-1; i>=0;i-- ) {
			reverse =  reverse+  s.charAt(i)  ; 
		}
		if ( reverse.equals(s) ) {
			System.out.println("the number is palindrome");
		}else {
			System.out.println("the number is not a palindrome");
		}
	}
	
	
	
	

}