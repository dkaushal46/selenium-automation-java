package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A24_ASSIGNMENT4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Set<String> name = driver.getWindowHandles();

		Iterator<String> it = name.iterator();

		String Parent = it.next();
		String Child = it.next();

		driver.switchTo().window(Child);
		System.out.println(driver.findElement(By.className("example")).getText());
		driver.quit();
	}

}
