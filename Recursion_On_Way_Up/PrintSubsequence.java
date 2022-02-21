package Recursion_On_Way_Up;

import java.util.Scanner;

public class PrintSubsequence {
	
	private static void printSS(String str, String ros) {
		
		if(str.length() == 0) {
			System.out.println(ros);
			return ;
		}
		
		char ch = str.charAt(0);
		String substr = str.substring(1);
		
		printSS(substr, ros + ch);
		printSS(substr, ros);
		
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		printSS(str, "");
	}
}
