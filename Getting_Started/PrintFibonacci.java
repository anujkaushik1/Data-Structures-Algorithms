import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int a = 0;
     int b = 1;
     int c = 0;
     for(int i = 0; i < n ; i++){
         c = a + b;
         a = b;
         b = c;
     }
     
     System.out.print(a);
     
   }
  }
