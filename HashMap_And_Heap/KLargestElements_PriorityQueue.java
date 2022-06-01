import java.io.*;
import java.util.*;

public class Main {
    
    public static void approach1(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // Max Heap
        
        // o(n logn)
        for(int val : arr) 
            pq.add(val);
        
        ArrayList<Integer> res = new ArrayList<>();
        
        while(k-- > 0){
            res.add(pq.remove());
        }
        
        for(int i = res.size() - 1; i >= 0; i--){
            System.out.println(res.get(i));
        }
    }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      
      approach1(arr, k);
   }

}
