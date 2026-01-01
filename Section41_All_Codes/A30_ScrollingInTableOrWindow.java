package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A30_ScrollingInTableOrWindow {

	public static void main(String[] args) throws InterruptedException {
		
		
		//https://rahulshettyacademy.com/AutomationPractice
		//window.scrollBy(0,400)
		//document.querySelector(".tableFixHead").scrollTop=5000

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(4000);
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		
	}

}
