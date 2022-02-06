package javapractice.thirdLargestElement;

import java.util.Scanner;

public class ThirdLargestElementOfArray {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter size of array");
		int array[] = new int[scanner.nextByte()];
		//input elements of array
		for (int i=0 ; i<array.length; i++) {
			System.out.println("enter "+i+1+" element of array");
			array[i] = scanner.nextInt();
		}
		
		//logic
		int temp = 0;
		for(int j = 0; j<array.length; j++ ) {
			for(int k = j+1; k<array.length; k++) {
				if(array[j]>array[k]) {
					temp = array[j];
					array[j]=array[k];
					array[k] = temp;
				}
			}
		}
		//print final array
		for (int i=0 ; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\n The 3rd largest element of given array is: "+ array[array.length-3]);
	}
}

