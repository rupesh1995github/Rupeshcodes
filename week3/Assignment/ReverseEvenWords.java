package week3.Assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		//Declare the input as Follow
		String a1 = "I am a software tester"; 
		//a) split the words and have it in an array
		String[] split = a1.split(" ");
		String a2 = "";
		//b) Traverse through each word (using loop)
		for ( int i = 0; i < split.length; i++) {
	    //c) find the odd index within the loop (use mod operator)
			if (i%2 != 0) {
				String temp = "";
				
		//Convert words to character array
				char[] part = split[i].toCharArray();
		
				for (int j = part.length-1; j >= 0; j--) {
					temp = temp + part[j];
				}
			split[i] = temp;	
			}
		a2 = a2 + split[i] + " ";	
		}
	System.out.println("Original string is : " + a1);	
	System.out.println("Reversed even words : " + a2);
	}

}
