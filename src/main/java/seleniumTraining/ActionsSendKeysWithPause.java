package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			BrowserUtils br= new BrowserUtils();
			 driver= br.initiDriver("chrome");
			
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			System.out.println(driver.getTitle());
			
			By ele =By.id("input-firstname");
			WebElement name =driver.findElement(ele);
			
			doActionsSendKeysWithPause(ele, "Nikhil Kumar", 100);
	}
		public static void doActionsSendKeysWithPause(By locator,String value, long pauseTime) {
			Actions act = new Actions(driver);
			char ch[]= value.toCharArray();
			for (char c : ch) {
				act.sendKeys(getElement(locator), String.valueOf(c)).pause(pauseTime).perform();
			}
		}
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}

}
