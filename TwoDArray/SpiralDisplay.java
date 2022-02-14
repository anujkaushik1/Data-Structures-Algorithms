package TwoDArray;

import java.util.Scanner;

public class SpiralDisplay {
	
	private static void spiralDisplay(int array[][]){
		
		int rmin = 0;
		int cmin = 0;
		int rmax = array.length - 1;
		int cmax = array[0].length - 1;
		
		int count = 0;
		int n = array.length;
		int m = array[0].length;
		
		while(count < n * m) {
		
			for(int i=rmin,j=cmin;i<=rmax && count < n * m;i++) {
				System.out.println(array[i][j]);
				count++;
			}
			cmin++;
			
			for(int i=rmax,j=cmin;j<=cmax && count < n * m;j++) {
				System.out.println(array[i][j]);
				count++;
			}
			rmax--;
			
			for(int i=rmax,j=cmax;i>=rmin && count < n * m;i--) {
				System.out.println(array[i][j]);
				count++;
			}
			cmax--;
			
			for(int i=rmin,j=cmax;j>=cmin && count < n * m;j--) {
				System.out.println(array[i][j]);
				count++;
			}
			rmin++;
		}
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int array[][] = new int[n][m];
		
		array = InputClass.getScanner(array, n, m, scn);
		
		spiralDisplay(array);
		
	}

}
