package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementIsEnabledSelected {

	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		System.out.println(driver.getTitle());
		
		Boolean t1 =driver.findElement(By.id("fname")).isDisplayed();
		System.out.println(t1);
		
		Boolean t2= driver.findElement(By.id("fname")).isEnabled();
		System.out.println(t2);
		
//		disabled
		Boolean t3= driver.findElement(By.id("pass")).isEnabled();
		System.out.println(t3);
		
		Boolean t4= driver.findElement(By.id("pass")).isDisplayed();
		System.out.println(t4);
		
		
//		selected method applied for only input tags where checkBox, dropDown & radio
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Boolean t5= driver.findElement(By.name("agree")).isSelected();
		System.out.println(t5);
		
		
		driver.findElement(By.name("agree")).click();
		Boolean t6= driver.findElement(By.name("agree")).isSelected();
		System.out.println(t6);
		
		
	}

}
