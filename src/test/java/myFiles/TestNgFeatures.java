package myFiles;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgFeatures {

	@BeforeSuite
	public void connectWithDB() {
		System.out.println(" BS-- connect with DB");
	}
	
	@BeforeTest
	public void CreateUser() {
		System.out.println("BT-- Create user ");
	}
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC-- open the browser");
	}
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM-- login to app");
	}
	@Test(priority=0)
	public void searchUser() {
		System.out.println("T-- search user");	
	}
	@Test(priority=1)
	public void cartPage() {
		System.out.println("T-- go to cart page");
	}
	@Test(priority=2)
	public void paymentPage() {
		System.out.println("T-- go to payment page");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM-- logout");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-- close the browser");
	}
	@AfterTest 
	public void deleteUser(){
		System.out.println("AT-- delete the user");
	}
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS--  disconnect the DB ");
	}
	
}
