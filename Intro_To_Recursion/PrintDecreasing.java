package Intro_To_Recursion;

import java.util.Scanner;

public class PrintDecreasing {
	
	private static void printDecreasing(int n) {
		
		if(n == 0) {
			return ;
		}
		
		System.out.println(n);
		int faith = n - 1;
		printDecreasing(faith);
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		printDecreasing(n);
	}

}
