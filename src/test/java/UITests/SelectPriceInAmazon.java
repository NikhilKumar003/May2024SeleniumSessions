package UITests;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectPriceInAmazon {
		
	public static WebDriver driver;
	
	
	
	private static By searchField = By.id("ikea-search-input");
	private static By searchBtn = By.xpath("(//span[@class='search-box-btn__inner'])[2]");
	
	public static void waits(By locator) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static void getElement(By locator) {
		driver.findElement(locator).click();
	}
	public static void getElementSendkeys(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	public static void actionsCall(By locator) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(locator)).build().perform();
	}	
	
	
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.cookies", 2); // 2 = Block all cookies
		prefs.put("profile.block_third_party_cookies", true);
		co.setExperimentalOption("prefs", prefs);
		co.addArguments("--disable-notifications","--start-maximized");
		
		 driver = new ChromeDriver(co);
		driver.get("https://www.ikea.com/in/en/");
		getElementSendkeys(searchField, "Mirror");
		waits(searchBtn);
		getElement(searchBtn);
		
		
		
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
////		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
//		String price = selectProduct("MICKE");
//		System.out.println(price);
	}
	
	public static String selectProduct(String product) {
		return  driver.findElement(By.xpath("//span[text()='"+product+"']/ancestor::div[@class=\"plp-price-module plp-price-module--small"
				+ " plp-price-module--commercial-message-placeholder plp-price-module--none\"]"
				+ "/descendant::span[@class=\"notranslate\"]")).getText();
		
	}

}
