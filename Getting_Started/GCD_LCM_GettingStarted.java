import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      
      int gcd = getGCD(n1, n2);
      System.out.println(gcd);
      int lcm = (n1 * n2) / gcd;
      System.out.print(lcm);
     }
     
     
     private static int getGCD(int n1, int n2){
         int a = n1;
         int b = n2;
         
         while(a % b != 0){
             int rem = a % b;
             a = b;
             b = rem;
         }
         return b;
     }
}
