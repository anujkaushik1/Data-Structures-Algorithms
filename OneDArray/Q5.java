package OneDArray;

import java.util.Scanner;
public class Q5 {
	
	private static int[] getReverse(int array[]) {
		
		int i = 0;
		int j = array.length - 1;
		
		while(i <= j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			
			i++;
			j--;
		}
		
		return array;
	}
	
	private static int[] getScanner(int array[], Scanner scn) {
		
		for(int i=0;i<array.length;i++) {
			array[i] = scn.nextInt();
		}
		
		return array;
	}
	
	private static void display(int array[]) {
		for(int val : array) {
			System.out.print(val + " ");
		}
	}
	
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		array = getScanner(array, scn);
		
		array = getReverse(array);
		display(array);
		
		
	}

}
