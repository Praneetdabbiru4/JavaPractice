package javaPractice.spiral;

public class SpiralMatrix {
	import java.util.Scanner;

	public class Spiral {
	    public static void main(String[] args)  {

	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("enter the size of your matrix ");
	    	int input = scanner.nextInt(); //5
	    	int top = 0;
	    	int bottom = input - 1;
	    	int left = 0;
	    	int right = input - 1;
	    	int direction = 0;
	    	int currentNumber = 1;
	    	int rightdirection = 0;
	    	int downdirection = 1;
	    	int leftdirection = 2;
	    	int updirection = 3;
	    	
	    	int matrix[][] = new int[input][input];
	    	
	    	while(top <= bottom && left <= right) {
	    		if(direction == rightdirection) {
	    			for(int i = left; i <= right; i++) {
	    				 matrix[top][i] = currentNumber;
	    				 currentNumber++;
	    			}
	    			top++;
	    		}else if(direction == downdirection) {
				    for(int i = top; i <= bottom; i++ ) {
				    	matrix[i][right] = currentNumber;
				    	currentNumber++;
				    }
				    right --;
				    
				}else if (direction == leftdirection) {
					for (int i = right; i >= left; i--) {
						matrix[bottom][i] = currentNumber;
						currentNumber ++;
					}
					bottom --;
				}else if(direction == updirection) {
					for(int i = bottom; i >= top; i--) {
						matrix[i][left] = currentNumber;
						currentNumber++;
					}
					left++;
				}
	    		direction = (direction + 1) % 4;
	    	}
	    	 for(int i = 0; i < input; i++){
	             for(int j = 0; j < input; j++){
	                 System.out.print(matrix[i][j]+"     ");
	                 
	             }
	             System.out.println("");
	         }
	    	
	    }
	}

}
