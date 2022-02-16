package String_StringBuilder;

import java.util.Scanner;

public class PalindromicSubstrings {
	
	private static void getPalindromicSubString(String str) {
		
		for(int i=0;i<str.length();i++) {
			String substr = "";
			for(int j=i;j<str.length();j++) {
				substr += str.charAt(j);
				
				if(isPalindrome(substr)) {
					System.out.println(substr);
				}
			}
		}
		
	}
	
	private static boolean isPalindrome(String str) {
		
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j) {
			
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		getPalindromicSubString(str);
	}

}
