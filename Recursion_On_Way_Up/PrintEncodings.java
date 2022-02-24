package Recursion_On_Way_Up;

import java.util.Scanner;

public class PrintEncodings {
	
	private static void printEncodings(String str, String asf) {
		
		if(str.length() == 0) {
			System.out.println(asf);
			return ;
		}
		if(str.charAt(0) == '0') {
			return ;
		}
		
		String ch1 = str.substring(0, 1);
		String ros1 = str.substring(1);
		
		char ch_1 = (char) (Integer.parseInt(ch1) + 'a' - 1);
		
		printEncodings(ros1, asf + ch_1);
		
		if(str.length() >= 2) {
			String ch01 = str.substring(0,2);
			String ros01 = str.substring(2);
			int val = Integer.parseInt(ch01);
			
			if(val < 26) {
				printEncodings(ros01, asf + (char) (Integer.parseInt(ch01) + 'a' - 1));
			}
		}
		
				
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		printEncodings(str, "");
	}

}
