package Recursion_On_Way_Up;

import java.util.Scanner;

public class PrintMazePaths {
	
	private static void getMazePaths(int sr, int sc, int dr, int dc, String paths) {
		
		if(sr == dr && sc == dc) {
			System.out.println(paths);
			return ;
		}
		
		if(sr > dr || sc > dc) {
			return ;
		}
		
		getMazePaths(sr, sc + 1, dr, dc, paths + "h");
		getMazePaths(sr + 1, sc, dr, dc, paths + "v");
		
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
