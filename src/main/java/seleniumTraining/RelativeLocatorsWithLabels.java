package seleniumTraining;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RelativeLocatorsWithLabels {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtils br= new BrowserUtils();
		WebDriver driver= br.initiDriver("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		System.out.println(driver.getTitle());
		
//		WebElement text= driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
		
//		driver.findElement(with(By.id("input-email")).below(text)).sendKeys("nikhil@gm.in");
//		WebElement texte= driver.findElement(By.xpath("//label[text()='Password']"));
//		driver.findElement(with(By.id("input-email")).below(text).above(texte)).sendKeys("nikhil@enk.in");
		Thread.sleep(2000);
		By firstName= By.xpath("//label[text()='First Name']");
		By lastName= By.xpath("//label[text()='Last Name']");
		By firstText= By.xpath("//input[@placeholder='First Name']");
		By lastText= By.xpath("//input[@placeholder='Last Name']");
		
		driver.findElement(with(firstText).toRightOf(firstName)).sendKeys("Nikhil");
		driver.findElement(with(lastText).toRightOf(lastName)).sendKeys("Kumar");

	}

}
