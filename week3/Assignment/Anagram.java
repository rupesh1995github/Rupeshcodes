package week3.Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		//Declare a String 
		
		String text1 = "stops";
	
	    //Declare another String
	
		String text2 = "potss"; 
		 
		//a) Check length of the strings are same then (Use A Condition)
		
		if (text1.length() == text2.length() ) {
			
        //b) Convert both Strings in to characters	
			
			char[] char1=text1.toCharArray();
			char[] char2=text2.toCharArray();
			
		//c) Sort Both the arrays
		
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			
		//d) Check both the arrays has same value	 
			 
			System.out.println(char1);
			System.out.println(char2);	 
		
		
		}
	}
}
