package TwoDArray;

import java.util.Scanner;

public class Rotate90Degree {
	
	private static void transponse(int array[][]) {
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<=i;j++) {
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
	}
	
	private static void reverse(int array[][]) {
		
		for(int k=0;k<array.length;k++) {
			int i = 0;
			int j = array[0].length - 1;
			
			while(i < j) {
				int temp = array[k][i];
				array[k][i] = array[k][j];
				array[k][j] = temp;
				
				i++;
				j--;
			}
		}
		
	}
	
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[][] = null;
		array = InputClass.getScanner(array, n, n, scn);
		
		transponse(array);
		reverse(array);
		InputClass.display(array);
		

	}

}
