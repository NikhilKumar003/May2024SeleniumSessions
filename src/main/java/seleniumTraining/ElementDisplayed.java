package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementDisplayed {

	static WebDriver driver ;
	public static void main(String[] args) {

		BrowserUtils br = new BrowserUtils();
		driver = br.initiDriver("chrome");

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());

//		driver.findElement(By.className("img-responsive1"));
		By image= By.className("img-responsive1");
		if(isElementDisplayed(image)) {
			System.out.println("image present");
		}
		else {
			System.out.println("image not present");	
		}
		
	}

	public static Boolean isElementDisplayed(By locator) {// custom method

		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("element isn't displayed");
			return false;
		}
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
}
