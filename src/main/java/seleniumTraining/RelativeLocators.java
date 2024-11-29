package seleniumTraining;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelativeLocators {

	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://www.aqi.in/dashboard/india");
		System.out.println(driver.getTitle());
		
		WebElement country=driver.findElement(By.linkText("Pune, India"));
		String sno=driver.findElement(with(By.tagName("P")).toLeftOf(country)).getText();
		System.out.println(sno);
		String count=driver.findElement(with(By.tagName("P")).toRightOf(country)).getText();
		System.out.println(count);
		String city=driver.findElement(with(By.tagName("P")).below(country)).getText();
		System.out.println(city);
		String city1=driver.findElement(with(By.tagName("P")).above(country)).getText();
		System.out.println(city1);
		String aqi=driver.findElement(with(By.tagName("P")).near(country)).getText();
		System.out.println(aqi);
	}

}
