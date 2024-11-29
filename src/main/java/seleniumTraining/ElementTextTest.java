package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementTextTest {

	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		
		By header1= By.tagName("h2");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By forget = By.linkText("Forgotten Password");
		By footer = By.tagName("h5");
		By Email =By.id("input-email");
		
		ElementUtils eleutils = new ElementUtils(driver);
		System.out.println(eleutils.dogetElementText(header1));
		System.out.println(eleutils.dogetElementText(para));
		System.out.println(eleutils.dogetElementText(forget));
		System.out.println(eleutils.dogetElementText(footer));
		
		eleutils.doSendKeys(Email, null); //illegal argument exception
		
		
		
		
	}

}
