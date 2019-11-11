package multisel;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Multiselection {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=utilties.brower(driver, "chrome");
		Thread.sleep(3000);
		//By cookies=By.linkText("Accept cookies");
		
		By dropdown=By.xpath("//ul[@id='optional_taglist']//following::input[@class='k-input k-readonly']");
		utilties.onClick(driver,dropdown);
		List<WebElement> multiselect=driver.findElements(By.xpath("//ul[@id='optional_listbox']//li[@role='option']"));
		Thread.sleep(3000);
		System.out.println(multiselect.size());
		
		/*String[] name= {"Andrew Suyama","Laura Fuller","Nancy King"};*/
		ArrayList <String> name=new ArrayList <String>();
		name.add("Andrew Suyama");
		name.add("Laura Fuller");
		name.add("Nancy");
		
		
	for(int i=0;i<multiselect.size();i++)
		{
			String value=multiselect.get(i).getText();	
		
			/*if(value.equals("Steven White"))
			{
				multiselect.get(i).click();
				
				System.out.println(value);
			}
			else
			{
				System.out.println("Not selected value");
			}*/
			for(int j=0;j<name.size();j++)
			{
				String name1=name.get(j).toString();			
			if(value.equals(name1))
			{
				multiselect.get(i).click();
			}
			else if (value.equals(name1))
			{
				System.out.println(multiselect);
			}
		}
	}	
		
	
	}
}
