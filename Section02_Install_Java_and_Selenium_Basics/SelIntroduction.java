package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		
		//(For chrome)
		WebDriver driver = new ChromeDriver(); 
		
		// (For Edge)
		//WebDriver driver= new EdgeDriver(); 
		
		// (For Firefox)
		//WebDriver driver =  new FirefoxDriver(); 
		
		driver.get("http://www.rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		//driver.close(); // giving error on Edge
	}

}
