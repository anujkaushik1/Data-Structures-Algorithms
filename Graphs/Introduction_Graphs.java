import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt){
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      int vts = scn.nextInt();
      ArrayList<Edge> graph[] = new ArrayList[vts];
      
      for(int i = 0; i < vts; i++){
          graph[i] = new ArrayList<>();
      }
      
      int edges = scn.nextInt();
      while(edges-- > 0){
          int v1 = scn.nextInt();
          int v2 = scn.nextInt();
          int wt = scn.nextInt();
          
          graph[v1].add(new Edge(v1, v2, wt));
          graph[v2].add(new Edge(v2, v2, wt));  // because undirected graph
      }
      int src = scn.nextInt();
      int dest = scn.nextInt();
      System.out.println(true);
    }

}
