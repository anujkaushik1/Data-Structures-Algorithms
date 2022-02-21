package Recursion_With_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
	
	private static ArrayList<String> getStairPaths(int n){
		
		if(n == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		if(n < 0) {
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		
		ArrayList<String> path1 = getStairPaths(n - 1);
		ArrayList<String> path2 = getStairPaths(n - 2);
		ArrayList<String> path3 = getStairPaths(n - 3);
		
		ArrayList<String> ans = new ArrayList<>();
		
		for(String val : path1) {
			ans.add("1" + val);
		}
		
		for(String val : path2) {
			ans.add("2" + val);
		}
		
		for(String val : path3) {
			ans.add("3" + val);
		}
		
		return ans;
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		ArrayList<String> ans = getStairPaths(n);
		System.out.println(ans);
	}
}
