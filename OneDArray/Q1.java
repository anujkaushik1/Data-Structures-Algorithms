package OneDArray;
import java.util.Scanner;
public class Q1 {
	
	private static int getSpan(int array[]) {
		int max = array[0];
		int min = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		return max - min;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<array.length;i++) {
			array[i] = scn.nextInt();
		}
		
		int ans = getSpan(array);
		System.out.println(ans);
		
	}

}
