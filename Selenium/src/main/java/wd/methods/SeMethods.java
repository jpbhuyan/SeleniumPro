package wd.methods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeMethods implements WdMethods{

	public RemoteWebDriver driver = null;
	int i = 1;
	
	public void startApp(String browser, String url) {
		
		

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}		
			driver.get(url);		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The browser "+browser+" is launched");
		} catch (WebDriverException e) {
			e.printStackTrace();
			System.err.println("Unable to Start Application");
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
		
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement element = null;
		try {
			switch (locator) {
			case "id":element = driver.findElementById(locValue);			
			break;
			case "class":element = driver.findElementByClassName(locValue);			
			break;
			case "text" :element = driver.findElementByLinkText(locValue);
			break;
			case "name" :element = driver.findElementByName(locValue);
			break;
			case "xpath" :element = driver.findElementByXPath(locValue);
			break;
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.println("Element not found");
		} 
		
		return element;
	}

	public void type(WebElement ele, String data) {
       	
		try {
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The text field is entered with "+data);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.println("Textbox not found");
		
		}
		catch (WebDriverException e) {
			e.printStackTrace();
		}
		finally{
		takeSnap();
			}
	}

	public void click(WebElement ele) {
		
       
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
			ele.click();
			System.out.println("The button/link is clicked");
		} catch (NoSuchElementException e) {
			 e.printStackTrace();
			System.err.println("The button is not clicked");
		} finally {
			takeSnap();
		}
		}
	public void submit(WebElement ele) {
      
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.submit();
			System.out.println("The button/link is Submitted");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.println("Submit Button not found");
		}
		finally{
		takeSnap();
		}
	}

	public void clickWithNoSnap(WebElement ele) {
        
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			System.out.println("The button/link is clicked without Snapshot");
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.println("Button/Checkbox not found");
		}

	}

	public String getText(WebElement ele) {
			
			String text=null;
			
			try {
				WebDriverWait wait=new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOf(ele));
				text = ele.getText();
				System.out.println("Text of the element has been retrived: " +text);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		
		Select dropdown=new Select(ele);
		dropdown.selectByVisibleText(value);
		System.out.println("Value successfully selected from Dropsown; Value is : " +value);
		takeSnap();
		

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dropdown=new Select(ele);
		dropdown.selectByIndex(index);
		System.out.println("Value successfully selected from Dropdown");
		takeSnap();
	}
	public void selectDropDownUsingValue(WebElement ele, String value) {
		Select dropdown=new Select(ele);
		dropdown.selectByValue(value);
		System.out.println("Value successfully selected from Dropdown");
		takeSnap();
	}
	
	public void printDropDownDetails(WebElement ele){
		
		Select dropdown=new Select(ele);
		List<WebElement> dropdownValues=dropdown.getOptions();
		for(WebElement dropdownVar: dropdownValues)
		{
			System.out.println("Number of values presen t in the dropdown is: "+dropdownVar.getSize());
			String value=dropdownVar.getText();
			System.out.println("Values in the Dropdown are below:");
			System.out.println(value);
		}

	}

	public void verifyTitle(String expectedTitle) {
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
			System.out.println("Title of the current page matches with Expected :  ");
		else
			System.out.println("Title not matching with expected; Actual Title is:  "+actualTitle);

	}

	public void verifyExactText(WebElement ele, String expectedText) {
		
		if(getText(ele).equals(expectedText))
			System.out.println("String has been verified and its matching with expected");
		else
			System.out.println("String has been verified and its not matching with expected");

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		
		if(getText(ele).contains(expectedText))
			System.out.println("String has been verified and its matching with expected ignoring the Case");
		else
			System.out.println("String has been verified and its not matching with expected ignoring the Case also");
		

	}
      public String getAttributeValue(WebElement ele) {
		
		String attributelValue=ele.getAttribute("value");
		System.out.println(attributelValue);
		return attributelValue;
	}


	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		
		String actualValue=ele.getAttribute(attribute);
		System.out.println("Actual Attribute is:  "+attribute+ "  and its actual value is: "+actualValue);
		 
		boolean result=actualValue.matches(value);
		if(result==true)
		System.out.println("Attribute value matches with expected ");
		else
		System.out.println("Attribute value does not match with expected; Actual value is:  " +actualValue );
		
		/*if(actualValue.equals(value))
		{
			System.out.println("Attribute value matches with expected" );
		}
		else
		{
			System.out.println("Attribute value not matching with expected; Please verify the element");
		}*/
			
		
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		
		String actualValue=ele.getAttribute(attribute);
		System.out.println("Actual Attribute is:  "+attribute+ "  and its actual value is: "+actualValue);
		
		if(actualValue.contains(value))
		{
			System.out.println("Attribute Value partially matched with Expected" );
		}
		else
		{
			System.out.println("Attribute value not matching with expected; " +actualValue);
		}

		
	}

	public void verifySelected(WebElement ele) {
		
		boolean verifySelection=ele.isSelected();
		System.out.println("Element has been Selected " +verifySelection);

	}

	public void verifyDisplayed(WebElement ele) {
		
		boolean verifyIfDisplayed=ele.isDisplayed();
		System.out.println("Element has been Displayed " +verifyIfDisplayed);

	}

	public void switchToWindow(int index) {
		
	    Set<String> getWindows=driver.getWindowHandles();
		
		List<String> currWindow=new ArrayList<String>();
		currWindow.addAll(getWindows);
	
		String desiredWindow=currWindow.get((index));
		
		System.out.println("Before Switching Window");
		System.out.println("URL: " +driver.getCurrentUrl());
		System.out.println("Title: "+driver.getTitle());
		
		driver.switchTo().window(desiredWindow);
		
		
		System.out.println("After Switching Window");
		System.out.println("URL: " +driver.getCurrentUrl());
		System.out.println("Title: "+driver.getTitle());
		
	}
	public void switchToDefaultWindow()
	{
        Set<String> getWindows=driver.getWindowHandles();
		List<String> currWindow=new ArrayList<String>();
		currWindow.addAll(getWindows);
		String firstWindow=currWindow.get(0);
		driver.switchTo().window(firstWindow);
		
		
	}
	

	public void switchToFrame(WebElement ele) {
		
		driver.switchTo().frame(ele);
		System.out.println("Control Switched to the Frame");
	}

	public void acceptAlert() {
		
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");

	}
    public void typeAndAcceptAlert(String value) {
		
		driver.switchTo().alert().sendKeys(value);
		System.out.println("Value Entered in Alert:  "+value);

	}

	public void dismissAlert() {
		
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Dismissed");

	}

	public String getAlertText() {
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/snap"+i+".jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;		

	}

	public void closeBrowser() {
		driver.close();
		System.out.println("The browser is closed");

	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("All the browsers are closed");
	}

	
	

}