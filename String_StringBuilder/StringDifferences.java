package String_StringBuilder;
import java.util.Scanner;


public class StringDifferences {
		
	private static String getStringWithDiffernce(String str) {

	    int i = 0;
	    int j = i + 1;

	    StringBuilder sb = new StringBuilder();
	    sb.append(str.charAt(i) + "");

	    while (j < str.length()) {
	      int diff = str.charAt(j) - str.charAt(i);
	      sb.append(diff);
	      sb.append(str.charAt(j) + "");

	      i++;
	      j++;
	    }

	    return sb.toString();
	  }

	  public static void main(String args[]) {
	    Scanner scn = new Scanner(System.in);
	    String str = scn.nextLine();

	    String ans = getStringWithDiffernce(str);
	    System.out.println(ans);

	  }

	}
