package week1.day1;

public class SwitchOperator {


		public static void main(String[] args) 
		
{
			int x =2;
			int y =3;
			String str="add";
			
			switch (str) {
			
			case "add":
				System.out.println("addition : "+(x+y));
				break;
			
			case "sub":
				System.out.println("subtractiom : "+(x-y));
				break;
			
			case "mul":
				System.out.println("multiplication : "+(x*y));
				break;
			
			case "div":
				System.out.println("division : "+(x/y));
				break;
				
			default:
				System.out.println("no operation is performed");
				break;
		}
	}
}