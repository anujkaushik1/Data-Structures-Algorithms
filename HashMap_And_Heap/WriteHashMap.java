import java.io.*;
import java.util.*;

public class Main {

  public static class HashMap<K, V> {
      
      private class HMNode(){
          K key;
          V value;
          
          HMNode(){};
          
          HMNode(K key, V value){
              this.key = key;
              this.value = value;
          }
          
      }
      
      private LinkedList<HMNode> buckets[];
      private int size;
      private int capacity;
      
      public HashMap(){
          capacity = 4;
          buckets = new LinkedList[capacity];
          
          for(int i = 0; i < capacity; i++){
              buckets[i] = new LinkedList<>();buckets
          }
      }
      
      public int getBucketId(K key){
          //O(1)
          int hashCode = key.hashCode();
          int bucketId = (Math.abs(hashCode)) %  capacity; // taking modulus
          
          return bucketId;
      }
   

    public void put(K key, V value) throws Exception {
      HMNode node = new HMNode(key, value);
      
      // O(1)
      int bucketIdx = getBucketId(key);
      buckets[bucketidx].addLast(value);
    }

    public V get(K key) throws Exception {
      // write your code here
    }

    public boolean containsKey(K key) {
      // write your code here
    }

    public V remove(K key) throws Exception {
      // write your code here
    }

    public ArrayList<K> keyset() throws Exception {
      // write your code here
    }

    public int size() {
      // write your code here
    }

   public void display() {
      System.out.println("Display Begins");
      for (int bi = 0; bi < buckets.length; bi++) {
        System.out.print("Bucket" + bi + " ");
        for (HMNode node : buckets[bi]) {
          System.out.print( node.key + "@" + node.value + " ");
        }
        System.out.println(".");
      }
      System.out.println("Display Ends");
  }
}

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("put")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        Integer val = Integer.parseInt(parts[2]);
        map.put(key, val);
      } else if (str.startsWith("get")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.get(key));
      } else if (str.startsWith("containsKey")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.containsKey(key));
      } else if (str.startsWith("remove")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.remove(key));
      } else if (str.startsWith("size")) {
        System.out.println(map.size());
      } else if (str.startsWith("keyset")) {
        System.out.println(map.keyset());
      } else if (str.startsWith("display")) {
        map.display();
      }
      str = br.readLine();
    }
  }
}
