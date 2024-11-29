package seleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleElements {

	public static void main(String[] args) {

		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		
		List<WebElement> MultipleTags= driver.findElements(By.tagName("a"));
		int totalCount=  MultipleTags.size();
		System.out.println(totalCount);
//		int count =0;
//		int finalCount = 0;
//		for(int i=0;i<totalCount;i++) {
//			String name= MultipleTags.get(i).getText();
//			
//			if(name.length()!=0) {
//				System.out.println(i+ "="+ name);	
//				count++;
//				finalCount= 0 + count;
////				"totalValue" +"="+ finalCount;
////				System.out.println("totalValueOfEmptyString" +"="+  (totalCount-finalCount));
//			}
//		}
//		System.out.println("totalValueWithString" +"="+ finalCount);
//		System.out.println("totalValueOfEmptyString" +"="+  (totalCount-finalCount));
		
		
		
		for (WebElement e : MultipleTags) {
			String element = e.getText();
			if(element.length()!=0) {
				System.out.println(element);
			}
			
		}
	driver.quit();
	}

}
