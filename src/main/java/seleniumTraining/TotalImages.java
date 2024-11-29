package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalImages {

	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		List<WebElement> TotalImages = driver.findElements(By.tagName("img"));
		int totalNos= TotalImages.size();
		System.out.println(totalNos);
		
//		for (WebElement e : TotalImages) {
//			String imageLinks = e.getAttribute("src");
//			System.out.println(imageLinks);
//		}
//		capture all links,print link text & href values
		
		List<WebElement> totalLinks= driver.findElements(By.tagName("a"));
		int totalSize= totalLinks.size();
		System.out.println(totalSize);
		
		for (WebElement e : totalLinks) {
			String text= e.getText();
			String textLinks= e.getAttribute("href");
			System.out.println(text +":==:)=> "+ textLinks);
		}
		
		driver.quit();
	}

}
