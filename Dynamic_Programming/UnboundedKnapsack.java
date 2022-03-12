package Dynamic_Programming;

import java.util.Scanner;

public class UnboundedKnapsack {
	
	private static int maxValueBag(int vals[], int wts[], int cap) {
		
		int n = vals.length;
		int dp[] = new int[cap + 1];
		
		dp[0] = 0;
		
		for(int i = 1; i < dp.length; i++) {
			
			int max = 0;
			
			for(int j = 0; j < n; j++) {
				
				if(i >= wts[j]) {
					
					int weight = wts[j];
					int value = vals[j];
					
					int prevVal = dp[i - weight];
					int total = prevVal + value;
					
					max = Math.max(max, total);
				}
			}
			
			dp[i] = max;
		}
		
		return dp[cap];
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
