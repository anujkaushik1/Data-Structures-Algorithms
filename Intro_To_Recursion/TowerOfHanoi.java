package Intro_To_Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	
	private static void towerOfHanoi(int n1, int n2, int n3, int n) {
		
		if(n == 0) {
			return ;
		}
		
		towerOfHanoi(n1, n3, n2, n - 1);
		System.out.println(n + "[" + n1 + " -> " + n2 + "]");
		towerOfHanoi(n3, n2, n1, n - 1);
		
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int n3 = scn.nextInt();
		
		towerOfHanoi(n1, n2, n3, n);
	}

}
