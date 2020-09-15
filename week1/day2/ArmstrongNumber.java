package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int input = 153, num, out, in=0;
		
		num = input;
	       
		while (num > 0)
	        {
	            out = num % 10;
	            in = in + (out*out*out);
	            num = num / 10;
	        }

	        if(in == input)
	            System.out.println(input + " is an Armstrong number");
	        else
	            System.out.println(input + " is not an Armstrong number");

	}

}
