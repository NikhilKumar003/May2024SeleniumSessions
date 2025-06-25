package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AmazonSelectAllCheckBoxes {
	WebDriver driver;
	JavascriptExecutor js;
	
	public AmazonSelectAllCheckBoxes(WebDriver driver) {
		this.driver =driver;
		js =(JavascriptExecutor)driver;
	}
	
	 By searchBox = By.id("twotabsearchtextbox");
	 By titanBrandCheckbox = By.xpath("//span[text()='Titan']/preceding-sibling::div//i");
	   
}
