package TwoDArray;

import java.util.Scanner;

public class StateOfWakanda1 {
	
	private static void stateOfWakanda(int array[][]) {
		
		for(int j=0;j<array[0].length;j++) {
			if(j % 2 == 0) {
				for(int i=0;i<array.length;i++) {
					System.out.println(array[i][j]);
				}
			}else {
				for(int i=array.length-1;i>=0;i--) {
					System.out.println(array[i][j]);
				}
			}
			
		}
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int array[][] = null;
		
		array = InputClass.getScanner(array, n, m, scn);
		
		stateOfWakanda(array);
	}

}
