import java.util.*;
   
   public class Main{
       
       private static int getCount(int n){
           int temp = 0;
           while(n != 0){
               temp ++;
               n /= 10;
           }
           
           return temp;
       }
   
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int digit = getCount(n);
        k = k % digit;
        
        if(k < 0){
            k += digit;
        }
        
        int pow = (int)Math.pow(10, k);
        int rem = n % pow;
        int quot = n / pow;
        int count = getCount(quot);
        int newPow = (int)Math.pow(10, count);
        int ans = (rem * newPow) + quot;
        System.out.println(ans);
        
    }
   }
