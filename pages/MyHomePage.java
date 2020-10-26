package pages;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	
public MyLeadsPage leads() {
		driver.findElementByLinkText("Leads").click();
	return new MyLeadsPage();
    
	}

}
