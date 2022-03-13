package Stack_And_Queues;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
	
	private static boolean isDuplicate(String str) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch == ')') {
				
				if(st.peek() == '(') {
					return true;
					
				}else {
					
					while(st.peek() != '(') {
						st.pop();
					}
					
					st.pop();
				}
			}
			else {
				st.push(ch);
			}
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		
		System.out.println(isDuplicate(str));
	}

}
