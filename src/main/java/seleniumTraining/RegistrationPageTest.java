package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtils br = new BrowserUtils();
		WebDriver driver = br.initiDriver("chrome");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(driver.getTitle());

		By header = By.tagName("h1");
		By confirme = By.name("agree");
		By successHeader = By.tagName("h1");
		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By emaill = By.id("input-email");
		By tphone = By.id("input-telephone");
		By passe = By.id("input-password");
		By confirm = By.id("input-confirm");
		By Continue = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

		ElementUtils eleUtils = new ElementUtils(driver);
		String headerName = eleUtils.getElement(header).getText();
		System.out.println(headerName);

		eleUtils.doSendKeys(fName, "Nikhil");
		eleUtils.doSendKeys(lName, "kum");
		eleUtils.doSendKeys(emaill, "nikhil.kum@au.in");
		eleUtils.doSendKeys(tphone, "9043435632");
		eleUtils.doSendKeys(passe, "test@1234");
		eleUtils.doSendKeys(confirm, "test@1234");
		eleUtils.doClick(confirme);
		eleUtils.doClick(Continue);
		Thread.sleep(2000);
		System.out.println(eleUtils.getElement(successHeader).getText());
	}

}
