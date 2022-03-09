package Dynamic_Programming;

import java.util.Scanner;

public class TargetSumSubsets {
	
	private static boolean isTargetAchived(int array[], int tar) {
		
		int n = array.length;
		
		boolean dp[][] = new boolean[n + 1][tar + 1];
		
		for(int i = 0; i < dp.length; i++) {
			
			for(int j = 0; j < dp[0].length; j++) {
				
				if(i == 0 && j == 0) {
					dp[i][j] = true;
				}
				else if(j == 0) {
					dp[i][j] = true;
				}
				else if(i == 0) {
					dp[i][j] = false;
				}
				else {
					
					if(dp[i - 1][j] == true) {
						dp[i][j] = true;
						
					}else {
						int val = array[i - 1];
						
						if(j >= val) {
							
							if(dp[i - 1][j - val] == true) {
								dp[i][j] = true;
							}
						}
						
					}
				}
				
			}
		}
		
		return dp[n][tar];
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = scn.nextInt();
		}
		
		int tar = scn.nextInt();
		
		System.out.println(isTargetAchived(array, tar));
	}

}
