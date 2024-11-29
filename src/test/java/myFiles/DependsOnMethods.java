package myFiles;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void loginTest() {
		System.out.println("login test");
		int i= 9/2;
	}
	@Test(dependsOnMethods = "loginTest")
	public void paymentTest() {
		System.out.println("payment test");
	}
	@Test(dependsOnMethods = "paymentTest")
	public void cartTest() {
		System.out.println("cart test");
	}
}
