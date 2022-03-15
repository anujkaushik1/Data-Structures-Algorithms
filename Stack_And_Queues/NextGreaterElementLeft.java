package Stack_And_Queues;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementLeft {
	
	private static int[] greaterLeftElements(int array[]) {
		
		int ans[] = new int[array.length];
		
		Stack<Integer> st = new Stack<>();
		
		st.push(array.length - 1);
		
		for(int i = ans.length - 2; i >= 0; i--) {
			
			while(st.size() > 0 && array[i] > array[st.peek()]) {
				
				int pos = st.peek();
				ans[pos] = array[i];
				st.pop();
			}
			
			st.push(i);
			
		}
		
		while(st.size() > 0) {
			int pos = st.peek();
			ans[pos] = -1;
			st.pop();
		}
		
		return ans;
	}
	
	private static void display(int array[]) {
		
		for(int val : array) {
			
			System.out.print(val + " ");
		}
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = scn.nextInt();
		}
		
		int ans[] = greaterLeftElements(array);
		display(ans);
	}

}
