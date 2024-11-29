package seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendKeysWithCharSequence {

	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		String name = "Nikhil";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Project");
		
		driver.findElement(By.id("input-email")).sendKeys(name," "+ sb," "+  sf);	
		
		
	}

}
