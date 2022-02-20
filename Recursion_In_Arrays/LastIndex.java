package Recursion_In_Arrays;

import java.util.Scanner;

public class LastIndex {
	
	private static int lastIndex(int array[], int idx, int x) {
		
		if(idx == array.length) {
			return -1;
		}
		
		int li = lastIndex(array, idx + 1, x);
		
		if(li == -1) {
			if(array[idx] == x) {
				return idx;
			}
			else {
				return -1;
			}
		}
		
		return li;
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = scn.nextInt();
		}
		
		int x = scn.nextInt();
		
		int li = lastIndex(array, 0, x);
		System.out.println(li);
		
	}

}
