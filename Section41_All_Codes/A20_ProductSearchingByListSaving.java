package demo;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A20_ProductSearchingByListSaving {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
        String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        
        // Wait for products to load properly
        Thread.sleep(3000);//thread wait
        addItems(driver,itemsNeeded);
        
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        
        driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
        //Explicit Wait
        WebDriverWait w = new WebDriverWait(driver , Duration.ofSeconds(5));
        w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".promoInfo")));
        
        
        System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
        
        driver.quit();

    }
    
    public static void addItems(WebDriver driver, String[] itemsNeeded) {
    	
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        int j=0;
        for (int i = 0; i < products.size(); i++) {
            
            // Example product text → "Brocolli - 1 Kg"
            // Split by "-" so we only take the name part 
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim(); // remove spaces → "Brocolli"
            
            // Convert the array into a List for searching
            List<String> itemsNeededList = Arrays.asList(itemsNeeded); //can be search using array
            
            if (itemsNeededList.contains(formattedName)) {
                
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(j==itemsNeeded.length) {
                	break;
                }
            }
        }
    }
}
