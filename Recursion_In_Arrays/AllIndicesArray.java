package Recursion_In_Arrays;

import java.util.Scanner;

public class AllIndicesArray {
	
	private static int[] allIndices(int array[], int x, int idx, int fsf) {
		
		if(idx == array.length) {
			return new int[fsf];
		}
		
		
		if(array[idx] == x) {
			fsf++;
			int ansArray[] = allIndices(array, x, idx + 1, fsf);
			ansArray[fsf - 1] = idx;	
			return ansArray;
			
		}
		else {
			int ansArray[] = allIndices(array, x, idx + 1, fsf);
			return ansArray;
		}

		
	}
	
	private static void displayArray(int array[], int idx) {
		
		if(idx == array.length) {
			return ;
		}
		
		System.out.println(array[idx]);
		displayArray(array, idx + 1);
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = scn.nextInt();
		}
		
		int x = scn.nextInt();
		
		int ansArray[] = allIndices(array, x, 0, 0);
		displayArray(ansArray, 0);
		
	}

}
