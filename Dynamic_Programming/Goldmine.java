package Dynamic_Programming;

import java.util.Scanner;

public class Goldmine {
	
	private static int maxGold(int mine[][]) {
		
		int n = mine.length;
		int m = mine[0].length;
		
		int dp[][] = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			dp[i][m - 1] = mine[i][m - 1];
		}
		
		for(int j = m - 2; j >= 0; j--) {
		
			for(int i = 0; i < n; i++) {
							
				int rightTop = Integer.MIN_VALUE;
				int rightBottom = Integer.MIN_VALUE;
				
				if(i - 1 >= 0) {
					rightTop = dp[i - 1][j + 1];
				}
				
				int nextRight = dp[i][j + 1];
				
				if(i + 1 < dp.length) {
					rightBottom = dp[i + 1][j + 1];
				}
				
				int max = Math.max(rightTop, Math.max(nextRight, rightBottom));
				int val = mine[i][j];
				
				dp[i][j] = val + max;
				
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			
			max = Math.max(max, dp[i][0]);
		}
		
		return max;
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int mine[][] = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mine[i][j] = scn.nextInt();
			}
		}
		
		int ans =  maxGold(mine);
		System.out.println(ans);
	}
}
