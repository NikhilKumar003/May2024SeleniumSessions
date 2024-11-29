package seleniumTraining;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

//		1). valid only for chrome
		ChromeDriver driver0 = new ChromeDriver();
//		2). valid & recomended
		WebDriver driver = new ChromeDriver();
//		3).valid & recomended
		RemoteWebDriver driver1 =new ChromeDriver();
//		4). valid for remote machines
//		WebDriver driver2 =new RemoteWebDriver(remoteAddress, capabilities);
//		5).
//		SearchContext driver3 =new RemoteWebDriver(capabilites);
		
		
	}

}
