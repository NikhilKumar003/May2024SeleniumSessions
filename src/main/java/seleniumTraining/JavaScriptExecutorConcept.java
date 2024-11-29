package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorConcept {

	static WebDriver driver;
	static JavascriptExecutor js;
//	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://institute.leo1.in/institute/login");
//		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
//		String url= js.executeScript("return document.URL").toString();
//		System.out.println(url);
////		String title1 = getTitle();
//		System.out.println(title1);
		JavaScriptUtils jsUtils = new JavaScriptUtils(driver);
//		 jsUtils.getPageTitle();
//		System.out.println();
		jsUtils.getPageTitle();
//		jsUtils.getAlerts("Iam on login screen");
		
//		String FullPageText=jsUtils.getPageInnerText();
//		System.out.println(FullPageText);
//		if(FullPageText.contains("Customer Support")) {
//			System.out.println("pass");
//		}
//		jsUtils.ZoomForAllBrowser("400.0");
//		jsUtils.ZoomForAllBrowser(getTitle())
//		jsUtils.scrollToPageHeight("500");
//		jsUtils.scrollToPageDown();
//		Thread.sleep(1000);
		WebElement login=  driver.findElement(By.id("formEmail"));
//		WebElement email=  driver.findElement(By.id("password"));
		
		jsUtils.flash(login);
//		jsUtils.flash(email);
//		WebElement ele1= driver.findElement(By.xpath("//a[text()='Newsletter']"));
//		jsUtils.ScrollIntoView(ele1);
	}

	public static String getTitle() {
		String title = js.executeScript("return document.title").toString();
		return title;
	}
	public static String getURL() {
		String url= js.executeScript("return document.URL").toString();
		System.out.println(url);
		return url;
		
	}
}
