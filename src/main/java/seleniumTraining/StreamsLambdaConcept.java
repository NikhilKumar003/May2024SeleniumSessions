package seleniumTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamsLambdaConcept {

	public static void main(String[] args) {	

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		List <String> flipKartList = new ArrayList<String>();
		
//		list.stream().forEach(e -> System.out.println(e.getText()));
//		list.stream().filter(e -> !e.getText().isEmpty())
//		.forEach(e -> System.out.println(e.getText()));
		
//		list.stream().filter(e -> !e.getText().isEmpty())
//		.filter(e -> e.getText().startsWith("Flipkart"))
//		.forEach(e -> System.out.println(e.getText()));
//		
//		list.stream()
//		 .filter(e -> !e.getText().isEmpty())
//		   .filter(e -> e.getText().startsWith("Flipkart"))
//		      .forEach(e -> flipKartList.add(e.getText()));
//			System.out.println(flipKartList);
			
		List <WebElement> flipkartElementList =	 list
					.stream()
				.filter(e -> !e.getText().isEmpty())
					.filter(e -> e.getText().startsWith("Flipkart"))
					    .collect(Collectors.toList());
		
		flipkartElementList.forEach(e -> flipKartList.add(e.getText()));
		System.out.println(flipkartElementList);
					     
	}

}
