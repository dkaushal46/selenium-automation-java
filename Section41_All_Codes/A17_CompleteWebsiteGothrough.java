package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class A17_CompleteWebsiteGothrough {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		//First Dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IXG']")).click(); 
		
		Thread.sleep(2000);
		
		//Second Dropdown
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JLR']")).click();
		
		
		//Calander
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()); //before selected it's not on
		
		
		//driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 0.5")) {
			System.out.println("Not enabled");
		}
		else {
			System.out.println("enabled");
		} 
		
		Assert.assertEquals(true, driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"),"Element is enabled (opacity not 0.5)");
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div'] //a[@class='ui-state-default ui-state-active']")).click();
		
		Assert.assertEquals(true, driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1"),"Element is not enabled (opacity not 1)");
		
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		
				
		// Passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1 ;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		//Currency
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); //just Static main name dia hai
		Select dropdown = new Select(Staticdropdown); // main part ##important
		
		dropdown.selectByIndex(2); //to give command 
		
		System.out.println("Pass"); 
		driver.quit();  
	}

}
