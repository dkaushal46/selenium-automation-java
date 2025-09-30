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
		
		
		Iterator<String> it=windows.iterator();   
		String Parentid = it.next();  // from outside to parent
		String Childid = it.next();  //  from cparent to child
		
		
		driver.switchTo().window(Childid);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.quit();
	}

}
