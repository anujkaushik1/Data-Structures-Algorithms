package OneDArray;

import java.util.Scanner;

public class Q6 {
	
	private static int[] getRotation(int array[], int k) {
		
		k = k % array.length;
		
		if(k < 0) {
			k += array.length;
		}
		
		int index = array.length - k;
		array = getReverse(array, index, array.length-1);
		array = getReverse(array, 0, index - 1);
		array = getReverse(array, 0, array.length-1);
		
		return array;
	}
	
	private static int[] getReverse(int array[], int i, int j) {
		
		while(i <= j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			
			i++;
			j--;
		}
		
		return array;
	}
	
	private static void display(int array[]) {
		
		for(int val : array) {
			System.out.print(val + " ");
		}
	}
	
	private static int[] getScanner(int array[], Scanner scn) {
		
		for(int i=0;i<array.length;i++) {
			array[i] = scn.nextInt();
		}
		
		return array;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		array = getScanner(array, scn);
		int k = scn.nextInt();
		array = getRotation(array, k);
		
		display(array);
		
	}

}
