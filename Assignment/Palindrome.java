package week3.Assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a) Declare A String value as"madam"
        String mamstr1 = "madam";
        
        //b) Declare another String rev value as ""
        String mamstr2 = "";
	

        //c) Iterate over the String in reverse order
        for(int i=mamstr1.length()-1;i>=0;i--) {
		
        //d) Add the char into rev
        	mamstr2+= mamstr1.charAt(i);
        
        	
        //e) Compare the original String with the reversed String, if it is same then print palinDrome 
        	if (mamstr1.equals(mamstr2)) {
				System.out.println("It is a Palindrome");
			}else
				System.out.println("It is a Palindrome");
        	
		}
	}   

}
