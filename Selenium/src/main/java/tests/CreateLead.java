package tests;


import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wd.methods.ProjectMethods2;


public class CreateLead extends ProjectMethods2{

	    //@Test(groups ={"Smoke"}, dataProvider="createLeadDataExcel", dataProviderClass=GetData.class)
	    @Test (dataProvider="createLeadDataExcel")
	    public void createLead(String cName, String fName, String lName)  {
		 
		click(locateElement("xpath", "//a[text()='Create Lead']"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		selectDropDownUsingText(locateElement("id", "createLeadForm_dataSourceId"), "Employee");
		selectDropDownUsingIndex(locateElement("id", "createLeadForm_marketingCampaignId"), 1);
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
	    }
	    
	    @DataProvider(name="createLeadDataExcel")
	    public Object[][] getCreateLeadExcel() throws IOException
	    {
	    	GetData rExcel=new GetData();
			return rExcel.getCreateLeadDataExcel("CreateLeadData");
	    	
	    }
	    
	}