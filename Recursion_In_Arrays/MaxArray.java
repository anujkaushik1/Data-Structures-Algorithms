package Recursion_In_Arrays;

import java.util.Scanner;

public class MaxArray {
	
	private static int getMax(int array[], int idx) {
		
		if(idx == array.length) {
			return Integer.MIN_VALUE;
		}
		
		int max = array[idx];
		int faith = getMax(array, idx + 1);
		
		if(faith > max) {
			max = faith;
		}
		return max;
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = scn.nextInt();
		}
		
		int max = getMax(array, 0);
		System.out.println(max);
	}
}
