package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23_WindoeHandelConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = driver.getWindowHandles(); //[parentid ;;  childid]
		
		
		Iterator<String> it=windows.iterator();    //importantline
		String Parentid = it.next();  // from outside to parent
		String Childid = it.next();  //  from cparent to child
		
		
		driver.switchTo().window(Childid);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		
		String Email =driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(Parentid);
		
		driver.findElement(By.id("username")).sendKeys(Email);
		
		
		driver.quit();
		/*
		//Practice
		Set<String> windowss =driver.getWindowHandles();
		Iterator<String> itt = windowss.iterator();
		
		String 1st =itt.next();
		String 2nd =itt.next();
		
		driver.switchTo().window(1st);
		
		*/
		
		
		
	}

}
