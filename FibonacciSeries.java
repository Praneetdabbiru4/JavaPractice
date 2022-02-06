
import java.util.*;
public class FibonacciSeries {
	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		
		if (input == 0 ) {
			System.out.println(a+" ");
			
		 
		}else if(input ==1){
			System.out.println(b+" ");
				
			}else {
				System.out.println(a+" ");
				System.out.println(b+" ");
				for (int i=1; i<input;i++) {
					c = a+b;
					a=b;
					b=c;
					System.out.println(c);
			}
		
		}
			}
}
