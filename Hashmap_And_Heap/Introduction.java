import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // <key, value>
        HashMap<String, Integer> hm = new HashMap<>();
        
        // HashMaps are unordered
        
        // Put => O(1)
        hm.put("Chennai", 4);
        hm.put("Mumbai", 5);
        hm.put("Kolkata", 2);
        hm.put("Hyderabad", 2);
        
        hm.put("Chennai", 5);
        
        // Get => O(1)
        System.out.println(hm.get("Mumbai"));
        System.out.println(hm.get("Chennai"));
        System.out.println(hm.get("Ahmedabad"));
        
        System.out.println(hm);
        
        // Remove => O(1)
        Integer count = hm.remove("Kolkata");
        System.out.println(count);
        
        System.out.println(hm);
        
        Integer c2 = hm.remove("Delhi");
        System.out.println(c2);
        
        System.out.println(hm);
        
        hm.put("Bangalore", null);
        System.out.println(hm.get("Bangalore"));
        
        // Contains Key => O(1)
        
        if(hm.containsKey("Bangalore")){
            System.out.println(hm.containsKey("Bangalore"));
        }
        else{
           System.out.println("nope"); 
        }
        
        // Key Set => O(N)
        
        Set<String> keys = hm.keySet();
        for(String str : keys){
            System.out.print(str + " ");
        }
        
        for(String str : hm.keySet()){
            System.out.print(str + " " + ":)");
        }
        
        System.out.println(hm.size()); // O(1)
        
        HashMap<String, ArrayList<String>> hMaps = new HashMap<>();
    }

}
