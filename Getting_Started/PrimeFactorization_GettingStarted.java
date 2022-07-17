import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  
  getFactors(n);
 }
 
 private static void getFactors(int n){
    int num = 2;
    
    while(n != 1){
        if(n % num == 0){
            System.out.print(num + " ");
            n /= num;
        }
        else{
            num ++;
        }
    }
 }
}
