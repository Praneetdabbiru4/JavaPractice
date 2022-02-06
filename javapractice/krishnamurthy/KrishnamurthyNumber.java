//Krishnamurthy number is another special number in Java. A number is said to be Krishnamurthy if the 
//factorial sum of all its digits is equal to that number. 
//Krishnamurthy number is also referred to as a Strong number.
/*Number = 145  
= 1! + 4! + 5!  
= 1 + ( 4 * 3 * 2 * 1 ) + ( 5 * 4 * 3 * 2 * 1 )  
= 1 + 24 + 120  
= 145*/  
package java.krishnamurthy;
import java.util.*;
public class KrishnamurthyNumber {
	 static int factorial(int a) {
		int fact = 1;
		if(a==0) {
			return fact;
		}else {
			for (int i = 1 ; i<=a; i++) {
				fact = fact * i;
				
			}
			return fact;
		}
		
	}
	
		
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number;
		int sum = 0;
		System.out.println("Enter a number");
		number = scanner.nextInt();
		int temporaryNumber = number;
		while(temporaryNumber>0) {
			
			sum = sum + factorial(temporaryNumber%10);
			temporaryNumber = temporaryNumber/10;
		}
		if (sum == number) {
			System.out.println("number is Krishnamurty number");
			
		}else {
			System.out.println("number is not a Krishnamurty number");
		}
		
	}
}
