package seleniumTraining;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String title= driver.getTitle();
		System.out.println(title);
		if(title.contains("Amazon")) {
			System.out.println("its valid-- PASS");
		}
		else {
			System.out.println("Its Wrong-- FAIL");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		driver.quit();
	}

	
}
