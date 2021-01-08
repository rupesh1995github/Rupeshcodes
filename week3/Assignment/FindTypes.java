package week3.Assignment;

public class FindTypes {

	public static void main(String[] args) {
		
		//Inputs
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		//Convert the String to character array
		char[] chararray = test.toCharArray();
		
		//Traverse through each character (using loop)
		for (int i = 0; i < chararray.length; i++) {
			
			//Find if the given character is what type using (if)
			//i)  Character.isLetter
			if (Character.isAlphabetic(chararray[i])) {
				letter+=1;
			}
		    //ii) Character.isDigit
			else if (Character.isDigit(chararray[i])) {
				num+=1;
				
			}
		    //iii)Character.isSpaceChar
			else if (Character.isSpace(chararray[i])) {
			    space+=1;
				
			}
		    //iv) else -> consider as special character
			else {
				specialChar+=1;
				
			}
		}
		
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
