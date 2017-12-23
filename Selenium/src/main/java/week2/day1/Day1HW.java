package week2.day1;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1HW {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Merge Leads").click();
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			driver.findElement(By.xpath("(//img[@alt='Lookup' ])[1]")).click();
			
			Set<String> allWindows=driver.getWindowHandles();
			System.out.println(allWindows.size()); //number of windows open
			
			List<String> currWindow=new ArrayList<String>();
			currWindow.addAll(allWindows);
			String wind=currWindow.get(1);
			driver.switchTo().window(wind);
			 
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			driver.findElementByXPath("//input[@name='id' and @class=' x-form-text x-form-field']").sendKeys("10");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			Thread.sleep(5000);
			WebElement ele=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
			String fromID=ele.getText();
			System.out.println("From ID is" +fromID);
			ele.click();
			String wind1=currWindow.get(0);
			driver.switchTo().window(wind1);
			
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			
			Set<String> allWindows2=driver.getWindowHandles();
			List<String> currWindow2=new ArrayList<String>();
			currWindow2.addAll(allWindows2);
			String wind2=currWindow2.get(1);
			driver.switchTo().window(wind2);
			
		    System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			driver.findElementByXPath("//input[@name='id']").sendKeys("10");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			Thread.sleep(5000);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[5]").click();
			
			String wind3=currWindow.get(0);
			driver.switchTo().window(wind3);
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			driver.findElementByClassName("buttonDangerous").click();
			
			
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
			
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			driver.findElementByXPath("//input[@name='id']").sendKeys(fromID);
			
			
		

	}

}
