import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestingOfEcommerse {

	public static void main(String[] args) {
		String[] DesiredItems = {"Backpack","Onesie"};
		int j = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Documents\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> AllProducts = driver.findElements(By.cssSelector(".inventory_item_name"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(AllProducts));
		
		for(int i=0; i<AllProducts.size();i++)
		{
			String[] splitted= AllProducts.get(i).getText().split(" ");
			String formattedname = splitted[2];
			
			
			
		   List itemsNeededList = Arrays.asList(DesiredItems);
		   if(itemsNeededList.contains(formattedname))
		      {
			
			j++;
			driver.findElements(By.cssSelector("button[class*='btn']")).get(i).click();
			
		     }
		   
		   if(j==DesiredItems.length)

			{

			break;

			}
			
	
		}
	}
}

		
		
				
			
			
			
		
	
		



