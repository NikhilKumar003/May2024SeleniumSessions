package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		
		By Email =By.id("input-email");
		By pass=  By.id("input-password");
		
		By confirm =By.name("agree");
		By login= By.linkText("Login");
		By register = By.linkText("Register");
		
		ElementUtils eleUtils = new ElementUtils(driver);
		eleUtils.doSendKeys(Email, "test@gmail.in");
		eleUtils.doSendKeys(pass, "test@1234");
		Thread.sleep(2000);
		eleUtils.doClick(login);
		eleUtils.doClick(register);
		eleUtils.doClick(confirm);
		
		br.quitBrowser();	
		
	}

}
