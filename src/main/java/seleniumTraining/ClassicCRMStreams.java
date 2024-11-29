package seleniumTraining;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMStreams {

	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
//		List<WebElement> list= driver.findElements(By.cssSelector("section#details h3"));
//		list.stream()
//			.forEach(e-> System.out.println(e.getText()));
	By headers =	By.cssSelector("section#details h3");
		printHeaderList(headers);
		
		if(getHeaderList(headers).contains("Reports")) {
			System.out.println("PASS");
		}
	}
	public static void printHeaderList(By locator) {
		List<WebElement> list= driver.findElements(locator);
		list.stream().forEach(e-> System.out.println(e.getText()));	
	}
	public static List<String> getHeaderList(By locator) {
		List<WebElement> list = driver.findElements(locator);
		return list.stream().map(e -> e.getText()).collect(Collectors.toList());
	}
}
