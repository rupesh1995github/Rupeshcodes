package week3.day2;

public class Desktop implements HardWare , Software{

	
	public void desktopModel() {
		System.out.println("Dell Model");
	}

	

	public static void main(String[] args) {
	
	
		Desktop desk = new Desktop();
		desk.desktopModel();
		desk.softwareResources();
		desk.hardwareResources();

}



	
	public void softwareResources() {
	
		System.out.println("IT");
	}



	public void hardwareResources() {
		
		System.out.println("Infra");
	}
	
	
}	