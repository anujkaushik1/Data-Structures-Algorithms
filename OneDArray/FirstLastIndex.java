import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    
    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }
    int x = scn.nextInt();
    
    getFirstLastIn(arr, x);
 }
 private static void getFirstLastIn(int arr[], int x){
    int pot = 0;
    boolean flag = false;
    int fi = 0;
    for(int i = 0; i < arr.length; i++){
        int val = arr[i];
        
        if(val == x && !flag){
            fi = i;
            flag = true;
            pot = i;
        }
        if(val == x){
            pot = i;
        }
    }
    if(!flag){
        System.out.println(-1);
        System.out.println(-1);
    }else{
        System.out.println(fi);
        System.out.println(pot);
    }
    
 }

}
