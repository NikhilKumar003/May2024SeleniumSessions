package seleniumTraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {

	public static void main(String[] args) {
		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		
		String ParentId= driver.getWindowHandle();
		System.out.println(ParentId);
		WebElement pressBtn= driver.findElement(By.xpath("//div[text()='SpiceScreen']"));
		WebElement taxiBtn= driver.findElement(By.xpath("//div[text()='Taxi']"));
		Actions act = new Actions(driver);
		act.click(pressBtn).perform();
		
		Set <String> windows= driver.getWindowHandles();
		Iterator <String> it=windows.iterator();
		String parentIdd= it.next();
		System.out.println(driver.getTitle());
//		driver.switchTo().window(parentIdd);
		System.out.println(parentIdd);
		String childIdd= it.next();
		System.out.println(driver.getTitle());
		System.out.println(childIdd);
		driver.switchTo().window(childIdd);
		driver.close();
		driver.switchTo().window(ParentId);
		act.click(taxiBtn).perform();
		
		
	}

}
