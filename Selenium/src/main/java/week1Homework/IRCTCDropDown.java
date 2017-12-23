package week1Homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCDropDown {

	public static void main(String[] args) {
		 int i=0;
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByXPath("//a[text()='Sign up']").click();
		
		WebElement country=driver.findElementById("userRegistrationForm:countries");
		Select sc=new Select(country);
		List<WebElement> countrydd=sc.getOptions();
		 
		for(WebElement ele:countrydd)
		 {
			 //System.out.println(ele.getText());
			 if(ele.getText().startsWith("E"))
			 {
				 i=i+1;
				System.out.println(ele.getText());
				ele.click();
				break;
			 }
		 }
			 
		

	}

}
