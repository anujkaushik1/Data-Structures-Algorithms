import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    Stack<Integer> st = new Stack<>();
    int maxSoFar = 0;
    for(int i = 0; i < str.length(); i++){
        char ch = str.charAt(i);
        
        if(ch == 'd'){
            maxSoFar++;
            st.push(maxSoFar);
        }
        else{
            maxSoFar++;
            st.push(maxSoFar);
            
            while(st.size() > 0){
                int val = st.pop();
                System.out.print(val);
            }
        }
    }
    
    maxSoFar++;
    st.push(maxSoFar);
    while(st.size() > 0){
        int val = st.pop();
        System.out.print(val);
     }
    
 }
}
