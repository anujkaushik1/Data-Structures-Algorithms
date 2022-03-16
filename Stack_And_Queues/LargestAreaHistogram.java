package Stack_And_Queues;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogram {
	
	private static int getLargestArea(int array[]) {
		
		int rb[] = new int[array.length];
		
		Stack<Integer> st = new Stack<>();
		st.push(array.length - 1);
		
		rb[array.length - 1] = array.length;
		
		for(int i = array.length - 2; i >= 0; i--) {
			
			while(st.size() > 0 && array[i] < array[st.peek()]) {
				st.pop();
			}
			
			if(st.size() == 0) {
				rb[i] = array.length;
			}
			else {
				rb[i] = st.peek();
			}
			
			st.push(i);
			
		}
		
		
		int lb[] = new int[array.length];
		
		st = new Stack<>();
		st.push(0);
		
		lb[0] = -1;
		
		for(int i = 1; i < array.length; i++) {
			
			while(st.size() > 0 && array[i] < array[st.peek()]) {
				st.pop();
			}
			
			if(st.size() == 0) {
				lb[i] = -1;
			}
			else {
				lb[i] = st.peek();
			}
			
			st.push(i);
			
		}
		
		
		int maxArea = 0;
		
		for(int i = 0; i < array.length; i++) {
			int width = rb[i] - lb[i] - 1;
			int length = array[i];
			int area = length * width;
			
			if(area > maxArea) {
				maxArea = area;
			}
		}
		
		return maxArea;
		
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int array[] = new int[n];
		
		for(int i=0; i < n; i++) {
			array[i] = scn.nextInt();
		}
		
		int maxArea = getLargestArea(array);
		System.out.println(maxArea);
	}

}
