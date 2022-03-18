package Stack_And_Queues;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {
	
	
	private static void findCelebrity(int array[][], Stack<Integer> st) {
		
		while(st.size() != 1) {
			
			int v2 = st.pop();
			int v1 = st.pop();
			
			if(array[v1][v2] == 0) {
				st.push(v1);
			}
			else if(array[v1][v2] == 1) {
				st.push(v2);
			}
		}
		
		int x = st.pop();
		
		if(isCelebrity(array, x)) {
			System.out.println(x);
		}
		else {
			System.out.println("none");
		}
		
	}
	
	private static boolean isCelebrity(int array[][], int x) {
		
		int n = array.length;
		
		for(int j = 0; j < n; j++) {
			
			if(array[x][j] == 1) {
				return false;
			}
			
		}
		
		for(int i = 0; i < n; i++) {
			
			if(i == x) {
				continue;
			}
			
			if(array[i][x] == 0) {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int array[][] = new int[n][n];
		
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < n; i++) {	
			String line = scn.next();
			
			for(int j = 0; j < n; j++) {
				array[i][j] = line.charAt(j) - '0';
			}
			
			st.push(i);
		}
		
		findCelebrity(array, st);
		
	}

}
