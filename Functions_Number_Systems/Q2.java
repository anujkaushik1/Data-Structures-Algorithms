package Functions_Number_Systems;
import java.util.Scanner;
public class Q2 {
	
	private static int getBase(int n, int b) {
		int ans = 0;
		int count = 0;
		while(n!=0) {
			int rem = n % b;
			int pow = getPower(count);
			ans += pow * rem;
			
			n = n / b;
			count++;
			
		}
		
		return ans;
	}
	
	private static int getPower(int n) {
		
		int count = 1, pow = 1;
		while(count <= n) {
			pow = pow * 10;
			count++;
		}
		
		return pow;
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		
		int ans = getBase(n, b);
		System.out.println(ans);
		
	}

}
