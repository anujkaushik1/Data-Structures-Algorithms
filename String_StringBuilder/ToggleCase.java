package String_StringBuilder;

import java.util.Scanner;

public class ToggleCase {
	
	private static String getToggle(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			char toggle = ' ';
			if(ch >= 'a' && ch <= 'z') {
				 toggle = (char)('A' + ch - 'a');
			
				 
			}
			else if(ch >= 'A' && ch <= 'Z') {
				toggle = (char)('a' + ch - 'A');
				
			}
			
			sb.append(toggle+"");
			
		}
		
		return sb.toString();
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		String toggle = getToggle(str);
		System.out.println(toggle);
	}

}
