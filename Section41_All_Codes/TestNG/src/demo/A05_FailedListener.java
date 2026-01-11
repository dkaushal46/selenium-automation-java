package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A05_FailedListener {
	
	@Test
	public void Demo() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
}
