package Dynamic_Programming;

import java.util.Scanner;

public class MinCostMaze {
	
	private static int minCostMaze(int maze[][]) {
		
		int n = maze.length;
		int m = maze[0].length;
		
		int dp[][] = new int[n][m];
		
		dp[n - 1][m - 1] = maze[n - 1][m - 1];
		
		boolean flag = false;
		
		for(int i = n - 1; i >= 0; i--) {
			
			int j = 0;
			
			if(!flag) {
				j = m - 2;
			}
			
			else {
				j = m - 1;
			}
			
			for(; j >= 0; j--) {
				 
				 int nextCol = Integer.MAX_VALUE;
				 int nextRow = Integer.MAX_VALUE;
					
				 if(i + 1 < dp.length) {
					  nextCol = dp[i + 1][j];
				 }
				 
				 if(j + 1 < dp[0].length) {
					 nextRow = dp[i][j + 1];
				 }
				 
				 
				 int min = Math.min(nextCol, nextRow);
				 int val = maze[i][j];
				 
				 dp[i][j] = min + val;
				 
				 
			}
			
			flag = true;
		}
		
		return dp[0][0];		
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int maze[][] = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				maze[i][j] = scn.nextInt();
			}
		}
		
		int minCost = minCostMaze(maze);
		System.out.println(minCost);
	}

}
