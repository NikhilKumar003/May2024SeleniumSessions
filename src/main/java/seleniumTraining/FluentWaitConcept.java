package seleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	public static void main(String[] args) {

		BrowserUtils utils = new BrowserUtils();
		WebDriver driver =utils.initiDriver("chrome");
//		Wait (until();)--> FluentWait(C) -> independent methods(), 
//       --> WebDriverWait(c) will inherit fluentWaits or from waits		
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		By firstName = By.id("Form_getForm_Nameoo");
//		Wait with fluent wait features 
//		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)	
//								.withTimeout(Duration.ofSeconds(5))
//								.pollingEvery(Duration.ofSeconds(2))
//								.ignoring(NoSuchElementException.class)
//								.withMessage("=== element not found ===");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("nikhil");
		
//		WebDriverWait with fluent Wait features
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2))
			.ignoring(NoSuchElementException.class)
			.ignoring(ElementNotInteractableException.class)
			.withMessage("======= element not found====");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("nikhil");
		
		
		
	}

}
