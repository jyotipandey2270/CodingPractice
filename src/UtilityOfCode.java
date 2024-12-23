import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UtilityOfCode {
	
WebDriver driver;
	
	public UtilityOfCode(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//button[@onclick='myDesk()']")
	WebElement clickCancel;
	
	
	
	
	public void HandleAlert()
	{
		clickCancel.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}
	public void WaitForElement(WebElement element)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	
	public void WaitForElement(By element)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
		
	}//function overloading and function overriding covered here and construction as well 

}
