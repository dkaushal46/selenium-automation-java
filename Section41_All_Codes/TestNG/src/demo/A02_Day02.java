package demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A02_Day02 {
	
	@AfterTest
	public void PostExquisit() {
		System.out.println("(((*AfterTest*))) it will execute last ");

	}
	
	
	
	@Test(groups= {"Smoke"})
	public void Try() {
		System.out.println("Good");

	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("(((*BeforeTest*))) it will execute first ");
		
	}

}
