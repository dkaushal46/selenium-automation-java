package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A29_Calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String month ="10";
		String date ="23";
		String year ="2025";
		
		String[] expectedList= {month,date,year};
		
		String Date = month+"/"+date+"/"+year;
		
		System.out.println(Date);
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0;i<actualList.size();i++) {
			System.out.println(actualList.get(i).getAttribute("value"));
			
			Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
		
		}
		
		driver.close();
		
	}

}
