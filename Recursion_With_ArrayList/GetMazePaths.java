package Recursion_With_ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class GetMazePaths {
	
	private static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
		
		if(sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		if(sr > dr || sc > dc ) {
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		
		ArrayList<String> hPaths = getMazePaths(sr, sc + 1, dr, dc);
		ArrayList<String> vPaths = getMazePaths(sr + 1, sc, dr, dc);
		
		ArrayList<String> ans = new ArrayList<>();
		
		for(String val : hPaths) {
			ans.add("h" + val);
		}
		
		for(String val : vPaths) {
			ans.add("v" + val);
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int dr = scn.nextInt();
		int dc = scn.nextInt();
		int sr = 1;
		int sc = 1;
		
		ArrayList<String> ans = getMazePaths(sr, sc, dr, dc);
		System.out.println(ans);
		
	}

}
