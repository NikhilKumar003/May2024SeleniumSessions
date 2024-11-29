package seleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseQuitInSessionId {
// session id on drivers 
	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver= new ChromeDriver();
		driver.quit();
//		driver.get("https://www.google.com/");
		driver =new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
	}

}
