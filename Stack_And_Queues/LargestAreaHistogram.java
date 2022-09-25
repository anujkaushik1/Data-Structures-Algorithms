import java.io.*;
import java.util.*;

public class Main{
    
    private static int[] nextSmallerElement(int arr[]){
        
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        for(int i = arr.length - 1; i >= 0; i--){
            int curr = arr[i];
            
            while(st.size() != 0 && st.peek() != -1 && curr <= arr[st.peek()]){
                st.pop();
            }
            
            ans[i] = st.peek();
            st.push(i);
            
        }
        return ans;
    }
    
    private static int[] prevSmallerElement(int arr[]){
         int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        
        for(int i = 0; i < arr.length; i++){
            int curr = arr[i];
            
          while(st.size() != 0 && st.peek() != -1 && curr <= arr[st.peek()]){
                st.pop();
            }
            
            ans[i] = st.peek();
            st.push(i);
            
        }
        return ans;
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    
    int next[] = nextSmallerElement(a);
    int prev[] = prevSmallerElement(a);
    int maxArea = Integer.MIN_VALUE;
    
    for(int i = 0; i < a.length; i++){
        int len = a[i];
         if(next[i] == -1) {
                next[i] = n;
            }
        int bre = next[i] - prev[i] - 1;
        
        int area = len * bre;
        
        if(area > maxArea){
            maxArea = area;
        }
        
    }
    
    System.out.println(maxArea);
    
 }
}






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
