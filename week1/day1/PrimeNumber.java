package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) 
{
	
		int input = 13 ;
		int remainder;
		boolean flag=true;
		
		for (int i = 2; i < input/2 ; i++) 
{
			
			remainder = input%i;
			
			if (remainder==0) {
			flag=false;
			break;
 }
}
		
	        if(flag) 
			System.out.println(input+" "+"is a Prime number");
			
			else
			System.out.println(input+" "+"is not a Prime number");
 }
}		

