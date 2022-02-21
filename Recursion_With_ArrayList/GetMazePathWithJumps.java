package Recursion_With_ArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class GetMazePathWithJumps {
	
	private static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
		
		if(sr == dr && sc == dc) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
		for(int i = 1; i <= dc - sc ; i++) {
			ArrayList<String> hPaths = getMazePaths(sr, sc + i, dr, dc);
			
			for(String val : hPaths) {
				ans.add("h" + i + val);
			}
		}
		
		for(int i = 1; i <= dr - sr ; i++) {
			ArrayList<String> vPaths = getMazePaths(sr + i, sc, dr, dc);
			
			for(String val : vPaths) {
				ans.add("v" + i + val);
			}
		}
		
		for(int i = 1; i <= dr - sr && i <= dc - sc ; i++) {
			ArrayList<String> dPaths = getMazePaths(sr + i, sc + i, dr, dc);
			
			for(String val : dPaths) {
				ans.add("d" + i + val);
			}
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
