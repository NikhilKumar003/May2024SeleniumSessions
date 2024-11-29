package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstituteDropDownOptimization {

	static WebDriver driver;
	static JavascriptExecutor js;
	static ElementUtils eleU;
	
	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
			 eleU = new ElementUtils(driver);
				 
		 driver.get("https://institute.leo1.in/institute/login");
		 driver.findElement(By.xpath("//input[contains(@type,'Email')]")).sendKeys("singh.ajay@financepeer.co");
		 driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("School@1234");
		 driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		 By loan = By.xpath("//span[contains(text(),'Loan Applications')]");
		 By all = By.xpath("//span[contains(text(),'All Applications')]");
		 By drop = By.cssSelector("div.css-hlgwow");
//		 By loanStatus = By.xpath("//div[text()='Approved']");
		 eleU.waitforElementVisible(loan, 10).click();
//		 
		 eleU.doClick(all);
//		 eleU.waitforElementVisible(drop, 10).click();
//		 eleU.doClick(loanStatus);
		 
		 selectDropDownText(drop, "Disbursed");
		 
	}
	
	public static WebElement selectText(String txt) {
		return	driver.findElement(By.xpath("//div[text()='"+txt+"']"));
	}
	
	public static void selectDropDownText(By locator, String text) {
		eleU.getElement(locator).click();
		WebElement DD = selectText(text);
		eleU.waitforElementVisible(DD, 10).click();
			
	 }

}
