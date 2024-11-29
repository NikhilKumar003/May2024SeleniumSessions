package seleniumTraining;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CricinfoWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://www.espncricinfo.com/series/bangladesh-in-pakistan-2024-1442203/pakistan-vs-bangladesh-2nd-test-1442214/full-scorecard");
//		System.out.println(driver.getTitle());
		
//		String name=driver.findElement(By.xpath("//span[text()='Abdullah Shafique']/ancestor::td/following-sibling::td/span")).getText();
//		System.out.println(name);
		
//		System.out.println(getWicketTakerName("Saim Ayub"));
//		System.out.println(getWicketTakerName("Babar Azam"));
		
//	

		System.out.println(getScoreDetails("Saim Ayub"));
	}

	
	public static String getWicketTakerName(String batsmen) {
		 return driver.findElement(By.xpath("//span[text()='"+batsmen+"']/ancestor::td/following-sibling::td/span")).getText();
	}
	
	public static List<String> getScoreDetails(String batsmen) {
		List <WebElement> scoreDetailsList=	driver.findElements(By.xpath("//span[text()='"+batsmen+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List <String> scoreDetails =new ArrayList<String>();
		for (WebElement e : scoreDetailsList) {
			String score=e.getText();
			scoreDetails.add(score);
		}
		return scoreDetails;
	}
}
