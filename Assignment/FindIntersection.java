package week3.Assignment;

public class FindIntersection {

	private static int i;

	public static void main(String[] args) {
		
		//a) Declare An array for {3,2,11,4,6,7};
        int[] array1 = {3,2,11,4,6,7};
		//b) Declare another array for {1,2,8,4,9,7};
        int[] array2 = {1,2,8,4,9,7};
        //c) Declare for loop iterator from 0 to array length
        //iterate for array1
	    for (int i = 0; i < array2.length; i++) {
	    //iterate for array2
	    for (int j = 0; j < array2.length; j++) {
		//e) Compare Both the arrays using a condition statement
	    if (array1[i] == array2[j]) {
		
		}
	  }	
    }
        //f) Print the first array (should match item in both arrays)
	    System.out.println("First array is : "+" " +array1[i]);
	    
 }
}
