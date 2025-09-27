package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A10_WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://google.com"); //it will wait till page is fully loaded 

		driver.navigate().to("https://rahulshettyacademy.com"); // it will not wait it will just start
		
		driver.navigate().back();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //if found click
		
		Thread.sleep(5000); // wait for 5 exact sec
		
		driver.navigate().forward();
		
		
	}

}
