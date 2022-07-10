import java.util.*;
   
   public class Main{
       
       private static int getCount(int n){
           int temp = 0;
           while(n != 0){
               temp++;
               n /= 10;
           }
           
           return temp;
       }
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int count = getCount(n);
     
     while(count != 0){
         
         int rem = n % 10;
         System.out.println(rem);
         n /= 10;
         
         count --;
     }
     
     
    }
   }
