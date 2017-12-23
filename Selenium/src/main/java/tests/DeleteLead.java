package tests;

import org.testng.annotations.Test;

import wd.methods.ProjectMethods;

public class DeleteLead extends ProjectMethods {

	@Test(groups={"Sanity"}, dependsOnGroups={"Smoke"})
	public void duplicateLead() {
		click(locateElement("text", "Leads"));
		click(locateElement("text", "Find Leads"));
		click(locateElement("xpath", "//span[text()='Phone']"));
		type((locateElement("xpath", "//input[@name='phoneNumber']")), "2");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		String delLead = getText(locateElement("xpath","//a[starts-with(text(), '1')]"));
		System.out.println("print  : " +delLead);
		click(locateElement("xpath","//a[starts-with(text(), '1')]"));
		click(locateElement("class","subMenuButtonDangerous"));
		click(locateElement("text", "Find Leads"));
		type((locateElement("xpath", "//label[text()='Lead ID:']/following::input")), delLead);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		verifyExactText(locateElement("xpath", "//div[text()='No records to display']"), "No records to display");
		
		
		
	}
}