package seleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindows {

	static WebDriver driver;
	public static void main(String[] args) {

		BrowserUtils utls =new  BrowserUtils();
		driver= utls.initiDriver("chrome");
		
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		WebElement elmnt= driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		Actions act = new Actions(driver);
		act.click(elmnt).build().perform();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//		Boolean flag =wait.until(ExpectedConditions.numberOfWindowsToBe(4));
//			System.out.println(flag);
		Boolean flag=	waitForNewWindowOrTab(5, 10);
		System.out.println(flag);
	}
	public static Boolean waitForNewWindowOrTab(int timeout, int noOfWindows) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
		if(wait.until(ExpectedConditions.numberOfWindowsToBe(noOfWindows))){
			return true;
		   }
		}
		catch(TimeoutException e) {
		System.out.println("no of windows not matched.....");	
		}
		return false;
		}
}
