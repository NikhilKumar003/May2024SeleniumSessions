package seleniumTraining;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementsUtil {

	static WebDriver driver;
	public static void main(String[] args) {

		 
		BrowserUtils br = new BrowserUtils();
		driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		By tagName= By.tagName("a");
		By imageTag= By.tagName("img");
		
		
		List<WebElement> linkList= getFindElements(tagName);
		int count= getFindElementsCount(imageTag);
		System.out.println(count);
			
		List<String> eletexto = getElementsTextList(tagName);
		System.out.println(eletexto);
		
		System.out.println(eletexto.contains("About Us"));
		System.out.println(eletexto.contains("Returns"));
		
		printElementTextList(tagName);
	}
	public static void printElementTextList(By locator) {
		List <String> eleTextList= getElementsTextList(locator);
		for(String e: eleTextList) {
			System.out.println(e);
		}
	}
	
	
	public static List<String> getElementsTextList(By locator) {
		List <WebElement> eleList= getFindElements(locator);
		List <String> eleTextList = new ArrayList<String>();
		
			for (WebElement e : eleList) {
				String eleText= e.getText();
				if(eleText.length()!=0) {
					eleTextList.add(eleText);
			}
		}
			return eleTextList;
	}
	
	
	
	public static int getFindElementsCount(By locator) {
		return getFindElements(locator).size();
	}
	
	public static List<WebElement> getFindElements(By locator) {
		return driver.findElements(locator);
		
	}
	
	

}
