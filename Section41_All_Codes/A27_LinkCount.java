package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A27_LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. Link Count On page
		// Sol. tag name of links is "a"
		
		//https://chatgpt.com/share/68ed3626-71e0-8012-b917-75610ab6e3e7  explanation
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement Footer = driver.findElement(By.id("gf-BIG"));

		System.out.println(Footer.findElements(By.tagName("a")).size());

		WebElement FirstFooter = Footer.findElement(By.tagName("ul"));
		System.out.println(FirstFooter.findElements(By.tagName("a")).size());

		for (int i = 1; i < FirstFooter.findElements(By.tagName("a")).size(); i++) // for loop
		{

			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER); // for clicking ctrl to open all link in new
																			// tab

			FirstFooter.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);// for clicking each link one
																						// after another

			Thread.sleep(5000);

		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

		driver.quit();

	}

}
