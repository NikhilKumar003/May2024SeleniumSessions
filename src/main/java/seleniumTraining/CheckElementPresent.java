package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckElementPresent {
	
	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
	
//		int sizes= driver.findElements(By.xpath("//div[@id='logo']")).size();
//	
//		if(sizes==1) {
//			System.out.println("logo present");
//		}
//		else {
//			System.out.println("logo not present");
//		}
		
		By logo= By.xpath("//div[@id='logo']");
			System.out.println(isElementPresent(logo));
			
			System.out.println(isElementPresent(logo, 1));
		By rightLinks= By.xpath("//div[@class='list-group']/a");
		System.out.println(isElementPresent(rightLinks, 13));
		System.out.println(isElementNotPresent(logo));
		By forgotPass=	By.xpath("//a[text()='Forgotten Password']");
		System.out.println(isElementPresentMultipleTimes(forgotPass));
	}
	
	public static boolean isElementNotPresent(By locator) {
		if(getFindElementsCount(locator)==0) {
			return true;
		} return false;
	}
	public static boolean isElementPresentMultipleTimes(By locator) {
		if(getFindElementsCount(locator)>=1) {
			return true;
		}return false;
	}
	
	public static boolean isElementPresent(By locator) {
		if(getFindElementsCount(locator)==0) {
			return true;
		}
		return false;
	}
	
	public static boolean isElementPresent(By locator, int exepectedCount) {
		if(getFindElementsCount(locator)==exepectedCount) {
			return true;
		}
		return false;
	}
	
	public static  List<WebElement> getFindElements(By locator) {
		return driver.findElements(locator);
		
	}

	public  static int getFindElementsCount(By locator) {
		return getFindElements(locator).size();
	}
	
	}
