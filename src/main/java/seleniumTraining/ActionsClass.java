package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		
		By parent=By.xpath("//div[text()='Add-ons']");
		By child=	By.xpath("//div[text()='Visa Services']");
//		WebElement parentMenu= driver.findElement(By.xpath("//div[text()='Add-ons']"));
//		
//		WebElement childMenu=	driver.findElement(By.xpath("//div[text()='Visa Services']"));
//		ParentChildMenu("SpiceClub", "Benefits");
		ParentChildMenu(parent, child);
	
	}

	public static void ParentChildMenu(By parent, By child) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent)).perform();
		Thread.sleep(1000);
		getElement(child).click();
		
	}
	public static void ParentChildMenu(String parent, String child) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(By.xpath("//div[text()='"+parent+"']"))).perform();
		Thread.sleep(1000);
		getElement(By.xpath("//div[text()='"+child+"']")).click();
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
