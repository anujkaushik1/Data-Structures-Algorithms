package Recursion_In_Arrays;

import java.util.Scanner;

public class DisplayArrayReverse {
	
	private static void displayArrayReverse(int array[], int idx) {
		
		if(idx == array.length) {
			return ;
		}
		
		displayArrayReverse(array, idx + 1);
		System.out.println(array[idx]);
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = scn.nextInt();
		}
		
		displayArrayReverse(array, 0);
	}

}
