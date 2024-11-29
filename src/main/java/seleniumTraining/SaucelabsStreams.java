package seleniumTraining;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucelabsStreams {

	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
//	List<WebElement> headerList=driver.findElements(By.cssSelector("div.inventory_item_price"));
//	
//	List<Double> values = headerList.stream()
//			.map(e-> Double.parseDouble(e.getText().substring(1)))
//			   .sorted(Comparator.reverseOrder())
//			     .collect(Collectors.toList());
//		System.out.println(values);
//	
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List <WebElement> scoreList = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		
		Double maxStockPrice = scoreList.stream()
			.map(e-> Double.parseDouble(e.getText()))
				.max(Double :: compareTo)
					.get();
		
		System.out.println(maxStockPrice);
		
	}

	
}
