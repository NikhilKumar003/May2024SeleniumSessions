package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendkeys {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		By firstName= By.xpath("//input[@placeholder='First Name']");
		By agreeBox=By.xpath("//input[@name='agree']");
		
		doActionSendKeys(firstName, "nikhil");
		
		doActionsClick(agreeBox);
		
		
	}
	
	public static void doActionSendKeys(By locator, String name) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), name).perform();
	}

	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
