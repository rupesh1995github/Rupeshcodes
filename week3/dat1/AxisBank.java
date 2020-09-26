package week3.dat1;

public class AxisBank extends BankInfo {
	
	        public void deposit() {
			System.out.println("deposit");
	        }
			public static void main(String[] args) {
				
				AxisBank bank =new AxisBank();
				bank.deposit();
				
				bank.fixed();
				bank.saving();
		}
	}


