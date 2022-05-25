import java.io.*;
import java.util.*;

public class Main{
    
    private static void getLongestSequence(HashMap<Integer, Boolean> hm){
        
        int maxChain = 0;
        int startingPt = 0;
        
        for(Integer key : hm.keySet()){  // traversal on HM for unique data
         
         if(!hm.containsKey(key - 1)){
             // chain starting pt
             int length = 1;
             
             while(hm.containsKey(key + length)){
                 length ++;
             }
             
             if(length > maxChain){
                 maxChain = length;
                 startingPt = key;
             }
         }
            
        }
        
        
        for(int i = 0; i < maxChain; i++){
             System.out.println(startingPt + i);
        }
        
    }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    HashMap<Integer, Boolean> hm = new HashMap<>();
    
    for(int i = 0; i < n; i++){
        int val = scn.nextInt();
        hm.put(val, true);
    }
    
    getLongestSequence(hm);
    
 }

}
