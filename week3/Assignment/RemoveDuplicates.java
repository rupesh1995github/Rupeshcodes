package week3.Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	
		public static void main(String[] args) {
			// using Set
			String text = "We learn java basics as part of java sessions in java week1";
			System.out.println("Original string - " + text);
			String[] split = text.split(" ");
					
			Set<String> unique = new LinkedHashSet<String>();
			
			for (String temp : split) {
				unique.add(temp);
			}
			System.out.println("Removed duplicate using SET - " + unique);
			System.out.println("*********************");
			
			// Another way of trying below
			String abc = "We learn java basics as part of java sessions as in java week1";
			String[] dd = abc.split(" ");
			String xyz = "";		
			for (int i = 0; i < dd.length-1; i++ ) {
				for( int j = i+1; j < dd.length; j++) {
					if (dd[j].equalsIgnoreCase(dd[i])) {
						if (i != j) {
							dd[j] = "";
						}
					}
				}	
			}
			
			for (int k = 0; k < dd.length; k++) {
				xyz = xyz + dd[k] + " ";	
			}
			
			System.out.println("Removed duplicates using for Loop - " + xyz);
		}	
	}