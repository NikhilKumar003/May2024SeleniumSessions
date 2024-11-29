package seleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {

	WebDriver driver;

	public WebDriver initiDriver(String browser) {
		switch (browser.trim().toLowerCase()) {
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
		return driver;
	}

	public void launchUrl(String url) {
		if (url.indexOf("http") != 0|| url.length()==0) {
			throw new BrowserException("===INVALID URL===");
		}
		driver.get(url);
	}
	
	public String getTitle() {
		 return driver.getTitle();
	}
	public String getCurrenturl() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}
