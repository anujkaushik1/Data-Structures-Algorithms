package Sorting_Algorithms;

import java.util.Scanner;

public class RadixSort {

	public static void radixSort(int[] arr) {
	    
	    int max = Integer.MIN_VALUE;
	    
	    for(int val : arr){
	        if(val > max){
	            max = val;
	        }
	    }
	    
	    int exp = 1;
	    while(exp <= max){
	        countSort(arr, exp);
	        exp *= 10;
	    }
	     
	  }

	  public static void countSort(int[] arr, int exp) {
	    int range = 10;
	   
	   int freqarr[] = new int[range];
	   
	   for(int i=0;i<arr.length;i++){
	       int value = arr[i];
	       freqarr[value / exp % 10]++;
	   }
	   
	   int x = 0;
	   int y = 1;
	   freqarr[x]--;
	   
	   while(y < freqarr.length){
	       int sum = freqarr[x] + freqarr[y];
	       freqarr[y] = sum;
	       x++;
	       y++;
	   }
	   
	   int ans[] = new int[arr.length];
	   
	   for(int i=ans.length-1;i>=0;i--){
	       int val = arr[i];
	       int pos = freqarr[val / exp % 10];
	       ans[pos] = val;
	       
	       freqarr[val / exp % 10]--;
	       
	   }
	   
	   for(int i=0;i<ans.length;i++){
	        arr[i] = ans[i];
	   }
	    System.out.print("After sorting on " + exp + " place -> ");
	    print(arr);
	  }

	  public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	  }

	  public static void main(String[] args) throws Exception {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();
	    }
	    radixSort(arr);
	    print(arr);
	  }

	}
