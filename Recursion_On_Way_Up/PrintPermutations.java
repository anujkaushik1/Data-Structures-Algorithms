package Recursion_On_Way_Up;

import java.util.Scanner;

public class PrintPermutations {
	
	private static void getPermutations(String str, String asf) {
		
		if(str.length() == 0) {
			System.out.println(asf);
			return ;
		}
		
		int len = str.length();
		
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			StringBuilder sb = new StringBuilder(str);
			sb.deleteCharAt(i);
			
			getPermutations(sb.toString(), asf + ch);
			
		}
		
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		getPermutations(str, "");
	}

}
