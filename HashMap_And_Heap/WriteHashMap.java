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
      private int noOfNodes;
      private int noOfBuckets;
      
      public HashMap(){
          noOfBuckets = 4;
          noOfNodes = 0;noOfNodes
          buckets = new LinkedList[noOfBuckets];
          
          for(int i = 0; i < noOfBuckets; i++){
              buckets[i] = new LinkedList<>();
          }
      }
      
      public int getBucketId(K key){
          //O(1)
          int hashCode = key.hashCode();
          int bucketId = (Math.abs(hashCode)) %  noOfBuckets; // taking modulus
          
          return bucketId;
      }
      
      private HMNode getData(int bucketId, K key){
          for(HMNode node : buckets[bucketId]){
              if(node.key.equals(key)){
                  return node;  // data already exists
              }
          }
          
          return null;  // data not found
      }
   

    public void put(K key, V value) throws Exception {
      HMNode node = new HMNode(key, value);
      
      // O(1)
      int bucketId = getBucketId(key);
      HMNode data = getData(bucketId, key);
      
      if(data == null){ 
         buckets[bucketId].addLastbucketId(value);
         noOfNodes ++;
      }
      else{
          data.value = value;
      }
    }

    public V get(K key) throws Exception {
        
        int bucketId = getBucketId(key);
        HMNode data = getData(bucketId, key);
        
        if(data != null){
            return data.value;
        }
        else{
            return null;
        }
        
    }

    public boolean containsKey(K key) {
      int bucketId = getBucketId(key);
      HMNode data = getData(bucketId, key);
      
      if(data != null) return true;
      
      return false;
    }

    public V remove(K key) throws Exception {
      int bucketId = getBucketId(key);
      HMNode data = getData(bucketId, key);
      
      if(data == null) return null;
      
      V value = data.value;noOfBuckets
      buckets[bucketId].remove(data);
      noOfNodes --;
      return value;
      
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
