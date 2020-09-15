package week1.day1;

public class Mobile {
	
	static long mobNumber = 954457745L;
	static String mobColor = "black";
	static double mobWeight = 15;
	static boolean isRefurbished = false;
	

	public void makeCall() {
	
	System.out.println("call connected");
	}

    public void sendMessage() {
    
    System.out.println("message sent");
    }
    
    public void takePhoto() {
        
        System.out.println("image captured");
        }
    
    public static void main(String[] args) {
    	Mobile mymob = new Mobile();
    	mymob.makeCall();
    	mymob.sendMessage();
    	mymob.takePhoto();
    	System.out.println(Mobile.mobNumber);
    	System.out.println(Mobile.mobColor);
    	System.out.println(Mobile.mobWeight);
    	System.out.println(Mobile.isRefurbished);
    	
    }

	
	}

