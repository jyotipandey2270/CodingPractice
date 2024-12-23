import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumAutomationHomePage extends UtilityOfCode{
	
	WebDriver driver;
	
	public SeleniumAutomationHomePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//button[@onclick='showAlert()']")
	WebElement clickOk;
	
	By Okelement =  By.xpath("//div[text()= 'You pressed OK!']");
	

 public void ApplicationGoTo()
 {
	
	driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
 }
 
 
 
 public void HandleAlertt()
 {
	clickOk.click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
 }
 @Override
 public void HandleAlert()
	{
		clickCancel.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
 
 public void WaitForElementTocaptureSS()
	{
		
		WaitForElement(Okelement);
		
		
	}


}