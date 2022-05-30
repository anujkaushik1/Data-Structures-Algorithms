import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      pq.add(80);
      pq.add(10);
      pq.add(230);
      pq.add(30);
      pq.add(4);
      pq.add(3);
      
      System.out.println(pq);
      
      while(pq.size() > 0){
          int val = pq.remove();
          System.out.print(val + " ");
      }
      
    }

}
