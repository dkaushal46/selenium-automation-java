package demo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class A08_Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name="Rahul";
		
		//WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new EdgeDriver();
		
		WebDriver driver =new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password =getPassword(driver);
		
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(password);
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		
		
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']")).getText());
		
		Assert.assertEquals(driver.findElement(By.xpath("//p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']")).getText(),"You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+ name +",");
		
		driver.findElement(By.className("logout-btn")).click();
		
		Thread.sleep(1000);
		driver.quit();
		
	}
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000); //for 1 second wait
		
		driver.findElement(By.xpath("//div/button[2]")).click(); //searching in xpath using tagname
		
		String PasswordText=driver.findElement(By.cssSelector("form p")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] Passwordarray =PasswordText.split("'"); //Please use temporary password 
		
		String[] Passwordarray2=Passwordarray[1].split("'"); //rahulshettyacademy' to Login.
		
		String Password =Passwordarray2[0];
		
		return Password;}
	
}
