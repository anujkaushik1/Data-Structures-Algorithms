package Stack_And_Queues;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	
	private static boolean isChecked(Stack<Character> st, char ch) {
		
		if(st.size() == 0) {
			return false;
		}
		
		if(st.peek() != ch) {
			return false;
		}
		
		if(st.peek() == ch) {
			st.pop();
		}
		
		return true;
	}
	
	private static boolean isBalanced(String str) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			}
			
			else if(ch == ')') {
				
				if(!isChecked(st, '(')) {
					return false;
				}
			}
			
			else if(ch == ']') {
				
				if(!isChecked(st, '[')) {
					return false;
				}
			}
			
			else if(ch == '}') {
				
				if(!isChecked(st, '{')) {
					return false;
				}
			}
			
			
			
		}
		
		if(st.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		System.out.println(isBalanced(str));
		
	}

}
