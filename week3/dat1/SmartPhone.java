package week3.dat1;

public class SmartPhone extends AndroidPhone{
	
	public void connectwhatsapp() {
		System.out.println("connectwhatsapp");
	}

	public static void main(String[] args) {
		
		SmartPhone objname = new SmartPhone();
		objname.connectwhatsapp();
		objname.sendmessage();
		objname.makecalls();
		objname.savecontacts();
	}

}
