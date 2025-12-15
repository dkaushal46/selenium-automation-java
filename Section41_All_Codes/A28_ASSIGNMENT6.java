package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A28_ASSIGNMENT6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click();
		String Text = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(Text);

		WebElement Dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(Dropdown);
		s.selectByVisibleText(Text);

		driver.findElement(By.id("name")).sendKeys(Text);
		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();
		if (text.contains(Text)) {
			System.out.println("Alert message success");
		} else
			System.out.println("Something wrong with execution");

		driver.quit();
	}

}
