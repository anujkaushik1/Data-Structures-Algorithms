package Intro_To_Recursion;

import java.util.Scanner;

public class Factorial {
	
	private static int getFactorial(int n) {
		
		if(n == 0) {
			return 1;
		}
		
		int faith = getFactorial(n - 1);
		int fact = faith * n;
		
		return fact;
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int fact = getFactorial(n);
		System.out.println(fact);
		
	}

}
