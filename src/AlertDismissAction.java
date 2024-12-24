import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertDismissAction extends UtilityOfCode {
	
     WebDriver driver;
	
	public AlertDismissAction(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath= "//div[text()= 'You pressed Cancel!']")
	WebElement Cancelelement;
	
	
	public void DoDismissAlert()
	{
		
		HandleAlert();
	}
	
	public void WaitForElementToDisplayAllItems()
	{
		
		WaitForElement(Cancelelement);
		
	}
	
	public void testing()
	{
		
		System.out.println("Testing1");
		System.out.println("Testing2");
		System.out.println("Testing3");
		System.out.println("Testing4");
		System.out.println("Testing5");
		
	}

}
