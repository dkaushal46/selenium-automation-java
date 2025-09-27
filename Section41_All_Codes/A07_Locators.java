package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A07_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // 5 second time till we got message on p.error
		
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul"); //for username
		driver.findElement(By.name("inputPassword")).sendKeys("rahul"); // for password
		
		driver.findElement(By.className("signInBtn")).click(); // for clicking button
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000); //for 1 second wait
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul"); 
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Dishu@cumail.in");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("2737272727");  //searching in xpath using tagname
		
		driver.findElement(By.xpath("//div/button[2]")).click(); //searching in xpath using tagname
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());        //searching in css selector using tagname
		
		driver.findElement(By.xpath("//button[contains(@class,'go-to-login-btn')]")).click(); //xpath using contains
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']")).getText());
		
	}

}
