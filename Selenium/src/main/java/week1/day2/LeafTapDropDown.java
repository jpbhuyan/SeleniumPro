package week1.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LeafTapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launching Chrome Driver
		//ClassName obj=new ClassName();
		ChromeDriver driver=new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Entering the 
		driver.get("http://leaftaps.com/opentaps");
		//Find the elements and perform action
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		//Selected option by sendKeys
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Other");
		
		Thread.sleep(3000);
		 
		WebElement sourcedd= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd=new Select(sourcedd);
		
		dd.selectByValue("LEAD_EXISTCUST");		
		Thread.sleep(3000);
		dd.selectByVisibleText("Partner");
		
		List<WebElement> var1 = dd.getOptions();
		
		int count=var1.size();
		System.out.println(count);
		dd.selectByIndex(count-2);
		
		for (WebElement ele : var1) 
		{
			String valueofdd=ele.getText();
			System.out.println(valueofdd);
			
			
			
		}
		
	}

}
