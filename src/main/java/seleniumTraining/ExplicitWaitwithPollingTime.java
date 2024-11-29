package seleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitwithPollingTime {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		WebElement txt = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		By tst = By.xpath("(//input[@type='text'])[2]");
		By login = By.xpath("//input[@value='Login']");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));

		wait.until(ExpectedConditions.visibilityOfElementLocated(tst));
		
//		wait.until(ExpectedConditions.visibilityOf(txt)).sendKeys("nikhil");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(tst))
		
		ElementUtils utils = new ElementUtils(driver);
		utils.waitForElementAndClick(login, 10);
	}

}
