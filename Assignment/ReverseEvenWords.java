package week3.Assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		//Declare the input as Follow
		String test = "I am a software tester";
		
		//a) split the words and have it in an array
		String[] splitarray = test.split("");
		
		//b) Traverse through each word (using loop)
		for (int i = 0; i < splitarray.length; i++) {
		
		//c) find the odd index within the loop (use mod operator)
			
			if (i%2 != 0) {
				
				
			}
			
		//d)split the words and have it in an array
		String[] splitarray2 = test.split("");
		
		//e)print the even position words in reverse order using another loop (nested loop)
		
			for (int j = test.length()-1 ; j>=0 ; j--) {
		
		//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end)
				if (j%2 == 1) {
					
					char[] stringToCharArray = test. toCharArray();
					for (char output : stringToCharArray) {
					System. out. println(output);
					}
					
				}else
				    System.out.println(test+" ");
			}
		}

	}

}
