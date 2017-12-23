package wd.methods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods2 extends SeMethods{
    @Parameters({"URL","User Name", "Password"} )
    @BeforeMethod//(groups={"common"})
	public void loginApp(String url, String un, String pwd)
	{
        startApp("chrome", url);
		WebElement username = locateElement("id", "username");
		type(username, un);
		type(locateElement("id", "password"), pwd);
		click(locateElement("class", "decorativeSubmit"));
		verifyPartialAttribute(locateElement("text", "CRM/SFA"), "href", "/crmsfa/control/main?");
		click(locateElement("text", "CRM/SFA"));
	}
    @AfterMethod//(groups={"common"})
    public void logOut()
    {
    	closeBrowser();
    }
	
	
}
