package javapractice.matrixAddition;

public class MatrixAddition {
	//matrix formation
	public static void main(String args[]) {
		int a[][]={{1,5,6},{2,5,1},{3,1,2}};    
		int b[][]={{2,7,1},{1,1,1},{8,1,5}};    
		
		int c[][]=new int[3][3];
		
		//logic
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){  
        
		c[i][j]=a[i][j]+b[i][j];    
		System.out.print(c[i][j]+" ");  
		
		}    
		System.out.println();    
		}    
		}}  
