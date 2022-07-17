import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int ans = getInverse(n);
    System.out.println(ans);
    
 }
 
 private static int getInverse(int n){
     int ans = 0, count = 1;
     
     while(n != 0){
         int rem = n % 10;
         int pow = (int)Math.pow(10, rem - 1);
         ans += count * pow;
         n /= 10;
         count ++;
     }
     
     return ans;
     
 }
}
