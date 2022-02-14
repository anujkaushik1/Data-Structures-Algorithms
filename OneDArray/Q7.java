package OneDArray;

import java.util.Scanner;

public class Q7 {
	
	private static int[] getInverse(int array[]) {
		
		int ansArray[] = new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			int val = i;
			int index = array[i];
			
			ansArray[index] = val;
		}
		
		return ansArray;
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[] = null;
		
		array = InputClass.getScanner(array, n, scn);
		
		array = getInverse(array);
		
		InputClass.displayNextLine(array);
		
	}

}
