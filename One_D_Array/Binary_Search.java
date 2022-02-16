package One_D_Array;

import java.util.Scanner;

public class Binary_Search {
	
	public static void main(String args[]) {
		int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 10};
		Scanner scn = new Scanner(System.in);
		int elementFind = scn.nextInt();
		
		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) / 2;
		int temp = 0;
		
		while(low <= high) {
			
			if(array[mid] == elementFind) {
				System.out.println(mid);
				temp = 1;
				break;
			}
			else if(array[mid] < elementFind) {
				low = mid + 1;
				mid = (low + high) / 2;
			}
			else if(array[mid] > elementFind) {
				high = mid - 1;
				mid = (low + high) / 2;
			}
			
		}
		
		if(temp == 0) {
			System.out.println(-1);
		}
		
	}

}
