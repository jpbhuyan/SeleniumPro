package wd.methods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ProjectMethods extends SeMethods{
    @BeforeMethod(groups={"common"})
	public void loginApp()
	{
        startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement username = locateElement("id", "username");
		type(username, "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		verifyPartialAttribute(locateElement("text", "CRM/SFA"), "href", "/crmsfa/control/main?");
		click(locateElement("text", "CRM/SFA"));
	}
    @AfterMethod(groups={"common"})
    public void logOut()
    {
    	closeBrowser();
    }
	
	
}
