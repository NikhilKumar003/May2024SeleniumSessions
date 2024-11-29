package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownWithoutSelectClass {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtils br = new BrowserUtils();
		  driver =br.initiDriver("chrome");
	
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		System.out.println(driver.getTitle());
		By countryOptions= By.xpath("//select[@name='Country']/option");
		SelectDropDownValue(countryOptions, "Brazil");
		
	}
	
	public static void SelectDropDownValue(By locator, String value) {
	List<WebElement> CountryList= driver.findElements(locator);
		
		for (WebElement e : CountryList) {
			String names = e.getText();
			System.out.println(names);
			if(names.equals(value)) {
				e.click();
				break;
			}
			
		}
	}

}
