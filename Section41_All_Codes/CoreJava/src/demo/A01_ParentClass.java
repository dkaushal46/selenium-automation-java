package demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A01_ParentClass {

	public void doThis() {
		System.out.println("I am in parent class");
	}
	
	@BeforeMethod
	public void BeforeRun() {
		System.out.println("I will run first - Before Method from parent class");
	}
	
	@AfterMethod
	public void AfterRun() {
		System.out.println("I will run Last - After Method from parent class");
	}
	
	@Test
	public void Try(){
		System.out.println("Just try to check whether it will work when i run child class (NO)");
	}
}
