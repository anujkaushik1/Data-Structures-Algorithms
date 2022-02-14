package Functions_Number_Systems;
import java.util.Scanner;
public class Q4 {
	
	private static int getAnyBase(int n, int b1, int b2) {
		
		int decVal = getDecimal(n, b1);
		int baseVal = getBase(decVal, b2);
		return baseVal;
	}
	
	
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
	
	private static int getBase(int n, int b) {
		int ans = 0;
		int count = 0;
		while(n!=0) {
			int rem = n % b;
			int pow = getPower(count, 10);
			ans += pow * rem;
			
			n = n / b;
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
		int b1 = scn.nextInt();
		int b2 = scn.nextInt();
		
		int ans = getAnyBase(n, b1, b2);
		System.out.println(ans);
		
	}

}
