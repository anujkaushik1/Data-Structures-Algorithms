package Intro_To_Recursion;

import java.util.Scanner;

public class PrintZigZag {
	
	private static void getZigZag(int n) {
		
		if(n == 0) {
			return ;
		}
		
		System.out.print(n + " ");
		getZigZag(n - 1);
		System.out.print(n + " ");
		getZigZag(n - 1);
		System.out.print(n + " ");
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		getZigZag(n);
	}

}
