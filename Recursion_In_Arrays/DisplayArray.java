 package Recursion_In_Arrays;

import java.util.Scanner;

public class DisplayArray {
	
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
		
		displayArray(array, 0);
	}

}
