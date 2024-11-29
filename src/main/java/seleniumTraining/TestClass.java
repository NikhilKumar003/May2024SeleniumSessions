package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		

		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		
		By Email= By.id("input-email");
		By pass = By.id("input-password");
		By login= By.xpath("//input[@value='Login']");
		
		
		ElementUtils eleUtils = new ElementUtils(driver);
		eleUtils.doSendKeys(Email, "test@gmail.com");
		eleUtils.doSendKeys(pass, "test1@ioin");
		Thread.sleep(2000);
//		eleUtils.doClick(login);
		String text= eleUtils.getAttributeValue(login, "value");
		System.out.println(text);
	}

}
