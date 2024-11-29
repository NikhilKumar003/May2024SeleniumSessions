package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FetchTextFieldValue {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		
		WebElement searchField =  driver.findElement(By.name("search"));
		searchField.sendKeys("nikhil");
		String searchValue = searchField.getAttribute("value");
		System.out.println(searchValue);
		By email = By.id("input-email");
		By passwrd=  By.id("input-password");
		By linkText= By.linkText("Login");
		
		String v4= getAttributeValue(linkText, "href");
		doSendKeys(email, "nikhil@gmail.in");
		doSendKeys(passwrd, "test@1234");
		String v1= getAttributeValue(email, "value");
		String v2= getAttributeValue(passwrd, "value");
		String v3=	getAttributeValue(passwrd, "placeholder");
		System.out.println(v1+" "+ v2+" "+v3+" "+ v4);
//		driver.close();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	

	public static String getAttributeValue(By locator, String value) {
		return getElement(locator).getAttribute(value);
	}
	
	
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
}
	
}
