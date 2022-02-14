package TwoDArray;

import java.util.Scanner;

public class ExitPointMatrix {
	
	private static void exitPoint(int array[][]) {
		
		int dir = 0;
		int i = 0;
		int j = 0;
		
		while(true) {
			dir = (dir + array[i][j]) % 4;
			
			if(dir == 0) {
				j++;
			}else if(dir == 1) {
				i++;
			}else if(dir == 2) {
				j--;
			}else {
				i--;
			}
			
			if(i < 0) {
				i++;
				break;
			}
			else if(j < 0) {
				j++;
				break;
			}
			else if(i >= array.length) {
				i--;
				break;
			}
			else if(j >= array[0].length) {
				j--;
				break;
			}
		}
		System.out.println(i);
		System.out.println(j);
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int array[][] = null;
		array = InputClass.getScanner(array, n, m, scn);
		
		exitPoint(array);
	}

}
