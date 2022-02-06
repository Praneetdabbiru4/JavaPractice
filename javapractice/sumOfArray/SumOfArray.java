package javapractice.sumOfArray;
import java.util.*;

import java.lang.reflect.Array;

public class SumOfArray {
	static int sum(int array[]) {
		int sum = 0;
		
		for (int i = 0; i<Array.getLength(array);i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of array");
		int lengthOfArray = scanner.nextInt(); 
		int array[]= new int[lengthOfArray];
		// input elements of array
		for (int i=0 ; i<array.length; i++) {
			System.out.println("enter "+i+1+" element of array");
			array[i] = scanner.nextInt();
		}
		System.out.println("the sum of array is: "+ sum(array));
		
	}
}
