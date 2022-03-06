package Sorting_Algorithms;

import java.util.Scanner;

 class CountSort {

	public static void countSort(int[] arr, int min, int max) {
		   

		int range = max - min;
		   int freqLen = range + 1;
		   int freqArr[] = new int[freqLen];
		   
		   int len = arr.length;
		   
		   // Frequency Array
		   for(int i=0;i<len;i++){
		       int pos = arr[i] - min;
		       freqArr[pos] += 1;
		   }
		   
		   // Prefix Sum
		   int i = 0;
		   int j = 1;
		   freqArr[i] = freqArr[i] - 1;

		   while(j < freqLen){
		        int sum = freqArr[i] + freqArr[j];
		        freqArr[j] = sum;
		        i++;
		        j++;
		  }
		   
		  int ans[] = new int[len];
		  
		  for(int k = len - 1; k >= 0; k--){
			  int pos = freqArr[arr[k] - min];
			  ans[pos] = arr[k];
			  freqArr[arr[k] - min]--;
		  }
		  
		  for(int k=0;k<len;k++) {
			  arr[k] = ans[k];
		  }
		  
		  }

		  public static void print(int[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      System.out.println(arr[i]);
		    }
		  }

		  public static void main(String[] args) throws Exception {
		    Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int[] arr = new int[n];
		    int max = Integer.MIN_VALUE;
		    int min = Integer.MAX_VALUE;
		    for (int i = 0; i < n; i++) {
		      arr[i] = scn.nextInt();
		      max = Math.max(max, arr[i]);
		      min = Math.min(min, arr[i]);
		    }
		    countSort(arr,min,max);
		    print(arr);
		  }
}
