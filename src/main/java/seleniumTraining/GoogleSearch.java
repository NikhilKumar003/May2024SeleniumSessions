package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

//		WebDriver driver;
		BrowserUtils br = new BrowserUtils();
		driver= br.initiDriver("chrome");
		
		driver.get("https://www.google.co.in/");
		By searchField= By.name("q");
		By suggestions = By.xpath("//ul/li//div[@class='wM6W7d']");
	
//		doSearch(searchField, suggestions, "selenium", "tutorial");
		
		ElementUtils eleutils =new ElementUtils(driver);
		eleutils.doSearch(searchField, suggestions, "acvcvcvcvcvc", "tutorial");
//		eleutils.doSearch(searchField, suggestions, "", null)
	}
	
//	public static void doSearch(By searchField, By suggestions,String suggestName, String matchValue) throws InterruptedException {
//
//		driver.findElement(searchField).sendKeys(suggestName);
//		Thread.sleep(2000);
//		
//		List<WebElement> suggestElement = driver.findElements(suggestions);
//		System.out.println(suggestElement.size());
//		
//		for(WebElement e: suggestElement) {
//			String Text= e.getText();
//			System.out.println(Text);
//			if(Text.contains(matchValue)) {
//				e.click();
//				break;
//			}
		
	

}
