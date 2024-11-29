package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtils br = new BrowserUtils();
		 driver =br.initiDriver("chrome");
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		System.out.println(driver.getTitle());
		
		By country= By.id("Form_getForm_Country");
//		WebElement countryEle= driver.findElement(country);
//		Select select = new Select(countryEle);
//		select.selectByIndex(115);
//		select.selectByVisibleText("India");
//		select.selectByValue("Portugal");
		
//		selectDropDownValueByVisibleText(country, "India");
//		selectDropDownValueByValue(country, "Germany");
//		selectDropDownValueByIndex(country, 116);
		
//		List <WebElement> list= select.getOptions();
//		System.out.println(list.size());
		
		System.out.println(getDropDownOptionsCount(country));
	}
	
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	

	public static void selectDropDownValueByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	public static void selectDropDownValueByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void selectDropDownValueByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static  List<WebElement> getFindElements(By locator) {
		return driver.findElements(locator);
		
	}
	public  static int getFindElementsCount(By locator) {
		return getFindElements(locator).size();
	}
}
