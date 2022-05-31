import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      // O(Log n)
      
      data.add(val);
      upheapify(size() - 1);
        
    }
    
    public boolean isSmaller(int i1, int i2){
        if(data.get(i1) < data.get(i2)) return true;
        
        return false;
    }
    
    public void swap(int i1, int i2){
        int temp = data.get(i1);
        data.set(i1, data.get(i2));
        data.set(i2, temp);
    }
    
    public void upheapify(int idx){
        int parIdx = (idx - 1) / 2;
        
        if(isSmaller(idx, parIdx)){
            swap(idx, parIdx);
            upheapify(parIdx);
        }
    }

    public int remove() {
     // O(Log n)
     
      if(size() == 0){
          System.out.println("Underflow");
          return -1;
      }
      
      int val = peek();
      swap(0, size() - 1);
      data.remove(size() - 1);
      
      downheapify(0);
      return val;
      
    }
    
    public void downheapify(int idx){
        int min = idx;
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        
        if(left < size() && isSmaller(left, min)){
            min = left;
        }
        
        if(right < size() && isSmaller(right, min)){
            min = right;
        }
        
        if(min != idx){
            swap(min, idx);
            downheapify(min);
        }
    }

    public int peek() {
      // O(1)
      
      if(size() == 0){
          System.out.println("Underflow");
          return -1;
      }
      
      return data.get(0);
      
    }

    public int size() {
      // O(1)
      
      return data.size();
    }
    
    public ArrayList<Integer> heapSort(){
        
        // TC => NLogN
        
        ArrayList<Integer> sorted = new ArrayList<>();
        
        while(size() > 0){
            int val = remove();
            sorted.add(val);
        }
        
        return sorted;
    }
  }

  public static void main(String[] args) throws Exception {
    PriorityQueue qu = new PriorityQueue();
    qu.add(20);
    qu.add(10);
    qu.add(30);
    qu.add(80);
    qu.add(40);
    qu.add(50);
    
   ArrayList<Integer> ans = qu.heapSort();
   System.out.println(ans);
  }
 
}
