package util;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class learnExtentReprot {

	@Test
	public void report()
	{
		//BeforeSuit
		ExtentReports extent=new ExtentReports("./ExtentReports/resultCreateLead.xml", false); //Path of the Extent report gto be generated
		extent.loadConfig(new File("./src/main/resources/extent_config.xml"));  //????
		
		//BeforeMethod
		ExtentTest test=new ExtentTest("CreateLead", "Create a new Lead");
		test.assignCategory("Smoke");
		test.assignAuthor("Jyoti");
		
		//syso
		test.log(LogStatus.PASS,  "Lead is created successfully"+test.addScreenCapture("../reports/snap1.jpg"));
		test.log(LogStatus.FAIL, "Lead is not created successfully");
		test.log(LogStatus.WARNING, "Lead is created successfully");
		test.log(LogStatus.INFO, "Lead is created successfully");
		
		//AfterMethod
		extent.endTest(test);
		//AfterSuite
		extent.flush();
		}

	}
