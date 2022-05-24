import java.io.*;
import java.util.*;

  public class Main{
    
    private static void getCommonElements(int arr1[], int arr2[]){
      
      // Time Complexity => O(N1) + O(N2)
        
      HashMap<Integer, Boolean> eleMap = new HashMap<>();
      
      for(int i = 0; i < arr1.length; i++){   // O(N1)
          int val = arr1[i];
          
          if(!eleMap.containsKey(val)){      // O(1)
              eleMap.put(val, true);         // O(1)
          } 
      }
     
      for(Integer val : arr2){               // O(N2)
          
          if(eleMap.containsKey(val)){       // O(1)
              System.out.println(val);
              eleMap.remove(val);            // O(1)
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
