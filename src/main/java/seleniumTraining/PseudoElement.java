package seleniumTraining;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(driver.getTitle());
		
		String script = "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'),'::before')"
				+ ".getPropertyValue('content')";
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String text= js.executeScript(script).toString();
		System.out.println(text);
			if(text.contains("*")) {
				System.out.println("FN is Mandatory");
			}
	}

}
