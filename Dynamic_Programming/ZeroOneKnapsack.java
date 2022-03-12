package Dynamic_Programming;

import java.util.Scanner;

public class ZeroOneKnapsack {
	
	private static int maxValueBag(int vals[], int wts[], int cap) {
		
		int n = vals.length;
		
		int dp[][] = new int[n + 1][cap + 1];
		
		for(int i = 1; i < dp.length; i++) {
			
			for(int j = 1; j < dp[0].length; j++) {
				
				int prevVal = dp[i - 1][j];
				int weight = wts[i - 1];
				int values = vals[i - 1];
				
				if(j >= weight) {
					
					int remWeight = j - weight;
					
					int rVal = dp[i - 1][remWeight];
	
					int total = rVal + values;
					
					int max = Math.max(total, prevVal);
					
					dp[i][j] = max;
				}
				
				else {
					dp[i][j] = prevVal;
				}
				
			}
		}
		
		return dp[n][cap];
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int vals[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			vals[i] = scn.nextInt();
		}
		
		int wts[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			wts[i] = scn.nextInt();
		}
		
		int cap = scn.nextInt();
		
		int maxValue = maxValueBag(vals, wts, cap);
		System.out.println(maxValue);
	}

}
