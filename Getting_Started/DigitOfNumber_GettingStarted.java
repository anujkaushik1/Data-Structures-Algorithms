import java.util.*;
    
    public class Main{
        
    private static int getCount(int n){
        int temp = 0;
        while(n != 0){
            n /= 10;
            temp ++;
        }
        
        return temp;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = getCount(n);
        int pow = (int)Math.pow(10, count - 1);
        while(pow != 0){
            int quot = n / pow;
            System.out.println(quot);
            n = n % pow;
            pow /= 10;
        }
        
     }
    }
