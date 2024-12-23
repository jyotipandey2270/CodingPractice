import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PromtAlertClass extends UtilityOfCode{
	
	
WebDriver driver;
	
	public PromtAlertClass(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//button[@onclick='myPromp()']")
	WebElement InputText;
	
	
	
	
	@Override
	public void HandleAlert()
	{
		InputText.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Jyoti");
		driver.switchTo().alert().accept();
	}
	
	
	
	


	
}
