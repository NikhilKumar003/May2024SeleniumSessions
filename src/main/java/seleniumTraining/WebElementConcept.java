package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver =new ChromeDriver();
//		1).
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.findElement(By.id("input-email")).sendKeys("nikhil@123.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
////		2).
//		WebElement ele1= driver.findElement(By.id("input-email"));
//		WebElement pass1= driver.findElement(By.id("input-password"));
		
//		ele1.sendKeys("nikhil@123.co");
//		pass1.sendKeys("test@!233");
////		3). using by locators
		By emailId= By.id("input-email");
		By passWrd= By.id("input-password");

		
//		WebElement ele1= driver.findElement(emailId);
//		WebElement pass1= driver.findElement(passWrd);
//		
//		ele1.sendKeys("nikhil@1234.com");
//		pass1.sendKeys("test@1234");
		
//		4). By locator + generic method: driver is written only one time compare to 3,2,1 methods
//		getElement(emailId).sendKeys("nikhil@1234.com");
//		getElement(passWrd).sendKeys("test@1234"); 
		
//		5). By locator + generic method: with sendkeys	(actions)
		
//		doSendKeys(emailId, "nikhil@1234.com");
//		doSendKeys(passWrd, "test@1234");
		
		ElementUtils ele = new ElementUtils(driver);
		ele.doSendKeys(emailId, "nikhil@123.com");
		ele.doSendKeys(passWrd, "test@1234");
		
//		6). By locator + generic method for actions & web element in element utils class
		
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
//		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
		
	
	

}
