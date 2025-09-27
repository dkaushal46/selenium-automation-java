package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A12_UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		/*//While Loop
		 int i=1;  // adults will be 5 because 1 pehle se hai
		 while(i<5){
			
			i++;
		} */
		
		
		//For loop
		for(int i=1 ;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.quit();
	}

}
