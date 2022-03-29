package Stack_And_Queues;

import java.io.*;
import java.util.*;

public class Main{
  
  private static void getPrefixEvaluation(String str){
      
      Stack<Integer> value = new Stack<>();
      Stack<String> infix = new Stack<>();
      Stack<String> postfix = new Stack<>();
      
      for(int i = str.length() - 1; i >= 0; i--){
          char ch = str.charAt(i);
          
          if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                fillValueStack(value, ch);
                fillInfixStack(infix, ch);
                fillPostfixStack(postfix, ch);
          } 
          else{
              value.push(ch - '0');
              infix.push(ch + "");
              postfix.push(ch + "");
          }   
  }
      System.out.println(value.pop());
      System.out.println(infix.pop());
      System.out.println(postfix.pop());
 }
  
  private static void fillValueStack(Stack<Integer> value, char optr){
      
      int v1 = value.pop();
      int v2 = value.pop();
      int ans = 0;
      if(optr == '+'){
          ans = v1 + v2;
      }
      else if(optr == '-'){
          ans = v1 - v2;
      }
      else if(optr == '*'){
          ans = v1 * v2;
      }
      else if(optr == '/'){
          ans = v1 / v2;
      }
      
      value.push(ans);
  }
  
  private static void fillInfixStack(Stack<String> infix, char optr){
      
      String v1 = infix.pop();
      String v2 = infix.pop();
      
      String res = "(" + v1 + optr + v2 + ")";
      infix.push(res);
  }
  
  private static void fillPostfixStack(Stack<String> postfix, char optr){
      String v1 = postfix.pop();
      String v2 = postfix.pop();
      
      String res = v1 + v2 + optr;
      postfix.push(res);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    
    getPrefixEvaluation(exp);
    
 }
}
