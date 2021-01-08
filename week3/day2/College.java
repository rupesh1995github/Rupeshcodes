package week3.day2;

public class College extends University {


public void ug() {
	System.out.println("UG");
}


public static void main(String[] args) {
	
	College coll = new College();
	
	coll.ug();
	
	coll.pg();
	  

}


public void pg() {
	System.out.println("PG over");
	
}
}