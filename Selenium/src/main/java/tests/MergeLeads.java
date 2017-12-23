package tests;


import org.testng.annotations.Test;

import wd.methods.ProjectMethods;


public class MergeLeads extends ProjectMethods{
	
	@Test(groups={"Sanity"},enabled=false, dependsOnGroups={"Smoke"})
	public void mergeLeadsProgram() throws InterruptedException{
		
		click(locateElement("text", "Leads"));
		click(locateElement("text", "Merge Leads"));
		click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("name", "id"), "10");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(3000);
		String from=getText((locateElement("xpath", "(//a[starts-with(text(),'10')])[6]")));
		clickWithNoSnap(locateElement("xpath", "(//a[starts-with(text(),'10')])[6]"));
		switchToDefaultWindow();
		clickWithNoSnap(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("name", "id"), "10");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		Thread.sleep(3000);
		clickWithNoSnap(locateElement("xpath", "(//a[starts-with(text(),'10')])[7]"));
		switchToDefaultWindow();
		clickWithNoSnap(locateElement("class", "buttonDangerous"));
		Thread.sleep(3000);
		acceptAlert();
		click(locateElement("text", "Find Leads"));
		type(locateElement("name", "id"), from);
		//locateElement("name", "id");
		Thread.sleep(5000);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		verifyExactText(locateElement("class", "x-paging-info"), "No records to display");
		
	}
	

}
	
