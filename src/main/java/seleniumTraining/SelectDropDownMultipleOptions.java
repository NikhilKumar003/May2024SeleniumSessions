package seleniumTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownMultipleOptions {

	static WebDriver driver;
	public static void main(String[] args) {

		BrowserUtils br = new BrowserUtils();
		driver =br.initiDriver("chrome");
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		System.out.println(driver.getTitle());
		
		By country= By.id("Form_getForm_Country");
		
//		List<String> TextList  =getDropDownTextList(country);	
//		System.out.println(TextList);
		if(getDropDownTextList(country).contains("India")) {
			System.out.println("pass");
		}
		List<String> ExpectedCountryList= Arrays.asList("India","Australia","Portugal");
		if(getDropDownTextList(country).containsAll(ExpectedCountryList)) {
			System.out.println("pass");
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static List<String> getDropDownTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> list=select.getOptions();
		System.out.println(list.size());
		List <String> optionsTextList= new ArrayList<String>();
		
		
		
		for (WebElement e : list) {
			String text= e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
}
