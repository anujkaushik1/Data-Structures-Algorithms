package Dynamic_Programming;

import java.util.Scanner;

public class CoinChangeCombination {
	
	private static int getCountCombination(int array[], int tar) {
		
		int dp[] = new int[tar + 1];
		
		dp[0] = 1;
		
		for(int i = 0; i < array.length; i++) {
			
			int coin = array[i];
			
			for(int j = coin; j < dp.length; j++) {
				
				dp[j] += dp[j - coin];
			}
		}
		
		return dp[tar];
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = scn.nextInt();
		}
		
		int tar = scn.nextInt();
		
		int count = getCountCombination(array, tar);
		System.out.println(count);
	}
	

}
