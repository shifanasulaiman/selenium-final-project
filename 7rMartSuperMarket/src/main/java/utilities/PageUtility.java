package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
	WebDriver driver;
	public PageUtility(WebDriver driver)
	{
		this.driver=driver;
	}
public void selectByvalueofElement(WebElement dropdown,String value)
{
	Select select=new Select(dropdown);
   select.selectByValue(value);
}
}
