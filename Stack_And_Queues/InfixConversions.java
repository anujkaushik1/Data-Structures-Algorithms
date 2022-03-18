package Stack_And_Queues;

import java.util.Scanner;
import java.util.Stack;

public class InfixConversions {
	
	private static void convertPrefixPostfix(String str) {
		
		Stack<String> pre = new Stack<>();
		Stack<String> post = new Stack<>();
		Stack<Character> oprtrs = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch == '(') {
				oprtrs.push(ch);
			}
			else if(ch == ')') {
				
				while(oprtrs.peek() != '(') {
					popingStack(oprtrs, pre, post);
				}
				
				oprtrs.pop();
				
			}
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				
				while(oprtrs.size() > 0 && oprtrs.peek() != '(' && precedence(ch) <= precedence(oprtrs.peek())) {
					
					popingStack(oprtrs, pre, post);
					
				}
				
				oprtrs.push(ch);
			}
			else {
				pre.push(ch + "");
				post.push(ch + "");
				
			}
		}
		
		while(oprtrs.size() > 0) {
			popingStack(oprtrs, pre, post);
		}
		
		System.out.println(pre.peek());
		System.out.println(post.peek());
	}
	
	private static void popingStack(Stack<Character> oprtrs, Stack<String> pre, Stack<String> post) {
		
		char optr = oprtrs.pop();
		String v2Pre = pre.pop();
		String v1Pre = pre.pop();
		
		String v2Post = post.pop();
		String v1Post = post.pop();
		
		String resPre = optr + v1Pre + v2Pre;
		pre.push(resPre);
		
		String resPost = v1Post + v2Post + optr;
		post.push(resPost);
		
		
	}
	
	private static int precedence(char ch) {
		
		if(ch == '-' || ch == '+') {			
			return 1;
		}
		else if(ch == '*' || ch == '/') {
			return 2;
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		convertPrefixPostfix(str);
		
	}

}
