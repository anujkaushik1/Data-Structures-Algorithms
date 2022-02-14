package Functions_Number_Systems;
import java.util.Scanner;
public class Q3 {
	
	private static int getDecimal(int n, int b) {
		
		int count = 0;
		int ans = 0;
		while(n!=0) {
			int rem = n % 10;
			int pow = getPower(count, b);
			ans += rem * pow;
			
			n = n / 10;
			count++;
			
		}
		
		return ans;
	}
	
	private static int getPower(int n, int b) {
		int count = 1;
		int pow = 1;
		while(count <= n) {
			pow *= b;
			count++;
		}
		return pow;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		
		int ans = getDecimal(n, b);
		System.out.println(ans);
		
	}

}
