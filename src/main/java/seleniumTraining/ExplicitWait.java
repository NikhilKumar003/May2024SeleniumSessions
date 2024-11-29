package seleniumTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	static WebDriver driver ;
	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.id("input-email")).sendKeys("nikhil.kum@in.in");
//		driver.findElement(By.id("input-password")).sendKeys("nikhil.kum@in.in");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		By login =By.id("input-email");
		By pass= By.id("input-password");
		By btn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(btn));
//		driver.findElement(login).sendKeys("nikhil@renew");
//		driver.findElement(pass).sendKeys("qwerty@123");
//		driver.findElement(btn).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(login));		
//		wait.until(ExpectedConditions.pr)
		waitforElementVisible(login, 10);
		getElementBySendKeys(login, "nikhil@lom.in");
		getElementBySendKeys(pass, "qwert@234");
		getElementClick(btn);
//  visiblty- An expectation for checking that an element, known to be present on the DOM of a page, is visible. Visibility means that the element is not only displayed but also has a height andwidth that is greater than 0.
//	presense-	An expectation for checking that an element is present on the DOM of a page. This does not necessarily mean that the element is visible.
	}
	public static WebElement waitforElementpresence(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public static WebElement waitforElementVisible(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		return	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
//	wait for all elements visible
	public static List<WebElement> waitForElementsVisible(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static  void getElementClick(By locator) {
		driver.findElement(locator).click();
	}
	public static void getElementBySendKeys(By locator, String text) {
	 	driver.findElement(locator).sendKeys(text);
	}
}
