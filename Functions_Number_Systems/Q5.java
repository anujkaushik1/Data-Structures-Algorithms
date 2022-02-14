package Functions_Number_Systems;
import java.util.Scanner;
public class Q5 {
	
	private static int getAddition(int n1, int n2, int b) {
		
		int carry = 0, ans = 0, count = 0;
		
		while(n1!=0 || n2!=0 || carry!=0) {
			int rem1 = n1 % 10;
			int rem2 = n2 % 10;
			
			int sum = rem1 + rem2;
			int pow = getPower(count);
			
			if(sum >= b) {
				int miniRem = sum % b;
				ans += miniRem * pow;
				carry = sum / b;
				
			}else {
				ans += sum * pow;
				carry = 0;
			}
			
			
			n1 /= 10;
			n2 /= 10;
			count++;
			
		}
		
		return ans;
	}
	
	private static int getPower(int n) {
		int count = 1, pow = 1;
		
		while(count <= n) {
			pow *= 10;
			count++;
		}
		
		return pow;
		
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		int ans = getAddition(n1, n2, b);
		System.out.println(ans);
		
	}

}
