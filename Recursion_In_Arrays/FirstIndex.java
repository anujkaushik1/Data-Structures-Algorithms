package Recursion_In_Arrays;

import java.util.Scanner;

public class FirstIndex {
	
	private static int firstIndex(int array[],int idx, int x) {
		
		if(idx == array.length) {
			return -1;
		}
		
		if(array[idx] == x) {		
			return idx;
		}else {
			int fi = firstIndex(array, idx + 1, x);
			return fi;
		}
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = scn.nextInt();
		}
		
		int x = scn.nextInt();
		
		int fi = firstIndex(array, 0, x);
		System.out.println(fi);
	}

}
