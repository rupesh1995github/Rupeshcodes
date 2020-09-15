package week1.day2;

public class FindIntersection {

   public static void main(String[] args) {
	
	   int i,j;
	   int[] firstarr = {3,2,11,4,6,7};
	   int[] secondarr = {1,2,8,4,9,7};
		
		for (i = 0; i < firstarr.length; i++) {
		
		for (j = 0; j < secondarr.length; j++) {
			
			if(firstarr[i]==secondarr[j]) {
				
				System.out.println(" " +firstarr[i]);
			}
			
		}
		
	}
   }

}