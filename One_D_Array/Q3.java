package One_D_Array;

import java.util.Scanner;

public class Q3 {
	
	private static void getChart(int array[]) {
		
		int max = getMax(array);
		
		for(int i=max;i>=1;i--) {
			
			for(int j=0;j<array.length;j++) {
				if(array[j] > i) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
			
		}
		
	}
	
	private static int getMax(int array[]) {
		int max = array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		return max;
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<array.length;i++) {
			array[i] = scn.nextInt();
		}
		
		getChart(array);
	}
}
