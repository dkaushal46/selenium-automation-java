package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class A21_ASSIGNMENT3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		//popup
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		//dropdown
		WebElement Staticdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List<WebElement> addToCarts = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0;i<addToCarts.size();i++) {
			WebElement addToCart =addToCarts.get(i);
			addToCart.click();
			
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		
		driver.findElement(By.className("btn-success")).click();
		
		driver.findElement(By.id("country")).sendKeys("India");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='India']")));
		driver.findElement(By.xpath("//a[text()='India']")).click();
		
		driver.findElement(By.xpath("(//label[@for='checkbox2'])[1]")).click();
		driver.findElement(By.cssSelector(".btn.btn-success.btn-lg")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		driver.quit();
		
	}

}
