import java.io.*;
import java.util.*;

  public class Main{
    
    private static void getCommonElements(int arr1[], int arr2[]){
      
      // Time Complexity => O(N1 + N2)
      // Space Complexity => O(N1) [Additional HashMap Space]
        
      HashMap<Integer, Integer> hm = new HashMap<>();
      
      for(int i = 0; i < arr1.length; i++){
          int val = arr1[i];
          
          if(!hm.containsKey(val)){
              hm.put(val, 1);
          }
          else{
              int freq = hm.get(val);
              hm.put(val, freq + 1);
          }
      }
      
      for(Integer val : arr2){
          
          if(hm.containsKey(val) && hm.get(val) > 0){
              System.out.println(val);
              int freq = hm.get(val);
              hm.put(val, freq - 1);
          }
          
      }
        
    }

 public static void main(String[] args) throws Exception {
            
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int arr1[] = new int[n1];
    
    for(int i = 0; i < n1; i++){
        arr1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    int arr2[] = new int[n2];
    
    for(int i = 0; i < n2; i++){
        arr2[i] = scn.nextInt();
    }
    
    getCommonElements(arr1, arr2);
 }

}
