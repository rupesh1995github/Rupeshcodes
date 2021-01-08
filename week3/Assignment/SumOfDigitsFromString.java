package week3.Assignment;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
//		/Method 1
		
		//Declare a String text with the following value
		String text = "Tes12Le79af65";
		
		String replace = "text";
		
		//Declare a int variable sum
		int sum = 0;
		
		//a) using replaceAll(), replace all the non-digits into ""
		
		text=text.replaceAll("\\D","");
		
		//b) Now, convert the String into array
		char[] charArr=text.toCharArray();

		//c) Iterate over the array and get each character
		for(char x:charArr){
			
		// d) Using Character.getNumericValue(), Change the char into int	
			sum+= Character.getNumericValue(x);
			
		}
        //e) Add the values to sum & print
		System.out.println("Sum="+sum);

		char[] charArr1=replace.toCharArray();
		
		
		//Declare a String text with the following value

		int sum2 = 0;
		
		//a) Iterate an  array over the String
		for(char y:charArr1){
			
		//b) Get each character and check if it is a number using Character.isDigit()	
			if(Character.isDigit(y)){
		
		//c) Now covert char to int using Character.getNumericValue() and add it to sum		
				sum2+=Character.getNumericValue(y);
			}
		}
        
		//d) Now Print the value
		System.out.println("Sum2="+sum2);

	}

}
