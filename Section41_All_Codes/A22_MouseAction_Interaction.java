package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A22_MouseAction_Interaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//action class add
		Actions a=new Actions(driver);
		
		//to execute actions(build().perform();)
		
		//Write all in capital(keyDown(Keys.SHIFT))
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		
		//double click to select text(doubleClick())
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		
		//move cursor to element(a.moveToElement)
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//right click (contextClick())
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();

	}

}
