package week2.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();		
			driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			driver.findElementByLinkText("Contact Us").click();
			
			Set<String> allWindow=driver.getWindowHandles();
			System.out.println(allWindow.size());			
			List<String> currWindow=new ArrayList<String>();
			currWindow.addAll(allWindow);
			String secondWindow=currWindow.get(1);
			driver.switchTo().window(secondWindow);
			
			System.out.println("After Switching to second window:");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());

	}

}
