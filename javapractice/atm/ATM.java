// write an ATM program to check account balance, deposit money and withdraw money
package javapractice.atm;
import java.util.Scanner;
public class ATM {
	public static void main (String[] args) {
		int balance = 10000;
		int withdraw;
		int deposit;
		int choice;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 to check balance");
			System.out.println("Enter 2 to deposit money");
			System.out.println("Enter 3 to withdraw money");
			System.out.println("Enter 4 to exit");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch(choice) {
			case 1: System.out.println("Your account balance is: "+balance);
					break;
			case 2: System.out.println("Enter amount to be deposited");
					deposit = scanner.nextInt();
					balance = balance + deposit;
					System.out.println("Your account balance is: "+balance);
					break;
			case 3: System.out.println("Enter to withdraw: ");
					withdraw = scanner.nextInt();
					if(balance >= withdraw) {
						balance = balance - withdraw;
						System.out.println("Your account balance is: "+balance);
					}else {
						System.out.println("insufficient balance");
					
					}
					break;
			case 4 :  System.out.println("Thanks for using this ATM ");
				      System.exit(0);
			default : System.out.println("invalid input");
					
			
			}
			
			}
		
	}

}
