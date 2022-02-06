package javapractice.reverseNumber;

import java.util.Scanner;
public class ReverseOfNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int b = input;
		int reverse = 0;
		while(b>0) {
			int c  = b % 10;
			reverse = reverse*10 +c;
			b = b/10;
			
			
		}
		System.out.println("the reverse of this number is: "+ reverse);
		}
	}

