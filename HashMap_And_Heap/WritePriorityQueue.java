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
    }

    public int peek() {
      // O(1)
    }

    public int size() {
      // O(1)
      
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}
