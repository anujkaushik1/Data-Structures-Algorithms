package String_StringBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimes {
	
	private static ArrayList<Integer> removePrimes(ArrayList<Integer> al) {
		
		for(int i=al.size()-1;i>=0;i--) {
			int ele = al.get(i);
			if(isPrime(ele)) {
				al.remove(i);
			}
		}
		
		return al;
	}
	
	private static boolean isPrime(int n) {
		
		for(int i=2; i * i <= n;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			al.add(scn.nextInt());
		}
		
		al = removePrimes(al);
		System.out.println(al);
		
	}

}
