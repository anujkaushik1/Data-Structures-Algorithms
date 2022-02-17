package Intro_To_Recursion;

import java.util.Scanner;

public class PowerLogarithmic {
	
	private static int getPower(int x, int n){
		
		if(n == 0) {
			return 1;
		}
		
		int faith = getPower(x, n/2);
		int pow = 0;
		if(n % 2 == 0) {
			 pow = faith * faith;
		}else {
			 pow = faith * faith * x;
		}
		
		return pow;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		
		int pow = getPower(x, n);
		System.out.println(pow);
		
	}

}
