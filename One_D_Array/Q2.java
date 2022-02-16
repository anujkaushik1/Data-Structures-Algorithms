package One_D_Array;

import java.util.Scanner;

public class Q2 {
	
	private static int getElement(int array[], int d) {
		
		for(int i=0;i<array.length;i++) {
			if(array[i] == d) {
				return i;
			}
		}
				
		return -1;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<array.length;i++) {
			array[i] = scn.nextInt();
		}
		
		int d = scn.nextInt();
		
		int ans = getElement(array, d);
		System.out.println(ans);
	}

}
