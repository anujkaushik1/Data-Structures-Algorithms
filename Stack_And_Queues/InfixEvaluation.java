package Stack_And_Queues;

import java.util.Scanner;
import java.util.Stack;

public class InfixEvaluation {
	
	private static int getInfixEvaluation(String str) {
		
		Stack<Integer> oprnds = new Stack<>();
		Stack<Character> oprtrs = new Stack<>();
		
		for(int i = 0; i < str.length(); i++){
			
			char ch = str.charAt(i);
			
			if(ch == '(') {
				oprtrs.push(ch);
			}
			else if(Character.isDigit(ch)) {
				oprnds.push(ch - '0');
			}
			else if(ch == ')') {
				
				while(oprtrs.peek() != '(') {
					
					char optr = oprtrs.pop();
					int v2 = oprnds.pop();
					int v1 = oprnds.pop();
					
					int operaVal = operation(v1, v2, optr);
					oprnds.push(operaVal);
					
				}
				
				oprtrs.pop();
			}
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				
				while(oprtrs.size() > 0 && oprtrs.peek() != '(' && precedence(ch) <= precedence(oprtrs.peek())) {
					
					char optr = oprtrs.pop();
					int v2 = oprnds.pop();
					int v1 = oprnds.pop();
					
					int operaVal = operation(v1, v2, optr);
					oprnds.push(operaVal);
				}
				
				oprtrs.push(ch);
			}
			
			
		}
		
		while(oprtrs.size() > 0) {
			
			char optr = oprtrs.pop();
			int v2 = oprnds.pop();
			int v1 = oprnds.pop();
			
			int operaVal = operation(v1, v2, optr);
			oprnds.push(operaVal);
			
		}
		
		int answer = oprnds.peek();
		
		return answer;
	}
	
	private static int precedence(char optr) {
		
		if(optr == '+') {
			return 1;
		}
		else if(optr == '-') {
			return 1;
		}
		else if(optr == '*') {
			return 2;
		}
		else{
			return 2;
		}
	}
	
	private static int operation(int v1, int v2, char optr) {
		
		if(optr == '+') {
			return v1 + v2;
		}
		else if(optr == '-') {
			return v1 - v2;
		}
		else if(optr == '*') {
			return v1 * v2;
		}
		else {
			return v1 / v2;
		}
	}
	
	public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		int infix = getInfixEvaluation(str);
		System.out.println(infix);
		
	}

}
