package week6Classroom;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIntegration extends BeforeAfter {
	
		
		@DataProvider(name = "fetchData")
		public String[][] sendData() {
			
			String[][] data = new String [2][3];
			data[0][0] = "Hari";
			data[0][1] = "R";
			data[0][1] = "TestLeaf";
			data[1][0] = "Sam";
			data[1][1] = "D";
			data[1][2] = "TL";
			
			return data;
		}
		
		@Test(dataProvider = "Lead")
		public void runCreateLead(String cName,String fName, String lName) {
		
		driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Create Lead").click();
        driver.findElementById("createLeadForm_companyName").sendKeys(cName);
        driver.findElementById("createLeadForm_firstName").sendKeys(fName);
        driver.findElementById("createLeadForm_lastName").sendKeys(lName);

		
		
	}
}
