package Dynamic_Programming;

import java.util.Scanner;

public class ClimbStairWithMinimumMoves {
	
	private static int tabulation(int array[]) {
		
		int n = array.length;
		
		Integer dp[] = new Integer[n + 1];
		
		dp[n] = 0;
		
		for(int i = n - 1; i >= 0; i--) {
			
			int val = array[i];
			
			if(val > 0) {
				int min = Integer.MAX_VALUE;
				
				for(int j = 1; j <= val && i + j < dp.length; j++) {
					if(dp[i + j] != null) {
						min = Math.min(min, dp[i + j]);
					}	
					
				}
				
				if(min != Integer.MAX_VALUE) {
					dp[i] = min + 1;
				}
			}
			
		}
		
		return dp[0];
		
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = scn.nextInt();
		}
		
		int minMove = tabulation(array);
		System.out.println(minMove);
	}

}
