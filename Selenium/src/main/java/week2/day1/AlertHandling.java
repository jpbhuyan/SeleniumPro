package week2.day1;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert dri=driver.switchTo().alert();
		Thread.sleep(3000);
		
		dri.sendKeys("Jyotirmayee");
		
		Thread.sleep(3000);
		dri.accept();
		
		WebElement ele=driver.findElementById("demo");
		
		String str=ele.getAttribute("id");
		System.out.println(str);
		System.out.println(ele.getText());
		int result=ele.getText().compareTo("Hello Jyotirmayee! How are you Today?");
		System.out.println(result);

	}

}
