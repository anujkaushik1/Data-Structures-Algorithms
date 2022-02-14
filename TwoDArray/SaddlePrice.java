package TwoDArray;

import java.util.Scanner;

public class SaddlePrice {
	
	private static void saddlePoint(int array[][]) {
		
		for(int i=0;i<array.length;i++) {
			
			int min = array[i][0];
			int minc = 0;
			for(int j=1;j<array[0].length;j++) {
				if(array[i][j] < min) {
					min = array[i][j];
					minc = j;
				}
			}
			boolean flag = true;
			for(int k=0;k<array.length;k++) {
				if(array[k][minc] > min) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println(min);
				return ;
			}
		}
		System.out.println("Invalid input");
		
	}
	


	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[][] = null;
		array = InputClass.getScanner(array, n, n, scn);
		
		 saddlePoint(array);


	}

}
