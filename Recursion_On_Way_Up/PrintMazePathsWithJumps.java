package Recursion_On_Way_Up;

import java.util.Scanner;

public class PrintMazePathsWithJumps {
	
	private static void getMazePaths(int sr, int sc, int dr, int dc, String paths) {
		
		if(sr == dr && sc == dc) {
			System.out.println(paths);
			return ;
		}
		
		if(sr > dr || sc > dc) {
			return ;
		}
		
		for(int i=1;i<=dc-sc;i++) {
			getMazePaths(sr, sc + i, dr, dc, paths + "h" + i);
		}
		
		for(int i=1;i<=dr-sr;i++) {
			getMazePaths(sr + i, sc, dr, dc, paths + "v" + i);
		}
		
		for(int i=1;i<=dc-sc && i<=dr-sr;i++) {
			getMazePaths(sr + i, sc + i, dr, dc, paths + "d" + i);
		}
		
	}
	
	public static void main(String args[]) {
	
		Scanner scn = new Scanner(System.in);
		int dr = scn.nextInt();
		int dc = scn.nextInt();
		
		int sr = 1;
		int sc = 1;
		
		getMazePaths(sr, sc, dr, dc, "");
	}
	

}
