package org.system;

	public class Desktop extends Computer {
		
		
		public void desktopBrand() {
			
			System.out.println("DELL");
		}

		public static void main(String[] args) {
			
			Desktop obb = new Desktop();
			
			obb.desktopBrand();
			obb.computerModel();

	}

}
