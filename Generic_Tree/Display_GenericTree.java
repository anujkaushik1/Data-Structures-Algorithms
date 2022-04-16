import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
    
    Node(){
        this.data = 0;
    }
    
    Node(int data){
        this.data = data;
    }
  }
  
  public static void print(Node root){
      System.out.print(root.data + " -> ");
      
      for(Node child : root.children){
          System.out.print(child.data + ", ");
      }
      
      System.out.println(".");
  }

  public static void display(Node root) {
    
    if(root == null) return ;
    
    print(root);
    
    for(Node child : root.children){
        display(child);
    }
    
  }

  public static Node construct(int[] arr) {
    
        Node root = null;
        Stack<Node> st = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            
            if(val != -1){
                Node newNode = new Node(val);
                
                if(st.isEmpty()){
                    root = newNode;
                }
                else{
                    Node parent = st.peek();
                    parent.children.add(newNode);
                }
                
                st.push(newNode);
            }
            else{
                st.pop();
            }
        }
        
        return root;
  }


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    display(root);
  }

}
