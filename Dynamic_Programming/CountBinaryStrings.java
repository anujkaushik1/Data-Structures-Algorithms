package Dynamic_Programming;

import java.util.Scanner;

public class CountBinaryStrings {

	private static int getCountBinary(int n) {
		
		int oldZeroCount = 1;
		int oldOneCount = 1;
		
		for(int i = 2; i <= n; i++) {
			
			int newOneCount = oldOneCount + oldZeroCount;
            int newZeroCount = oldOneCount;
            
            oldZeroCount = newZeroCount;
            oldOneCount = newOneCount;
		}
		
		return oldOneCount + oldZeroCount;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int count = getCountBinary(n);
		System.out.println(count);

	}

}
