package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightContextClick {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
//		List<WebElement> rightList= driver.findElements(By.cssSelector("ul.context-menu-list span"));
//		for (WebElement e : rightList) {
//			String text= e.getText();
//			System.out.println(text);
//		}
		By right =By.xpath("//span[text()='right click me']");
		By copy =By.xpath("//span[text()='Copy']");
		
		doRightClick(right, copy);
	}

	public static void doRightClick(By right1, By copy1) {
		Actions act= new Actions(driver);
		act.contextClick(getElement(right1)).perform();
		getElement(copy1).click();
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
