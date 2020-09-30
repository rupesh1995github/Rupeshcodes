package week3.Assignment;

public class ReverseString {

	private static int j;

	public static void main(String[] args) {
		
		
		// Here is the input
				String test = "feeling good";
				
				
     	// Build the logic to find the count of each
		// Pseudo Code: 1
	    //a) Convert the String to character array
				char[] chararr = test.toCharArray();
				
        //b) Traverse through each character (using loop in reverse direction)
				 for (int i = 0; i < chararr.length; i++) {
		 
		//Print the character (without newline -> like below       	
	        	System.out.print(chararr[i]);
				}		
				
		 //a) Find the length of the string
		         test.length();
		        
		 //b)Traverse through each index from length-1 -> 0 (using loop in reverse direction)    
		          for(int j = test.length() ; j>=0 ; j--  );
		          {   
		 //c)Find the character of the String using its index
		        	  System.out.print(test.indexOf(j));
	}          
		          
		       
	}
}
