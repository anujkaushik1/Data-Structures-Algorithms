import java.io.*;
import java.util.*;

public class Main {
    
    public static void approach1(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // Max Heap
        
        // TC => (N + K Log N)
        
        // o(n logn)
        for(int val : arr) 
            pq.add(val);
        
        ArrayList<Integer> res = new ArrayList<>();
        
        // O(K LogN)
        while(k-- > 0){
            res.add(pq.remove());
        }
        
        for(int i = res.size() - 1; i >= 0; i--){
            System.out.println(res.get(i));
        }
    }
    
    public static void approach2(int arr[], int k){
        
        // TC => K Log K + (N - K)*Log K = O(N Log K)
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < k; i++){
            pq.add(arr[i]);
        }
        
        for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            int top = pq.peek();
            
            if(val > top){
                pq.remove();
                pq.add(val);
            }
        }
        
        while(pq.size() > 0){
            System.out.println(pq.remove());
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
      
      approach2(arr, k);
   }

}
