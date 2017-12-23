package tests;

import org.testng.annotations.Test;

import wd.methods.ProjectMethods;
import wd.methods.ProjectMethods2;

public class EditLeads extends ProjectMethods2{
	    @Test(groups={"Smoke"}, dataProvider="EditLeadData", dataProviderClass=GetData.class )
	    public void editLead(String cName, String fName, String lName, int num)  {
	    click(locateElement("xpath", "//a[text()='Leads']"));
		click(locateElement("xpath", "//a[text()='Find Leads']"));
		click(locateElement("xpath", "//span[text()='Phone']"));
		type(locateElement("name", "phoneNumber"),"2");
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		/*Thread.sleep(5000);
		getText(locateElement("xpath", "(//a[starts-with(text(),'10')])[3]"));*/
		click(locateElement("xpath", "(//a[starts-with(text(),'1')])[num]"));
		click(locateElement("xpath", "//a[text()='Edit']"));
		type(locateElement("id", "updateLeadForm_companyName"),cName);
		type(locateElement("id", "updateLeadForm_firstName"),fName);
		type(locateElement("id", "updateLeadForm_lastName"),lName);
		click(locateElement("class", "smallSubmit"));
		

	}

}