package UITests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HdfcLoginFlow {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		List<String> lts = new ArrayList<String>(Arrays.asList("--disable-notifications","--start-maximized"));
		opt.addArguments(lts);
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.hdfcbank.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));
		String mainWindow = driver.getWindowHandle();
		WebElement el1 = driver.findElement(By.xpath("//button[text()='Login']"));
		wt.until(ExpectedConditions.visibilityOf(el1));
		Actions act = new Actions(driver);
		act.moveToElement(el1).build().perform();
		WebElement el2 = driver.findElement(By.xpath("//div[@class='mainTitle']//a[text()='NetBanking']"));
		wt.until(ExpectedConditions.visibilityOf(el2));
		System.out.println(el2.getText());
//		el2.click();
		act.moveToElement(el2).click().build().perform();
//		handle windows
		System.out.println(driver.getCurrentUrl());
		wt.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Iterator<String> it= driver.getWindowHandles().iterator();
		String main = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		String childUrl = driver.getCurrentUrl();
		System.out.println(childUrl);
		WebDriverWait wt1 = new WebDriverWait(driver, Duration.ofSeconds(20));
//        System.out.println(driver.getPageSource());

//		for (String ww : windows) {
//			if(!ww.equals(mainWindow)) {
//				driver.switchTo().window(ww);
//				System.out.println(ww);
//				break;
//			}
//		}
        WebElement framee = driver.findElement(By.xpath("//frame[@name='login_page']"));
        driver.switchTo().frame(framee);
//
		WebElement el3 = wt1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Welcome to HDFC Bank')]")));
//		el3.sendKeys("nikhil");
//		wt.until(ExpectedConditions.visibilityOf(el3));
		Boolean header = el3.isDisplayed();
		if(header==true) {
			System.out.println("switched to new window");
			System.out.println(header);
		}else {
			System.out.println("still we are in parent window");
		}
		
		driver.close();
	}

}
