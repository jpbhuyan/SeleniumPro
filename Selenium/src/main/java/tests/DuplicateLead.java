package tests;



import org.testng.annotations.Test;

import wd.methods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
	
	@Test//(groups={"Regression"}, dependsOnGroups={"Sanity"})
	public void duplicateLead() throws InterruptedException{
		click(locateElement("text", "Leads"));
		click(locateElement("text", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Email']"));
		type(locateElement("xpath", "//input[@name='emailAddress']"), "@");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(5000);
		String explead = getText((locateElement("xpath", "//a[starts-with(text(), '1')]")));
		System.out.println("print" +explead);	
		click((locateElement("xpath", "(//a[starts-with(text(),'1')])[1]")));
		click(locateElement("xpath", "//a[text()='Duplicate Lead']"));
		verifyTitle("Duplicate Lead");
		click(locateElement("xpath", "//input[@name='submitButton']"));
		//verifyExactText((locateElement("xpath", "//span[text()='Testing']")), explead);
		
	}
	
	
}


