import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int n3 = scn.nextInt();
    
    boolean isPytha = isPythaTriplet(n1, n2, n3);
    System.out.println(isPytha);
    
   }
   
   private static boolean isPythaTriplet(int a, int b, int c){
       
       if( (a * a) + (b * b) == (c * c) ){
           return true;
       }
       
       if( (b * b) + (c * c) == (a * a) ){
           return true;
       }
       
       if( (a * a) + (c * c) == (b * b) ){
           return true;
       }
       
       return false;
   }
  }
