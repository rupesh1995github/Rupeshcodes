package week1.day2;

public class Calculator {

	
	
		
    public int add(int x , int y)
{
    	int add;
    	
    	int intx = 4;
		int inty = 5;
		add = intx+inty;
    	
    	return add;
	}

public int subtraction(int x , int y)

{
	int sub;
	
	int intx = 8;
	int inty = 5;
	sub = intx-inty;
	
	return sub;
	}

public double multiplication(double x, double y)
{
	
	double x1 = 2;
	double y1 = 2;
	return x1*y1;
	
	}

public static void main(String[] args) {
	
	Calculator c1 = new Calculator();
	int add = c1.add(4 , 5);
	
	System.out.println(add);
	
	int sub = c1.subtraction(8, 5);
	
	System.out.println(sub);
	
    double mul = c1.multiplication(2,2);
	
	System.out.println(mul);

	}
}
