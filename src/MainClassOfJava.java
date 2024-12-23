import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClassOfJava {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Documents\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		SeleniumAutomationHomePage homeObject = new SeleniumAutomationHomePage(driver);
		homeObject.ApplicationGoTo();
		homeObject.HandleAlertt();
		homeObject.HandleAlert();
		homeObject.WaitForElementTocaptureSS();
		
		//hello world
		AlertDismissAction AlertDismissAction= new AlertDismissAction(driver);
		AlertDismissAction.DoDismissAlert();
		
		AlertDismissAction.WaitForElementToDisplayAllItems();
		
		PromtAlertClass prompt = new PromtAlertClass(driver);
		prompt.HandleAlert();
		
		driver.quit();

	}

}
