package week3.Assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
	//a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
	
	//b) Initialize an integer variable as count
    int count = 0;
    String check = null;
    
    //c) Split the String into array and iterate over it
    String[] splitarr = text.split("");
    
    //d) Initialize another loop to check whether the word is there in the array
    for(int i=0;i<splitarr.length-1;i++){
	for(int j=i;j<splitarr.length-1;j++){
			if(splitarr[i].equals(splitarr[j])){
				check=splitarr[i];
	//e) if it is available then increase and count by 1. 			
				count+=1;
				
				
	}
  }
}
    //f) if the count > 1 then replace the word as ""
    if (count > 1) {
    System.out.println(text.replace(check,""));
	
	//g) Displaying the String without duplicate words	
    
    
    }
  }
} 