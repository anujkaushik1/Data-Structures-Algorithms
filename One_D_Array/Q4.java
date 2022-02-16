package One_D_Array;

import java.util.Scanner;

public class Q4 {
	
	private static void getSum(int array1[], int array2[]) {
		
		int carry = 0;
		int ansArray[];
		
		if(array1.length > array2.length) {
			ansArray = new int[array1.length];
		}
		else {
			ansArray = new int[array2.length];
		}
		
		int k = ansArray.length - 1;
		int i = array1.length - 1;
		int j = array2.length - 1;
				
		while(k>=0) {
			
			int sum = (i >= 0 ? array1[i] : 0) + ((j >= 0 ? array2[j] : 0)) + carry;
			
			if(sum >= 10) {
				int rem  = sum % 10;
				ansArray[k] = rem;
				carry = sum / 10;
			}
			else {
				ansArray[k] = sum;
				carry = 0;
			}
			
			k--;
			i--;
			j--;
			
		}
		
		displayArray(ansArray, carry);
			
	}
	
	private static void displayArray(int array[], int carry) {
		
		if(carry > 0) {
			System.out.println(carry);
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

	private static int[] getScanner(int array[], Scanner scn) {
		
		for(int i=0;i<array.length;i++) {
			array[i] = scn.nextInt();
		}
		
		return array;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		int array1[] = new int[n1];
		array1 = getScanner(array1, scn);
		
		int n2 = scn.nextInt();
		int array2[] = new int[n2];
		array2 = getScanner(array2, scn);
		
		getSum(array1, array2);
		
			
	}

}
