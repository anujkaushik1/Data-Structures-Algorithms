package Functions_Number_Systems;
import java.util.Scanner;
public class Q6 {
	
	private static int getSubtraction(int n1, int n2, int b) {
		
		int carry = 0;
		int ans = 0;
		int count = 0;
		
		if(n2 > n1) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		while(n1!=0 || n2!=0 || carry!=0) {
			
			int rem1 = n1 % 10;
			int rem2 = n2 % 10;
			
			int pow = getPower(count);
			int sub = rem1 - rem2 - carry;
			
			if(sub < 0) {
				sub += b;
				carry = 1;
				ans += sub * pow;
			}else {
				ans += sub * pow;
				carry = 0;	
			}
			
			n1 = n1 / 10;
			n2 = n2 / 10;
			count++;
			
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
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		int ans = getSubtraction(n1, n2, b);
		System.out.println(ans);
		
	}

}
