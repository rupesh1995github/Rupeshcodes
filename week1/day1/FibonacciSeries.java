package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int range=8; 
		int a=0;
		int b=1;
		int c;
		int i;
		
		System.out.print(a);
		System.out.print(b);
		
		
		for(i=0;i<range;i++)
		{
			c=a+b;
			System.out.print(c);
		
		a=b;
		b=c;
		
		
		
		}
		
		
	}

}
