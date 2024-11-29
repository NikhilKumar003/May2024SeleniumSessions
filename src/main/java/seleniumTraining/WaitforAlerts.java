package seleniumTraining;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforAlerts {

	static WebDriver driver;
	public static void main(String[] args) {

		BrowserUtils uts = new BrowserUtils();
		driver = uts.initiDriver("chrome");
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alrt = wait.until(ExpectedConditions.alertIsPresent());
		String text = alrt.getText();
		System.out.println(text);
		alrt.accept();
	}

	public static Alert waitforAlertAndSwitch(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return  wait.until(ExpectedConditions.alertIsPresent());
	}
	public static String getAlertText(int timeout) {
		return waitforAlertAndSwitch(timeout).getText();
	}
	public static void acceptAlert(int timeout) {
		waitforAlertAndSwitch(timeout).accept();
	}
	public static void dismissAlert(int timeout) {
		waitforAlertAndSwitch(timeout).dismiss();
	}
	public static void enterValueOnAlert(int timeout, String value) {
		waitforAlertAndSwitch(timeout).sendKeys(value);
	}
}
