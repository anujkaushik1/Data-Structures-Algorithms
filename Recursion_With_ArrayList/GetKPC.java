package Recursion_With_ArrayList;

import java.util.Scanner;
import java.util.ArrayList;
public class GetKPC {
	
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
	
	private static ArrayList<String> getKpc(String str){
		
		if(str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> res = getKpc(ros);
		ArrayList<String> ans = new ArrayList<>();
		
		int index = ch - '0';
		String key = array[index];
		
		for(int i=0;i<key.length();i++) {
			char c = key.charAt(i);
			
			for(String val : res) {
				ans.add(c + val);
			}
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		ArrayList<String> ans = getKpc(str);
		System.out.println(ans);
	}

}
