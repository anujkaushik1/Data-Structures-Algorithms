package Intro_To_Recursion;

import java.util.Scanner;

public class PowerLinear {
	
	private static int getPower(int x, int n) {
		
		if(n == 0) {
			return 1;
		}
		
		int faith = getPower(x, n-1);
		int pow = faith * x;
		
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
