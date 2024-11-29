package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickAction {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtils br = new BrowserUtils();
		driver = br.initiDriver("firefox");
//		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());

//		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.name("agree")).click();

		By confirm =By.name("agree");
		By login= By.linkText("Login");
		By register = By.linkText("Register");
		
		doClick(login);
		doClick(register);
		doClick(confirm);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	
}
