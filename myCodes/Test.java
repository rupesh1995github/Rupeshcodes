package myCodes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
//
//public void main(String[] args) {
//
//int x = 10*20-20;
//
//System.out.println(x);
//}
//
//}

	   public static void main(String args[]){
		
		   
		       String str = "Tax: $8.48";
		       Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(str);
		       while (m.find())
		       {
		    	   double d = Double.parseDouble(m.group(1));
		           
		          int b=(int)d;
		           System.out.println(b);
		       }
		   }
}