import java.io.*;
import java.util.*;

public class Main {
    
    private static void reverseWord(String str){
        
        int j = str.length() - 1;
        int i = str.length() - 1;
        String ans = "";
        while(j >= 0){
            
            if(j == 0){
                ans += str.substring(j, i + 1) + " ";
            }
            
            if(str.charAt(j) != ' '){
                j--;
            }
            else{
                ans += str.substring(j+1, i + 1) + " ";
                j--;
                i = j;
            }
        }
        System.out.print(ans);
    }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		reverseWord(str);
	}

}
