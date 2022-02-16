package String_StringBuilder;

import java.util.Scanner;

public class StringCompression {
	
	private static String compression1(String str) {
		
		int i = 0;
		int j = i + 1;
		
		String ans = str.charAt(0) + "";
		
		while(j < str.length()) {
			if(str.charAt(i) == str.charAt(j)) {
				j++;
			}
			else {
				i = j;
				ans += str.charAt(i);
			}
		}
		
		return ans;
	}
	
	private static String compression2(String str) {
		
		int i = 0;
		int j = i + 1;
		int count = 1;
		
		String ans = str.charAt(0) + "";
		
		while(j < str.length()) {
			if(str.charAt(i) == str.charAt(j)) {
				j++;
				count++;
			}
			else {
				i = j;
				if(count > 1) {
					ans += count;
				}
				ans += str.charAt(i);
				count = 0;
			}
		}
		
		if(count > 1) {
			ans += count;
		}
		
		return ans;
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}
}
