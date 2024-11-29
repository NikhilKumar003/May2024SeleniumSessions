package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultilevelActions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://www.bigbasket.com/");
		System.out.println(driver.getTitle());
		
		By first= By.xpath("(//span[text()='Category'])[2]");
		By second= By.linkText("Fruits & Vegetables");
		By third= By.linkText("Cuts & Sprouts");
		By fourth= By.linkText("Cut & Peeled Veggies");
		
		ParentChildMenu(first, second, third, fourth);
		
		
	}
	
	public static void ParentChildMenu(By first, By second, By third, By fourth) throws InterruptedException {
		getElement(first).click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(getElement(second)).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(third)).perform();
		Thread.sleep(1000);
		getElement(fourth).click();
		
	}
	public static WebElement getElement(By locator) {
		return	driver.findElement(locator);
	}

}
