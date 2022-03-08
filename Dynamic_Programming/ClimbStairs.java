package Dynamic_Programming;

import java.util.Scanner;

public class ClimbStairs {
	
private static int memoization(int n, int dp[]) {
		
		if(n == 0) {
			return 1;
		}
		
		if(n < 0) {
			return 0;
		}
		
		if(dp[n] != 0) {
			return dp[n];
		}
		
		int n1 = memoization(n - 1, dp);
		int n2 = memoization(n - 2, dp);
		int n3 = memoization(n - 3, dp);
		
		int ans = n1 + n2 + n3;
		
		dp[n] = ans;
		
		return ans;
	} 

	private static int tabulation(int n, int dp[]) {
		
		dp[0] = 1;
		
		for(int i = 1; i <= n; i++) {
			
			if(i == 1) {
				dp[i] = dp[i - 1];
			}
			else if(i == 2) {
				dp[i] = dp[i - 1] + dp[i - 2];
			}
			else {
			   dp[i] = dp[i-1] + dp[i-2] + dp[i-3];	 
			}
		}
		
		return dp[n];
		
	}
	
	private static int recursive(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		if(n < 0) {
			return 0;
		}
		
		int n1 = recursive(n - 1);
		int n2 = recursive(n - 2);
		int n3 = recursive(n - 3);
		
		int ans = n1 + n2 + n3;
		
		return ans;
		
	}
	
	
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		// Recursion
		int path = recursive(n);
		System.out.println(path);
		
		int dp[] = new int[n + 1];
		
		// Memoization
		int memo = memoization(n, dp);
		System.out.println(memo);
		
		// Tabulation
		int tabu = tabulation(n, dp);
		System.out.println(tabu);
	}

}
