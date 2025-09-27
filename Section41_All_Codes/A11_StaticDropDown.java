package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class A11_StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); //just Static main name dia hai
		Select dropdown = new Select(Staticdropdown); // main part ##important
		
		dropdown.selectByIndex(2); //to give command
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByContainsVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
