package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
		
		BrowserUtils br = new BrowserUtils();
		WebDriver driver =br.initiDriver("chrome");
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		List <WebElement> lists =	driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		for (WebElement e : lists) {
			String text= e.getText();
			int totalLength =text.length();
			System.out.println(text);
			if(text.contains("తెలుగ")) {
				e.click();
				break;
			}
		}
	}

}
