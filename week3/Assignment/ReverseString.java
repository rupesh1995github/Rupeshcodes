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
				for (int i = chararr.length-1; i >= 0; i--)  {
		 
		//Print the character (without newline -> like below       	
	        	System.out.print(chararr[i]);
				}		
			}          
		}

