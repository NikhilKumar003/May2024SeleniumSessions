package seleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessAndIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://institute.leo1.in/institute/login");
		System.out.println(driver.getTitle());
		
	}

}
