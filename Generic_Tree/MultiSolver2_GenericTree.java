import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static class MultiSolver{
      int size = 0;
      int min = Integer.MIN_VALUE;
      int max = Integer.MAX_VALUE;
      int height = 0;
      
      public MultiSolver(int size, int min, int max){
          this.size = size;
          this.min = min;
          this.max = max;
      }
  }
  public static MultiSolver multisolver(Node root){
    
    MultiSolver ans = new MultiSolver(1, root.data, root.data);
    
    for(Node child : root.children){
        MultiSolver temp = multisolver(child);
        ans.size += temp.size;
        ans.min = Math.min(ans.min, temp.min);
        ans.max = Math.max(ans.max, temp.max);
        ans.height = Math.max(ans.height, temp.height + 1);
    }
    
    return ans;
    
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
    
    MultiSolver ans = multisolver(root);
    System.out.print(ans.size + " " + ans.min + " " + " " + ans.max + " " + ans.height); 
  }

}
