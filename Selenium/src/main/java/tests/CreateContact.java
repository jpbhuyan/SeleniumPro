package tests;




import org.testng.annotations.Test;

import wd.methods.ProjectMethods;

public class CreateContact extends ProjectMethods {
	
	@Test
	public void createCont() throws InterruptedException{
		click(locateElement("text", "Create Contact"));
		type((locateElement("id", "firstNameField")), "Jyoti");
		type((locateElement("id", "lastNameField")), "Bhuyan");
		type((locateElement("id", "createContactForm_firstNameLocal")), "Jyotirmayee");
		type((locateElement("id", "createContactForm_lastNameLocal")), "Sahoo");
		type((locateElement("id", "createContactForm_personalTitle")), "Er.");
		type((locateElement("id", "createContactForm_generalProfTitle")), "SSE");
		type((locateElement("id", "createContactForm_departmentName")), "Testing");
		selectDropDownUsingValue((locateElement("id", "createContactForm_preferredCurrencyUomId")), "INR");
		type((locateElement("id", "createContactForm_description")), "XXXX");
		type((locateElement("id", "createContactForm_importantNote")), "YYYY");
		type((locateElement("id", "createContactForm_primaryPhoneAreaCode")), "+91");
		type((locateElement("id", "createContactForm_primaryPhoneExtension")), "52036");
		type((locateElement("id", "createContactForm_primaryPhoneAskForName")), "Lali");
		String name=getAttributeValue(locateElement("xpath", "//input[@id='generalToNameField']"));
		type((locateElement("id", "createContactForm_generalAddress1")), "Thoraipakkam");
		type((locateElement("id", "createContactForm_generalCity")), "Chennai");
		type((locateElement("id", "createContactForm_generalPostalCode")), "600097");
		type((locateElement("id", "createContactForm_generalPostalCodeExt")), "0");
		type((locateElement("id", "createContactForm_generalAttnName")), "XYZ");
		type((locateElement("id", "createContactForm_generalAddress2")), "OMR");
		type((locateElement("id", "createContactForm_lastNameLocal")), "Sahoo");
		selectDropDownUsingText((locateElement("id", "createContactForm_generalCountryGeoId")), "India");
		selectDropDownUsingText((locateElement("id", "createContactForm_generalStateProvinceGeoId")), "TAMILNADU");
		click(locateElement("class", "smallSubmit"));
		verifyPartialText((locateElement("id", "viewContact_fullName_sp")), name);
		click(locateElement("xpath", "//a[text()='Edit']"));
		selectDropDownUsingValue((locateElement("id", "addMarketingCampaignForm_marketingCampaignId")), "CATRQ_AUTOMOBILE");
		click(locateElement("xpath", "(//input[@class='smallSubmit'])[2]"));
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		
		
		
		
		
		
	}
}
	
