package Stack_And_Queues;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
	
	private static void getPostfixEvaluation(String str) {
		
		Stack<Integer> value = new Stack<>();
		Stack<String> infix = new Stack<>();
		Stack<String> prefix = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch == '*' || ch == '/' || ch == '-' || ch == '+') {
				
				fillValueStack(value, ch);
				fillInfixStack(infix, ch);
				fillPrefixStack(prefix, ch);
			}
			else {
				value.push(ch - '0');
				infix.push(ch + "");
				prefix.push(ch + "");
			}
		}
		
		System.out.println(value.pop());
		System.out.println(infix.pop());
		System.out.println(prefix.pop());
		
	}
	
	private static void fillValueStack(Stack<Integer> value, char optr) {
		
		int v2 = value.pop();
		int v1 = value.pop();
		
		int res = 0;
		
		if(optr == '+') {
			res = v1 + v2;
		}
		else if(optr == '-') {
			res = v1 - v2;
		}
		else if(optr == '*') {
			res = v1 * v2;
		}
		else {
			res = v1 / v2;
		}
		
		value.push(res);
	}
	
	private static void fillInfixStack(Stack<String> infix, char optr) {
		
		String v2 = infix.pop();
		String v1 = infix.pop();
		
		String res = "(" + v1 + optr + v2 + ")";
		
		infix.push(res);
	}
	
	private static void fillPrefixStack(Stack<String> prefix, char optr) {
		
		String v2 = prefix.pop();
		String v1 = prefix.pop();
		
		String res = optr + v1 + v2;
		
		prefix.push(res);
	}

	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		getPostfixEvaluation(str);
		
	}
}
