package Dynamic_Programming;

import java.util.Scanner;

public class ClimbStairsWithVariableJumps {
	
	private static int tabulation(int array[], int dp[]) {
		
		int n = array.length;
		dp[n] = 1;
		
		for(int i = n-1; i >= 0; i--) {
			
			for(int j = 1; j <= array[i] && i + j < dp.length; j++) {
				
				dp[i] += dp[i + j];
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
		
		int dp[] = new int[n + 1];
		
		int ways = tabulation(array, dp);
		System.out.println(ways);
	}

}
