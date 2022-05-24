import java.io.*;
import java.util.*;

public class Main {
    
    private static char getHighFreqChar(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            if(hm.containsKey(ch)){
                int freq = hm.get(ch);
                hm.put(ch, freq + 1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        
        Set<Character> keys = hm.keySet();
        int max = Integer.MIN_VALUE;
        char maxCh = 'x';
        for(Character ch : keys){
            int freq = hm.get(ch);
            if(freq > max){
                max = freq;
                maxCh = ch;
            }
        }
        
        return maxCh;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        char hiFreq = getHighFreqChar(str);
        System.out.println(hiFreq);
    }

}
