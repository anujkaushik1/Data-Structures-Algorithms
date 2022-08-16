import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int m = scn.nextInt();
       int arr[][] = new int[n][m];
       
       for(int i = 0; i < n; i++){
           for(int j = 0; j < m; j++){
               arr[i][j] = scn.nextInt();
           }
       }
       int s = scn.nextInt();
       int r = scn.nextInt();
       ringRotate(arr, r, s);
    }
    
    private static void ringRotate(int arr[][], int r, int s){
       int oned[] = fillOneD(arr, s);
       rotate(oned, r);
       
       fillTwoD(arr, oned , s);
       display(arr);
    }
    
    private static int[] fillOneD(int arr[][], int s){
        
        int minr = s - 1, minc = s - 1;
        int maxr = arr.length - s, maxc = arr[0].length - s;
        
        int len = 2 * (maxr - minr + maxc - minc);
        
        int oned[] = new int[len];
        int idx = 0;
        for(int i = minr,j = minc; i <= maxr; i++){
            oned[idx] = arr[i][j];
            idx++;
        }
        
        minc++;
        
        for(int i = maxr, j = minc; j <= maxc; j++){
            oned[idx] = arr[i][j];
            idx++;
        }
        
        maxr--;
        
        for(int i = maxr, j = maxc; i >= minr; i--){
            oned[idx] = arr[i][j];
            idx++;
        }
        
        maxc--;
        
        for(int i = minr, j = maxc; j >= minc; j--){
            oned[idx] = arr[i][j];
            idx++;
        }

        return oned;
    }
    
    private static void fillTwoD(int arr[][], int oned[], int s){
        
         
        int minr = s - 1, minc = s - 1;
        int maxr = arr.length - s, maxc = arr[0].length - s;
        int idx = 0;
        
        for(int i = minr,j = minc; i <= maxr; i++){
           arr[i][j] =  oned[idx];
            idx++;
        }
        
        minc++;
        
        for(int i = maxr, j = minc; j <= maxc; j++){
           arr[i][j] =  oned[idx];
            idx++;
        }
        
        maxr--;
        
        for(int i = maxr, j = maxc; i >= minr; i--){
            arr[i][j] =  oned[idx];
            idx++;
        }
        
        maxc--;
        
        for(int i = minr, j = maxc; j >= minc; j--){
            arr[i][j] =  oned[idx];
            idx++;
        }
    }

    private static void rotate(int arr[], int r){
        
        r = r % arr.length;
        
        if(r < 0){
            r += arr.length;
        }
        
        int len = arr.length - r;
        reverse(arr, 0, len - 1);
        reverse(arr, len, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        
        
    }
    
    private static void reverse(int arr[], int i, int j){
        
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
        
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
