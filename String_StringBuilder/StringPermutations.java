package String_StringBuilder;
import java.util.Scanner;
public class StringPermutations {
	
	private static void getStringPermutations(String str) {
		
		int length = str.length();
		int limit = getLimit(length);
	
		for(int i=0;i<limit;i++) {
			int divisor = length;
			int divident = i;
			String ans = "";
			
			StringBuilder sb = new StringBuilder(str);
			
			while(divisor != 0) {
				
				int rem = divident % divisor;
				char ch = sb.charAt(rem);
				ans += ch;
				sb.deleteCharAt(rem);
				
				divident /= divisor;
				
				divisor--;
			}
			
			System.out.println(ans);
		}
		
	}
	
	
	private static int getLimit(int n) {
		
		int ans = 1;
		
		for(int i=1;i<=n;i++) {
			ans *= i;
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		getStringPermutations(str);
	}

}
