package Dynamic_Programming;

import java.util.Scanner;

public class ArrangeBuildings {

	private static long getNumberWays(int n) {
		
		long oldBuildingCount = 1;
		long oldSpaceCount = 1;
		
		for(long i = 2; i <= n; i++) {
			
			long newOneCount = oldSpaceCount + oldBuildingCount;
            long newZeroCount = oldSpaceCount;
            
            oldBuildingCount = newZeroCount;
            oldSpaceCount = newOneCount;
		}
		
		return (oldSpaceCount + oldBuildingCount) * (oldSpaceCount + oldBuildingCount) ;
	}
		
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		long ways = getNumberWays(n);
		System.out.println(ways);

	}

}
