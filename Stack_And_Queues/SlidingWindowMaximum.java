package Stack_And_Queues;

import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMaximum {
	
	private static void getWindowMaximum(int array[], int k) {
		
		int nge[] = new int[array.length];
		
		Stack<Integer> st = new Stack<>();
		st.push(array.length - 1);
		
		nge[array.length - 1] = array.length;
		
		for(int i = array.length - 2; i >= 0; i--) {
			
			while(st.size() > 0 && array[i] > array[st.peek()]) {
				st.pop();
			}
			
			if(st.size() == 0) {
				nge[i] = array.length;
			}
			else {
				nge[i] = st.peek();
			}
			
			st.push(i);
		}
		
		
		for(int i = 0; i <= array.length - k; i++) {
			int j = i;
			
			while(nge[j] < i + k) {
				j = nge[j];
			}
			
			System.out.println(array[j]);
		}
		
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[] = new int[n];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();
		}
		
		int k = scn.nextInt();
		
		getWindowMaximum(array, k);
	}

}
