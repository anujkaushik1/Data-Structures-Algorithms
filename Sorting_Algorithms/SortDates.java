package Sorting_Algorithms;

import java.util.Scanner;

public class SortDates {
	
	public static void sortDates(String[] arr) {
	    
	    countSort(arr, 1000000, 100, 32); // Days
	    countSort(arr, 10000, 100, 13); // Months
	    countSort(arr, 1, 10000, 2501); // Year
	  }

	  public static void countSort(String[] arr,int div, int mod, int range) {
	   
	   int freqarr[] = new int[range];
	   
	   for(int i=0;i<arr.length;i++){
	       int value = Integer.parseInt(arr[i], 10);
	       freqarr[value / div % mod]++;
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
	   
	   String ans[] = new String[arr.length];
	   
	   for(int i=ans.length-1;i>=0;i--){
	       int val = Integer.parseInt(arr[i], 10);
	       int pos = freqarr[val / div % mod];
	       ans[pos] = arr[i];
	       
	       freqarr[val / div % mod]--;
	       
	   }
	   
	   for(int i=0;i<ans.length;i++){
	        arr[i] = ans[i];
	   }
	  }

	  public static void print(String[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.println(arr[i]);
	    }
	  }

	  public static void main(String[] args) throws Exception {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    String[] arr = new String[n];
	    for (int i = 0; i < n; i++) {
	      String str = scn.next();
	      arr[i] = str;
	    }
	    sortDates(arr);
	    print(arr);
	  }

	}
