package myFiles;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	int age;

	@Test(invocationCount = 3, priority = Integer.MAX_VALUE)
	public void loginTest() {
		System.out.println("login test");
	}
	
	@Test(invocationCount = 5,priority =Integer.MIN_VALUE)
	public void searchTest() {
		System.out.println("search test");
	}
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void expcetionTest() {
		System.out.println("exception ");
		int i= 9/2;
		
		InvocationCountConcept obj =null;
		obj.age =22;//NPE
	}
}
 