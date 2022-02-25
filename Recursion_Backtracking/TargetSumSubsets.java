package Recursion_Backtracking;

import java.util.Scanner;

public class TargetSumSubsets {
	
	private static void printTargetSumSubsets(int array[], int idx, String set, int sos, int tar) {
		
		if(idx == array.length) {
			if(sos == tar) {
				System.out.println(set + ".");
			}
			
			return ;
		}
		
		printTargetSumSubsets(array, idx + 1, set + array[idx] + ", ", sos + array[idx], tar);
		printTargetSumSubsets(array, idx + 1, set, sos, tar);
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = scn.nextInt();
		}
		
		int tar = scn.nextInt();
		
		printTargetSumSubsets(array, 0, "", 0, tar);
		
	}

}
