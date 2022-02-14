package OneDArray;

import java.util.Scanner;

public class Q10 {
	
	private static int[] getDifference(int array1[], int array2[]) {
		int ansArray[];
		
		if(array1.length > array2.length) {
			ansArray = new int[array1.length];
		}else {
			ansArray = new int[array2.length];
			int temp[] = array1;
			array1 = array2;
			array2 = temp;
		}
		
		int i = array1.length - 1;
		int j = array2.length - 1;
		int k = ansArray.length - 1;
		
		int borr = 0;
		
		while(k >= 0) {
			
			int diff = (i >= 0 ? array1[i] : 0) - ((j >= 0 ? array2[j] : 0)) - borr;
			
			if(diff < 0) {
				diff += 10;
				borr = 1;
			}else {
				borr = 0;
			}
			
			ansArray[k] = diff;
			
			i--;
			j--;
			k--;
		}
		
		return ansArray;
	}
	
	private static void displayArray(int array[]) {
		
		int idx = 0;
		
		while(idx < array.length) {
			if(array[idx] == 0) {
				idx++;
			}else {
				break;
			}
		}
		
		while(idx < array.length) {
			System.out.println(array[idx]);
			idx++;
		}
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int array1[] = new int[n1];
		
		array1 = InputClass.getScanner(array1, n1, scn);
		
		int n2 = scn.nextInt();
		int array2[] = new int[n2];
		
		array2 = InputClass.getScanner(array2, n2, scn);
		
		int ansArray[] = getDifference(array1, array2);
		
		displayArray(ansArray);
		
	}

}
