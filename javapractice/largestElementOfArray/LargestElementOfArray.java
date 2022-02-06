package javapractice.largestElementOfArray;

public class LargestElementOfArray {
	
	public static void main(String[]args) {
		int array1[]= {12,45,65,32,10};
		int max = array1[0];
		for(int i = 0; i<array1.length; i++ ) {
			if(array1[i]>max) {
				max = array1[i];
			}
		}
		System.out.println("the largest element of this given array is: "+max);
		
	}
	
	
	
	
}