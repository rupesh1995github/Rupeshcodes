package week3.Assignment;

public class CharOccurance {
	
	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		
		int count = 0;
		
		char character[] = str.toCharArray();
		
		for (int i = 0; i < character.length; i++) {
			
		
			if (character [i] == 'o') {
				
				count+=1;
			}
		}
		System.err.println(count);
		
		System.out.println("Above number of times character o is presesnt in the given string :"+" "+str);
	
	}

}
