package Recursion_On_Way_Up;

import java.util.Scanner;

public class PrintKPC {
	
	private static String array[] = {
			".;",
			"abc",
			"def",
			"ghi",
			"jkl",
			"mno",
			"pqrs",
			"tu",
			"vwx",
			"yz"
	};
	
	private static void getKPC(String str, String ros) {
		
		if(str.length() == 0) {
			System.out.println(ros);
			return ;
		}
		
		char ch = str.charAt(0);
		String substr = str.substring(1);
		int index = ch - '0';
		String key = array[index];
		
		for(int i=0;i<key.length();i++) {
			char c = key.charAt(i);
			
			getKPC(substr, ros + c);
		}
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		getKPC(str, "");
		
	}

}
