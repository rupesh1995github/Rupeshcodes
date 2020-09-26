package week3.dat1;

public class Students {

	    public void getStudentInfo(String id) {
	    System.out.println("Student ID : "+id);
	     }
	    public void getStudentInfo(String stuid, String name) {
		
		System.out.println("Student ID : "+stuid);
		System.out.println("Student Name : "+name);
	     }
	    public void getStudentInfo(String email, long phonenumber) {
	
		System.out.println("Student Email : "+email);
		System.out.println("Student Phone : "+phonenumber);
	     }
	
	    public static void main(String[] args) {
		Students stu1=new Students();
		stu1.getStudentInfo("22455545");
		stu1.getStudentInfo("22455545","Rupesh");
		stu1.getStudentInfo("rupesh@gmail.com","9401145221L");
	}
}
