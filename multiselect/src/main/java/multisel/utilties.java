package multisel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class utilties
{
	
	
	public static WebDriver brower(WebDriver driver,String brower) 
	{
		if(brower.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();			
			driver.get("https://demos.telerik.com/kendo-ui/multiselect/index");	
			driver.manage().window().maximize();
			
			
		}
		else if(brower.equals("Firefox"))
		{

			WebDriverManager.firefoxdriver().setup();
			WebDriver driver1=new FirefoxDriver();
			driver1.get("https://demos.telerik.com/kendo-ui/multiselect/index");
			driver1.manage().window().maximize();			
		}
	return driver;
	}
	
	public static WebElement getElement(WebDriver driver,By locator)
	{
		WebElement element=driver.findElement(locator);
		return element;
	}
	
	public static void onClick(WebDriver driver,By locator)
	{
		WebElement test1=getElement(driver, locator);
		test1.click();
	}
	
	
}
