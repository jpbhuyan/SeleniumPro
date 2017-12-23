package Week2Week3Homework;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;


		public class FluentWaitExample {

			public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
				
				driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
				
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					       .withTimeout(30, TimeUnit.SECONDS)
					       .pollingEvery(1, TimeUnit.SECONDS)
					       .ignoring(NoSuchElementException.class);

					   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
					     public WebElement apply(WebDriver driver) {
					    	 WebElement ele=driver.findElement(By.xpath("//p[@id='demo']"));
					    	 String value=ele.getAttribute("innerHTML");
					    	 
					    	 if(value.equalsIgnoreCase("WebDriver")){
					       return ele;
					    	 }
					    	 else
					    	 {
					    		 System.out.println("Text is: "+value);
					    		 return null;
					    		 
					    	 }
					    	 
					     }
					   });
					 
				
				Boolean str=element.isDisplayed();
				 System.out.println("Element Webdriver Displayed ?  " +str);
				

			}
	

	}


