package Dynamic_Programming;

import java.util.Scanner;

public class CoinChangePermutation {
	
	private static int getCountPermutation(int coins[], int tar) {
		
		int dp[] = new int[tar + 1];
		
		dp[0] = 1;
		
		for(int i = 1; i < dp.length; i++) {
				
			for(int j = 0; j < coins.length; j++) {
				
				int coin = coins[j];
				
				if(i >= coin) {
					
					dp[i] += dp[i - coin];
				}
			}
		}
		
		return dp[tar];
		
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int coins[] = new int[n];
		
		for(int i=0;i<n;i++) {
			coins[i] = scn.nextInt();
		}
		
		int tar = scn.nextInt();
		
		int count = getCountPermutation(coins, tar);
	    System.out.println(count);
	}

}
