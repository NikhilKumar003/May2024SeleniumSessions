package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AccessibilityTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB)
		.pause(100)
		.sendKeys(Keys.TAB)
		.pause(100)
		.sendKeys(Keys.TAB)
		.pause(100)
		.sendKeys(Keys.TAB)
		.pause(100)
		.sendKeys(Keys.TAB).sendKeys("macbook air1").sendKeys(Keys.ENTER)
		.perform();
	}
	
}
