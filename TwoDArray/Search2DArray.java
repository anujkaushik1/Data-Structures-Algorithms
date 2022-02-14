package TwoDArray;

import java.util.Scanner;

public class Search2DArray {
	
	private static void search(int array[][], int x) {
		
		int low = 0;
		int high = array.length - 1;
		
		
			while(low < array.length && high >= 0) {
				if(array[low][high] == x) {
					System.out.println(low);
					System.out.println(high);
					return ;
				}else if(array[low][high] < x) {
					low++;
				}else if(array[low][high] > x) {
					high--;
				}
			}
		
		
		System.out.println("Not Found");
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[][] = null;
		array = InputClass.getScanner(array, n, n, scn);
		
		int x = scn.nextInt();
		
		search(array, x);
	}

}
