package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SvgElements {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String svgPath ="//*[local-name()='svg' and @id='map-svg']//*[name()='g' "
				+ "and @id='regions']//*[name()='g' and @class='region']//*[name()='path']";
		
		
		List <WebElement> paths = driver.findElements(By.xpath(svgPath));
		System.out.println(paths.size());
		Actions act = new Actions(driver);
		for (WebElement e : paths) {
			act.moveToElement(e).perform();
			String name = e.getAttribute("name");
			
			if(name.contains("California")) {
				act.click(e).perform();
				break;
			}
			
			Thread.sleep(1000);
			
			
		}
		
	}

}
