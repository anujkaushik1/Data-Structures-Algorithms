package Functions_Number_Systems;

import java.util.Scanner;
public class Q7 {
	
	private static int getAnswer(int b, int n1,int n2) {
		int count = 0;
		int finalAns = 0;
		while(n1!=0) {
			int rem = n1 % 10;
			int result = getMultiplication(rem, n2, b);
			int pow = getPower(count);
			
			int ans = result * pow;
			
			finalAns = getAddition(finalAns, ans, b);

			
			n1 /= 10;
			count++;
			
		}
		
		return finalAns;
	}
	
	private static int getMultiplication(int n, int n2, int b) {
		
		int ans = 0;
		int carry = 0;
		int count = 0;
		while(n2!=0 || carry!=0) {
			int rem = n2 % 10;
			
			int multi = (rem * n) + carry;
			int pow = getPower(count);	
					
			if(multi >= b) {
				int miniRem = multi % b;
				carry = multi / b;
				ans += miniRem * pow;	
			}
			else {
				ans += multi * pow;
				carry = 0;
			}
			
			count ++;
			n2 /= 10;
		}
		return ans;
	}
	
	private static int getPower(int n) {
		int count = 1;
		int pow = 1;
		while(count <= n) {
			pow *= 10;
			count++;
		}
		
		return pow;
	}
	
	private static int getAddition(int n1, int n2, int b) {
		
		int carry = 0, ans = 0, count = 0;
		
		while(n1!=0 || n2!=0 || carry!=0) {
			int rem1 = n1 % 10;
			int rem2 = n2 % 10;
			
			int sum = rem1 + rem2 + carry;
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
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		int ans = getAnswer(b, n1, n2);
		System.out.println(ans);
		
	
	}

}
