package Recursion_With_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubsequence {
	
	private static ArrayList<String> getSubsequence(String str){
		
		if(str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> res = getSubsequence(ros);
		ArrayList<String> ans = new ArrayList<>();
		
		for(String val : res) {
			ans.add("" + val);
		}
		
		for(String val : res) {
			ans.add(ch + val);
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		ArrayList<String> ans = getSubsequence(str);
		System.out.println(ans);
	}

}
