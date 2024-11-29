package seleniumTraining;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitleUrl {
	
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserUtils br= new BrowserUtils();
		driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		System.out.println(driver.getTitle());
//		when we are giving invalid title, it throwing timeout exception, to handle this we use try catch block
//		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(10));
//		Boolean flag= false;
//		try {
//			flag= wait.until(ExpectedConditions.titleIs("Accountvc Login"));
//			 flag =true;
//		}
//		catch(TimeoutException e){
//			System.out.println("fail");
//		}
//		if(flag) {
//			System.out.println("valid url");
//		}
//		else {
//			System.out.println("INValid url");
//		}
//		waitforTitleIs("Account login", 10);
//		String title= getTitleContains("Account ", 10);
//		System.out.println(title);
		ElementUtils eleUtils = new ElementUtils(driver);
		eleUtils.getUrlContains("login", 0);
	}
	
	public static String getTitleIs(String Expectedtitle, int timeout) {
		if(waitforTitleIs(Expectedtitle, timeout)) {
			return driver.getTitle();
		}
		else {
			return "-1";
		}
	}
	public static String getTitleContains(String fractiontitle, int timeout) {
		if(waitforTitleContains(fractiontitle, timeout)) {
			return driver.getTitle();
		}
		else {
			return "-1";
		}
	}
	

	public static String getUrlContains(String fractiontitle, int timeout) {
		if(waitforURLContains(fractiontitle, timeout)) {
			return driver.getCurrentUrl();
		}
		else {
			return "-1";
		}
	}
	public static Boolean waitforTitleIs(String Expectedtitle, int timeout) {
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(timeout));
		Boolean flag= false;
		try {
		return wait.until(ExpectedConditions.titleIs(Expectedtitle));//if title not matched, it throw timeout exception
		}
		catch(TimeoutException e){
		System.out.println("Title is not matched");
		return flag;
		}
	}

	
	public static Boolean waitforTitleContains(String fractiontitle, int timeout) {
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(timeout));
		Boolean flag= false;
		try {
		return wait.until(ExpectedConditions.titleContains(fractiontitle));//if title not matched, it throw timeout exception
		}
		catch(TimeoutException e){
		System.out.println("Title is not matched");
		return flag;
		}
	}

	public static Boolean waitforURLContains(String fractiontitle, int timeout) {
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(timeout));
		Boolean flag= false;
		try {
		return wait.until(ExpectedConditions.urlContains(fractiontitle));//if title not matched, it throw timeout exception
		}
		catch(TimeoutException e){
		System.out.println("Title is not matched");
		return flag;
		}
	}

}
