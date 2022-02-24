package Recursion_Backtracking;

import java.util.Scanner;

public class FloodFill {
	
	private static void floodFill(int maze[][], int sr, int sc, String asf, boolean visited[][]) {

		if(sr == maze.length - 1 && sc == maze[0].length - 1) {
			System.out.println(asf);
			return ;
		}
		
		if(sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1 || visited[sr][sc] == true) {
			return ;
		}
		
		visited[sr][sc] = true;
		
		floodFill(maze, sr - 1, sc, asf + "t", visited); // top
		floodFill(maze, sr, sc - 1, asf + "l", visited); // left
		floodFill(maze, sr + 1, sc, asf + "d", visited); // down
		floodFill(maze, sr, sc + 1, asf + "r", visited); // right
		
		visited[sr][sc] = false;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int array[][] = new int[n][m];
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				array[i][j] = scn.nextInt();
			}
		}
		
		int sr = 0;
		int sc = 0;
		
		boolean visited[][] = new boolean[n][m];
		
		floodFill(array, sr, sc, "", visited);
	}

}
