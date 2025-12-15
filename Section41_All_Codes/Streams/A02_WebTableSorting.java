package demo;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class A02_WebTableSorting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		//TO CHECK WHETHER CORRECT SORTING IS THERE
		
		//Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//Capture all webelement into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//Capture test of all web elements into new list(Original list)
		List<String> originalList=   elementList.stream().map(s->s.getText()).toList();
		
		//Sort the list
		List<String> sortedList= originalList.stream().sorted().toList();
		
		//Compare original and sorted
		Assert.assertTrue(originalList.equals(sortedList));
		
		//scan the name column with gettext() ->rice-> print price of rice
		List<String> Price;
		do {
		List<WebElement> Rows = driver.findElements(By.xpath("//tr/td[1]"));
		Price= Rows.stream().filter(s->s.getText().contains("Rice")).
				map(s->getPrice(s)).toList();
		Price.forEach(a->System.out.println(a));
		
		if(Price.size()<1) {
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(Price.size()<1);
		
		
	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
