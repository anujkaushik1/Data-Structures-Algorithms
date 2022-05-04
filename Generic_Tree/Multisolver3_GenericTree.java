 public static void multisolver3(Node root, int level, int[] ans){
      ans[0]++;
      if(root.data < ans[1]) ans[1] = root.data;
      if(root.data > ans[2]) ans[2] = root.data;
      if(level > ans[3]) ans[3] = level;
      
      for(Node child: root.children){
          multisolver3(child, level + 1, ans);
      }
  }

public static void main(String args[]){
  int ans[] = {0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
  mutlisolver3(root, 0, ans);
  
  System.out.println(ans[0] + " " + ans[1] + " " + ans[2] + " " + ans[3] + " ");
}
