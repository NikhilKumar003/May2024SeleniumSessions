package seleniumTraining;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitle2 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtils br = new BrowserUtils();
		driver =br.initiDriver("chrome");
		
		driver.get("https://classic.crmpro.com/");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Boolean flag = false;
//		try {
//			flag= wait.until(ExpectedConditions.titleIs("Free CRM software for cur relationship management, sales, and support."));
//			flag = true;
//		}
//		catch(TimeoutException e){
//			System.out.println("Invalid title");
//		}
//		if(flag){
//			System.out.println("true");
//			}
//		else {
//			System.out.println("fail");
//		}
//		waitForTitle("nikhil", 10);
//		String title = getTitleIs("Free CRM software for customer relationship management, sles, and support.", 5);
//		System.out.println(title);
		
		 String titlee =getTitlecontains("customer relationship management", 5);
		System.out.println(titlee);
		}
//	title with wrapper class	
	public static String getTitleIs(String ExpectedTitle, int timeout) {
		if(waitForTitleIs(ExpectedTitle, timeout)) {
			System.out.println("valid title");
			return driver.getTitle();
		}
		else {
			System.out.println("Invalid Title");
			return "-1";
		}
	}
	
	public static Boolean waitForTitleIs(String ExpectedTitle, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		Boolean flag = false;
		try {
			return wait.until(ExpectedConditions.titleIs(ExpectedTitle));// if title is invalid, then it throws exception, so directly it goes to catch block
			}
		catch(TimeoutException e){
			System.out.println("Invalid title");
			return flag;
		}
	}
//	title with wrapper class using contains method
	public static String getTitlecontains(String ExpectedTitle, int timeout) {
		if(waitForTitleContains(ExpectedTitle, timeout)) {
			System.out.println("valid title");
			return driver.getTitle();
		}
		else {
			System.out.println("Invalid title");
			return "-1";
		}
	}
		
	public static Boolean waitForTitleContains(String ExpectedTitle, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		Boolean flag= false;
		try {
			return wait.until(ExpectedConditions.titleContains(ExpectedTitle));
			}
		catch(TimeoutException e){
			System.out.println("Invalid tile");
			return flag;
		}
	}
//	get page url using wrapper class
	public static String getPageURL(String FractionURL, int timeout) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(waitforURLContains(FractionURL, timeout)) {
			System.out.println("Valid url");
			return driver.getCurrentUrl();
		}
		else {
			System.out.println("Invalid url");
			return "-1";
		}
	}
	
	
	public static Boolean waitforURLContains(String FractionUrl, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		Boolean flag= false;
		try {
		return wait.until(ExpectedConditions.urlContains(FractionUrl));
	}
		catch(TimeoutException e){
			System.err.println("Invalid url");
			return flag;
		}
	}
}
