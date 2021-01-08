package week3.Assignment;

public class CharOccurance {
	
	public static void main(String[] args) {
		
		
	   //Check number of occurrences of a char (eg 'e') in a String
		String str = "welcome to chennai";
		
		//declare and initialize a variable count to store the number of occurrences
		int count = 0;
		
		//convert the string into char array
		char character[] = str.toCharArray();
		
		//get the length of the array
		int charlen = character.length;
		
		// traverse from 0 till the array length 
		for (int i = 0; i < charlen; i++) {
			
		
		// Check the char array has the particular char in it 
			if (character [i] == 'o') {
				
	    // if is has increment the count		
				count+=1;
			}
		}
		System.err.println(count);
		
	    // print the count out of the loop
		
		System.out.println("Above number of times character o is presesnt in the given string :"+" "+str);
	
	}

}
