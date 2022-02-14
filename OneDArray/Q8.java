package OneDArray;

import java.util.Scanner;

public class Q8 {
	
	private static void getSubArray(int array[]) {
		
		for(int i=0;i<array.length;i++) {
			int j = i;
			for(; j<array.length;j++) {
				
				for(int k= i;k<=j;k++) {
					System.out.print(array[k] + " ");
				}
				System.out.println();
			}
		
		}
		
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[] = null;
		array = InputClass.getScanner(array, n, scn);
		
		getSubArray(array);
		
		
	}
}
