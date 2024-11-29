package seleniumTraining;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.cssSelector("input#datepicker")).click();
//		getDate("25");
//		String actMonthYear= driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
//		
//		while(!actMonthYear.equalsIgnoreCase("september 2025")) {
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			actMonthYear= driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
//		}
	
		List<String> ar = new ArrayList<String>();
		ar.add("April");
		ar.add("June");
		ar.add("September");
		ar.add("November");
		ar.addAll(ar);
//		selectDate("29");
		selectFutureDate("September 2025", 31);
		System.out.println(ar);
		String ThirtyDaymonthsList =ar.toString();
	}
	public static void selectFutureDate(String selectMonth, int date) {
		
		if(selectMonth.contains("February") && date> 29) {
			System.out.println("Wrong date is passed for feb month : "+ date);
			return;
		}
		if(selectMonth.contains("April") && date > 30){
			System.out.println("Wrong date is passed for April month :"+ date);
			return;
		}
		if(selectMonth.contains("June") && date > 30){
			System.out.println("Wrong date is passed for September month :"+ date);
			return;
		}
		if(selectMonth.contains("September") && date > 30){
			System.out.println("Wrong date is passed for April month :"+ date);
			return;
		}
		if(selectMonth.contains("November") && date > 30){
			System.out.println("Wrong date is passed for April month :"+ date);
			return;
		}
		
//		need to add validation for leap year
//		for 30 days of month April, June, September, November
//		if(selectMonth.contains("February") && date> 29 && Year.isLeap(2025)) {
//			System.out.println("Wrong date is passed for feb month : "+ date);
//			return;
//		}
		
		if(date>31) {
			System.out.println("Wrong day is passed ---plz pass the correct date : "+ date);
			return;
		}
		if(date <=0 ) {
			System.out.println("Wrong day is passed ---plz pass the correct date : "+ date);
			return;
		}
		
		
	String actMonthYear= driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		
		while(!actMonthYear.equalsIgnoreCase(selectMonth)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonthYear= driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		}
		selectDate(date);
	}
	
	public static void selectPreviouseDate(String selectMonth, int date) {
		String actMonthYear= driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
			
			while(!actMonthYear.equalsIgnoreCase(selectMonth)) {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
				actMonthYear= driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
			}
			selectDate(date);
		}
	
	public static void selectDate(int date) {
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
	}

}
