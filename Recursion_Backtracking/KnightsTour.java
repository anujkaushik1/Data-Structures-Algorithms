package Recursion_Backtracking;

import java.util.Scanner;

public class KnightsTour {
	
	private static void printKnightsTour(int chess[][], int row, int col, int upcomingMove) {
	
		if(row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] != 0) {
			return ;
		}
		
		if(upcomingMove == chess.length * chess.length) {
			chess[row][col] = upcomingMove;
			displayBoard(chess);
			chess[row][col] = 0;
		}
		
		chess[row][col] = upcomingMove;
		
		printKnightsTour(chess, row - 2, col + 1, upcomingMove + 1);
		printKnightsTour(chess, row - 1, col + 2, upcomingMove + 1);
		printKnightsTour(chess, row + 1, col + 2, upcomingMove + 1);
		printKnightsTour(chess, row + 2, col + 1, upcomingMove + 1);
		printKnightsTour(chess, row + 2, col - 1, upcomingMove + 1);
		printKnightsTour(chess, row + 1, col - 2, upcomingMove + 1);
		printKnightsTour(chess, row - 1, col - 2, upcomingMove + 1);
		printKnightsTour(chess, row - 2, col - 1, upcomingMove + 1);
		
		chess[row][col] = 0;
		
	}
	
	private static void displayBoard(int chess[][]) {
		
		for(int i=0;i<chess.length;i++) {
			for(int j=0;j<chess[0].length;j++) {
				System.out.print(chess[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[][] = new int[n][n];
		
		int row = scn.nextInt();
		int col = scn.nextInt();
		
		printKnightsTour(array, row, col, 1);
	}

}
