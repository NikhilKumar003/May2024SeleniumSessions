package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptHighlights {

	static WebDriver driver;
	static JavascriptExecutor js;
	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		 JavaScriptUtils jsUtils = new JavaScriptUtils(driver);
		driver.get("https://institute.leo1.in/institute/login");
		
		String title= jsUtils.getPageTitle();
		System.out.println(title);
		WebElement login=  driver.findElement(By.id("formEmail"));
//		WebElement email=  driver.findElement(By.id("password"));
		jsUtils.flash(login);
		
		login.sendKeys("nikhil");
	
	}

}
