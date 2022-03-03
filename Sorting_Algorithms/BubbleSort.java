package Sorting_Algorithms;

import java.util.Scanner;

public class BubbleSort {
	
	private static void bubbleSort(int array[]) {
		
		int n = array.length;
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < n - i; j++) {
				int k = j + 1;
				
				if(isSmaller(array, j, k)) {
					swap(array, j, k);
				}
				
			}
		}
		
	}
	
	private static boolean isSmaller(int array[], int j, int k) {
		
		if(array[k] < array[j]) {
			return true;
		}
		
		return false;
		
	}
	
	private static void swap(int array[], int j, int k) {
		
		int temp = array[j];
		array[j] = array[k];
		array[k] = temp;
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
		
		for(int i=0;i<n;i++) {
			array[i] = scn.nextInt();
		}
		
		bubbleSort(array);
		display(array);

	}
	
	
}
