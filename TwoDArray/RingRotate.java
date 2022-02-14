package TwoDArray;

import java.util.Scanner;

public class RingRotate {
	
	private static int[][] rotateShell(int array[][], int s, int r) {
		
		int oneD[] = fillOneD(array, s);
		oneD = rotate(oneD, r);
		
		array = fillTwoD(array, s, oneD);
		
		return array;		
	}
	
	
	private static int[] fillOneD(int array[][], int s) {
		
		int minr = s - 1;
		int minc = s - 1;
		int maxr = array.length - s;
		int maxc = array[0].length - s;
		
		int length = 2 * (maxr - minr + maxc - minc);
		
		int oneD[] = new int[length];
		
		
		int count = 0;
			
		while(count < length) {
			
			for(int i=minr,j=minc;i<=maxr && count < length;i++) {
				oneD[count] = array[i][j];
				count++;
			}
			minc++;
			
			for(int i=maxr,j=minc;j<=maxc && count < length;j++) {
				oneD[count] = array[i][j];
				count++;
			}
			maxr--;
			
			for(int i=maxr,j=maxc;i>=minr && count < length;i--) {
				oneD[count] = array[i][j];
				count++;
			}
			maxc--;
			
			for(int i=minr,j=maxc;j>=minc && count < length;j--) {
				oneD[count] = array[i][j];
				count++;
			}
			minr++;
			
		}

		
		
		return oneD;
	}
	
	
	private static int[] rotate(int array[], int r) {
		
		r = r % array.length;
		
		if(r < 0) {
			r += array.length;
		}
		
		int index = array.length - r;
		
		array = reverse(array, 0, index - 1);
		array = reverse(array, index, array.length - 1);
		array = reverse(array, 0, array.length - 1);
		
		return array;
	}
	
	private static int[] reverse(int array[], int i, int j) {
		
		while(i < j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			
			i++;
			j--;
		}
		
		return array;
		
	}
	
	
	private static int[][] fillTwoD(int array[][], int s, int oneD[]){
		
		int minr = s - 1;
		int minc = s - 1;
		int maxr = array.length - s;
		int maxc = array[0].length - s;
				
		int count = 0;
		
			for(int i=minr,j=minc;i<=maxr;i++) {
				array[i][j] = oneD[count];
				count++;
			}
			minc++;
			
			for(int i=maxr,j=minc;j<=maxc;j++) {
				array[i][j] = oneD[count];
				count++;
			}
			maxr--;
			
			for(int i=maxr,j=maxc;i>=minr;i--) {
				array[i][j] = oneD[count];
				count++;
			}
			maxc--;
			
			for(int i=minr,j=maxc;j>=minc;j--) {
				array[i][j] = oneD[count];
				count++;
			}
			minr++;
			
				
		return array;
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int array[][] = null;
		array = InputClass.getScanner(array, n, m, scn);
		
		int s = scn.nextInt();
		int r = scn.nextInt();
		
		array = rotateShell(array, s, r);
		
		InputClass.display(array);

	}

}
