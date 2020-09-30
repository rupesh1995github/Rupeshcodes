package week3.Assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		//Declare String Input as Follow
		String test = "changeme";
           
	    //a) Convert the String to character array
		char[] chararr = test.toCharArray();
		
		//b) Traverse through each character (using loop)
	    for (int i = 0; i < chararr.length; i++) {
		
	    //c)find the odd index within the loop (use mod operator)
		 if (i%2 != 0) {
			 chararr[i]=Character.toUpperCase(chararr[i]);
		}
	    //within the loop, change the character to uppercase, if the index is odd else don't change
	    
	    
	    System.err.println(chararr);
	    
	    }
	    
	
	}
	

}
