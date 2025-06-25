package UITests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinksParallelStream {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
//		co.addArguments("")
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
	
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("no of links"+ links.size());
		
		List<String> urlList = new ArrayList<String>();
		
		for(WebElement e : links) {
			String url = e.getAttribute("href");
			urlList.add(url);
//			checkBrokenUrl(url);
		}
		
		long stTime =System.currentTimeMillis();
		urlList.stream().forEach(e -> checkBrokenUrl(e));
		long endTime =System.currentTimeMillis();
		System.out.println("time diff :"+ (endTime -stTime));
//		driver.quit();
	}
	
	public static void checkBrokenUrl(String Linkurl) {
		try {
			URL u = new URL(Linkurl);
			HttpURLConnection http = (HttpURLConnection) u.openConnection();
			http.setConnectTimeout(5000);
			http.connect();
			if(http.getResponseCode()>=400) {
				System.out.println(Linkurl+ " --->"+ http.getResponseMessage()+ " is a broken link");
			}else {
				System.out.println(Linkurl+ " --->"+ http.getResponseMessage()+ " isn't  a broken link");
			}
		}
		catch(Exception e) {
			
		}
	}

}
