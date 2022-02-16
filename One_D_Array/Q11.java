package One_D_Array;

import java.util.Scanner;

public class Q11 {
	
	private static void printExchange(int array[], int findElement) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(array[mid] == findElement) {
				System.out.println(array[mid]);
				return ;
			}
			else if(array[mid] < findElement) {
				low = mid + 1;
			}
			else if(array[mid] > findElement) {
				high = mid - 1;
			}
		}
		
		System.out.println(array[low]);
		System.out.println(array[high]);
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		array = InputClass.getScanner(array, n, scn);
		int findElement = scn.nextInt();
		
		printExchange(array, findElement);
	}

}
