package One_D_Array;

public class anuj {

	public static void main(String[] args) {

		int array[] = {2, 5, 7, 10, 15, 18, 6, 4};
		
		int i=0, j=array.length-1;
		int fi=0,li=0;
		int ans1=0;
		int ans2=0;
		while(i<j) {
			
			if(array[i]==10 && fi==0) {
				ans1 = i;
				fi=1;
			}
			if(array[j] ==10 && li == 0) {
				ans2 = j;
				li=1;
			}
			
			i++;
			j--;
			
		}
		
		System.out.println(ans1);
		System.out.println(ans2);

	}

}
