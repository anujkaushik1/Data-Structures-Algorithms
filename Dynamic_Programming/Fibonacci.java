package Dynamic_Programming;

import java.util.Scanner;

public class Fibonacci {
	
	private static int memoization(int n, int dp[]) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		if(dp[n] != 0) {
			return dp[n];
		}
		
		int a = memoization(n - 1, dp);
		int b = memoization(n - 2, dp);
		
		int ans = a + b;
		dp[n] = ans;
		
		return ans;
		
	}
	
	private static int tabulation(int n, int dp[]) {
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		return dp[n];
		
	}
	
	private static int recursive(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		int a = recursive(n - 1);
		int b = recursive(n - 2);
		
		int ans = a + b;
		return ans;
		
	}

	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		// Recursive
		int recur = recursive(n);
		System.out.println(recur);
		
		int dp[] = new int[n + 1];
		
		// Memoization
		int memo = memoization(n, dp);
		System.out.println(memo);
		
		// Tabulation
		int tabu = tabulation(n, dp);
		System.out.println(tabu);
	}

}
