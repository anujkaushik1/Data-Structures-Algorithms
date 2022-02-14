package Functions_Number_Systems;
import java.util.Scanner;
public class Q1 {
	
	private static int getDigit(int n, int d) {
		int count = 0;
		while(n!=0) {
			int rem = n % 10;
			if(rem == d) {
				count++;
			}
			n = n / 10;
		}
		
		return count;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		
		int ans = getDigit(n, d);
		System.out.println(ans);
		
		
		
	}

}
