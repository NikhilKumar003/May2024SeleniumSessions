package seleniumTraining;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathAxis {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtils br= new BrowserUtils();
		 driver= br.initiDriver("chrome");
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		System.out.println(driver.getTitle());
		
		
//		By checkbox =By.xpath("//a[text()='Joe.Root']//parent::td/preceding-sibling::td/input[@type='checkbox']");
//		driver.findElement(By.xpath("//a[text()='Joe.Root']//parent::td/preceding-sibling::td/input[@type='checkbox']"))
//		.click();
	
//		List <WebElement> lists=	driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
//		
//		for (WebElement e : lists) {
//			String text= e.getText();
//			System.out.println(text);
//		}
		selectUser("Joe.Root");
		selectUser("Kevin.Mathews");
		System.out.println(getUserDetails("Kevin.Mathews"));
		System.out.println(getUserDetails("Joe.Root"));
		
		
	}
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']//parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}

	public static List<String> getUserDetails(String userName) {
//		driver.findElement(By.xpath("//a[text()='"+userName+"']//parent::td/preceding-sibling::td/input[@type='checkbox']"));
	
		List <WebElement> userDetails=	driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List <String> userDetailsList= new ArrayList<String>();
		for (WebElement e : userDetails) {
			String text= e.getText();
			userDetailsList.add(text);
		}
		return userDetailsList;
	}
}
