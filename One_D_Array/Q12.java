package One_D_Array;

import java.util.Scanner;

public class Q12 {
	
	private static int firstIndex(int array[], int findElement) {
		int low = 0;
		int high = array.length - 1;
		int ans = -1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(array[mid] == findElement) {
				high = mid - 1;
				ans = mid;
			}
			else if(array[mid] < findElement) {
				low = mid + 1;
			}
			else if(array[mid] > findElement) {
				high = mid - 1;
			}
		}
		return ans;
		
	}
	
	private static int lastIndex(int array[], int findElement) {
		int low = 0;
		int high = array.length - 1;
		int ans = -1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(array[mid] == findElement) {
				low = mid + 1;
				ans = mid;
			}else if(array[mid] < findElement) {
				low = mid + 1;
			}else if(array[mid] > findElement) {
				high = mid - 1;
			}
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		array = InputClass.getScanner(array, n, scn);
		
		int findElement = scn.nextInt();
		
		System.out.println(firstIndex(array, findElement));
		System.out.println(lastIndex(array, findElement));
	}

}
