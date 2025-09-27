package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class A18_ASSIGNMENT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.manage().window().maximize();
		// TextBox
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Dikshansh");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Dikshansh@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Dikshansh@123");

		// CheckBox
		driver.findElement(By.id("exampleCheck1")).click();

		// Dropdown
		Select dropdown = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		dropdown.selectByVisibleText("Female");

		// radioButton
		driver.findElement(By.id("inlineRadio2")).click();

		// textbox
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("04122027");

		// button
		driver.findElement(By.className("btn-success")).click();

		// Successful
		// Assert.assertEquals(driver.findElements(By.className("alert alert-success
		// alert-dismissible")), "");

		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText());
		driver.quit();

	}

}
