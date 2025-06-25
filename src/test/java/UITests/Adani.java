package UITests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adani {

	public static void main(String[] args) {

		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.adanielectricity.com/ ");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1000));
		
		
		WebElement e1 = driver.findElement(By.xpath("//div[@class='modal-body']//span"));
		wait.until(ExpectedConditions.visibilityOf(e1));
		e1.click();
		
		WebElement bot = driver.findElement(By.cssSelector("div.xdk-view-wrapper "));
		wait.until(ExpectedConditions.visibilityOf(bot));
		driver.switchTo().frame(bot);
		bot.click();
	}

}
