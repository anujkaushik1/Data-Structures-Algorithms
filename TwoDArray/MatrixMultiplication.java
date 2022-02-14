package TwoDArray;

import java.util.Scanner;

public class MatrixMultiplication {
	
	private static void matrixMulti(int array1[][], int array2[][]) {
		
		int n = array1.length;
		int m = array2[0].length;
		
		int c1 = array1[0].length;
		
		int ansArray[][] = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				for(int k=0;k<c1;k++) {
					ansArray[i][j] += array1[i][k] * array2[k][j]; 
				}
			}
		}
		
		display(ansArray);
		
	}
	
	private static void display(int array[][]) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int m1 = scn.nextInt();
		
		int array1[][] = null;
		array1 = InputClass.getScanner(array1, n1, m1, scn);
		
		int n2 = scn.nextInt();
		int m2 = scn.nextInt();
		
		int array2[][] = null;
		array2 = InputClass.getScanner(array2, n2, m2, scn);
		
		if(m1 != n2) {
			System.out.println("Invalid Input");
			return ;
		}
			
		matrixMulti(array1, array2);
		
			
	}

}
