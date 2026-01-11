package demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class A01_Day01 {
	
	
	@Test
	public void Demo() {
		System.out.println("Hello");
	}
	
	
	@Test(groups= {"Smoke"})
	public void secondTest() {
		System.out.println("Bye");
	}

	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("(((After Method))) will execute before every test method day 1");
	}	
	
	
	@AfterSuite
	public void AFSuite() {
		System.out.println("(((AfterSuite))) Will be on the endd");//will only run after suit 
	}
	
}
