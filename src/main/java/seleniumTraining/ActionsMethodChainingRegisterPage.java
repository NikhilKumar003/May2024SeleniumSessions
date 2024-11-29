package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegisterPage {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(driver.getTitle());
		WebElement first =driver.findElement(By.id("input-firstname"));
		Actions act = new Actions(driver);
		act.sendKeys(first, "nikhil")
		.sendKeys(Keys.TAB) 
		.pause(200)
		.sendKeys("kumar")
		.sendKeys(Keys.TAB)
		.pause(200)
		.sendKeys("nikhil@enk.in")
		.sendKeys(Keys.TAB)
		.pause(200)
		.sendKeys("7823232")
		.sendKeys(Keys.TAB)
		.pause(200)
		.sendKeys("kumar")
		.sendKeys(Keys.TAB)
		.pause(200)
		.sendKeys("kumar")
		.sendKeys(Keys.TAB)
		.pause(200)
		.sendKeys(Keys.TAB)
		.pause(200)
		.sendKeys(Keys.TAB)
		.pause(200)
		.sendKeys(Keys.SPACE).pause(200)
		.sendKeys(Keys.ENTER)
		.perform();
		
		
		
	}

}
