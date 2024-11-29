package seleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

	public static void main(String[] args) {

		WebDriver driver= null ;
		String browser = "chrome";
		
		switch (browser.trim().toLowerCase())
		{
		case "chrome":
		driver = new ChromeDriver();
		break;
		case "firefox":
		driver = new FirefoxDriver();
		break;
		case "edge":
		driver = new EdgeDriver();
		break;

		default:
			System.out.println("plz pass valid browser");
			throw new BrowserException("===INVALID BROWSER===");
			
		}
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
