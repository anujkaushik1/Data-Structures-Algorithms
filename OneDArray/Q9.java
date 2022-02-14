package OneDArray;

import java.util.Scanner;

public class Q9 {
	
	private static void getSubSets(int array[]) {
		
		int limit = array.length;
		int power = getPower(limit);
		
		for(int i=0;i<power;i++) {
			int count = 1;
			int divident = i;
			String str = "";
			
			while(count <= limit) {
				int rem = divident % 2;
				str = rem + str;
				
				divident /= 2;
				
				count ++;
			}
			for(int k=0;k<str.length();k++) {
				
				char val = str.charAt(k);
				
				if(val == '0') {
					System.out.print("- ");
				}else {
					System.out.print(array[k]+" ");
				}
				
			}
			System.out.println();
			
		}
		
		
	}
	
	private static int getPower(int n) {
		int count = 1;
		int ans = 1;
		while(count <= n) {
			ans *= 2;
			count ++;
		}
		
		return ans;
	}

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[] = null;
		
		array = InputClass.getScanner(array, n, scn);
		
		getSubSets(array);
		
		
	}
}
