// 1st Approach
import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   int ans[] = new int[arr.length];
   
   Stack<Integer> st = new Stack<>();
   st.push(-1);
   
   for(int i = 0; i < arr.length; i++){
       
       int curr = arr[i];
       
       while(st.size() != 0 && st.peek() != -1 && curr >= arr[st.peek()]){
           st.pop();
       }
       
       if(st.size() == 0){
           ans[i] = i + 1;
       }
       else{
           ans[i] = i - st.peek();
       }
        st.push(i);  
   }
   
   return ans;
 }

}


// 2nd Approach
package Stack_And_Queues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpan {
	
	public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + "\n");
	    }
	    System.out.println(sb);
	  }

	public static void main(String[] args) throws Exception {
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    int[] span = solve(a);
	    display(span);
	 }

	 public static int[] solve(int[] arr){
		 
		 int ans[] = new int[arr.length];
		 
		 Stack<Integer> st = new Stack<>();
		 
		 ans[0] = 1;
		 st.push(0);
		 
		 for(int i = 1; i < arr.length; i++) {
			 
			 while(st.size() > 0 && arr[i] > arr[st.peek()]) {
				 st.pop();
			 }
			 
			 if(st.size() == 0) {
				 ans[i] = i + 1;
			 }
			 else {
				 int pos = i - st.peek();
				 ans[i] = pos;
			 }
			 
			 st.push(i);
		 }
	   
	   return ans;
	 }

}
