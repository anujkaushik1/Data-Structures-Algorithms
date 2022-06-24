import java.io.*;
import java.util.*;

public class Main {
    
    public static class Pair implements Comparable<Pair>{
        int data;
        int dataIdx;
        int listIdx;
        
        Pair() {}
        
        Pair(int data, int dataIdx, int listIdx){
            this.data = data;
            this.dataIdx = dataIdx;
            this.listIdx = listIdx;
        }
        
        public int compareTo(Pair other){
            // Smaller data => higher priority
            return this.data - other.data;
        }
    }
    
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> res = new ArrayList<>();
        
      PriorityQueue<Pair> pq = new PriorityQueue<>();
      
      // Insert 0th index element of each arraylist
       // O(k log k)
      for(int i = 0; i < lists.size(); i++){
          pq.add(new Pair(lists.get(i).get(0), 0, i));
      }
      // O(Nt * logk) 
      while(pq.size() > 0){
          Pair top = pq.remove();
          res.add(top.data);
          
          if(top.dataIdx + 1 < lists.get(top.listIdx).size()){
              pq.add(new Pair(lists.get(top.listIdx).get(top.dataIdx + 1), top.dataIdx + 1, top.listIdx));
          }
      }
     // O(Nt * logk + k * logk) where Nt = n1 + n2 + n3 + ... nk
      return res;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}
