package week8.classroom;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) throws IOException {
		
		//to create physical html report
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./extentreport/reportresult.html");
		
		//to maintain the history in extent report
		reporter.setAppendExisting(true);
		
		//to get the actual report
		ExtentReports extent = new ExtentReports();

		//to integarate physical file to the actual report
		extent.attachReporter(reporter);
		
		//to create the testcase with details
		ExtentTest testcase1 = extent.createTest("LoginAndLogout" , "LeafTaps login and logout");
		testcase1.assignAuthor("Rupesh Kumar");
		testcase1.assignCategory("Smoke");
		
		//step level status
		testcase1.pass("Username entered successfully");MediaEntityBuilder.createScreenCaptureFromPath(".././screenshot/leafground.png").build();
	    testcase1.pass("Password entered successfully");
	    testcase1.pass("Click button clicked successfully"); 
	    
	    
	    //to have all information in report and to execute all steps
	    extent.flush();
	
	 }
	

}
