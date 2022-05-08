import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0]);
    Stack<Pair> st = new Stack<>();
    st.push(new Pair(root, -1));
    int idx = 0;
    
    while(st.size() > 0){
        Pair par = st.peek();
        
        if(par.state == -1){
            //preorder
            
            idx ++;
            if(arr[idx] != null){
                Node child = new Node(arr[idx]);
                par.node.left = child;
                st.push(new Pair(child, -1));
            }
            
            par.state++;
            
        }
        else if(par.state == 0){
            //inorder
            
            idx ++;
             if(arr[idx] != null){
                Node child = new Node(arr[idx]);
                par.node.right = child;
                st.push(new Pair(child, -1));
            }
            
            par.state++;
            
        }
        else if(par.state == 1){
            //postorder
            st.pop();
        }
    }
    
    return root;
  }

  public static void print(Node root){
      
      if(root.left != null){
          System.out.print(root.left.data);
      }
      else{
          System.out.print(".");
      }
      
      System.out.print(" <- " + root.data + " -> ");
      
      if(root.right != null){
          System.out.print(root.right.data);
      }
      else{
          System.out.print(".");
      }
        
      System.out.println(); 
  }
  public static void display(Node root) {
    
    if(root == null){
        return ;
    }
    
    print(root);
    display(root.left);
    display(root.right);
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    display(root);
    
  }

}
