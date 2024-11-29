package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(driver.getTitle());
//		partial scrolling
		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();
////		scroll to footer of page
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
////		scroll to top of page
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
////		scroll to element
		act
		.scrollToElement(driver.findElement(By.linkText("OpenCart")))
		.pause(200)
		.click(driver.findElement(By.linkText("OpenCart")))
		.perform();
	}

}
