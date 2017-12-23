package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTap {

	public static void main(String[] args) {
		
		//Path for chrome driver
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
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hexaware");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jyoti");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bhuyan");
		driver.findElementByClassName("smallSubmit").submit();		

	}

}
