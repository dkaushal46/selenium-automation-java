package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A14_AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(2000);
		
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());	} //for printing all ind text
		
		
		for(int i=0;i<options.size();i++) {
			WebElement option=options.get(i);
			{
				if(option.getText().equalsIgnoreCase("India")) {
					option.click();
					break;
				}
			}
		} 
		
	}

}