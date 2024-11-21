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
	//1.admin_search
public void selectByvalueofElement(WebElement dropdown,String value)
{
	Select select=new Select(dropdown);
   select.selectByValue(value);
}
//2.admin_user
public void selectByVisibleTextofElement(WebElement dropdown,String value)
{
	Select select=new Select(dropdown);
	   select.selectByVisibleText(value);
}
//3.sub_category
public void selecttheElementBytheIndexValue(WebElement dropdown,int value)
{
	Select select=new Select(dropdown);
	   select.selectByIndex(value);
}
public void dismissAlert(WebElement alert) 
{
    driver.switchTo().alert().dismiss();
}


}
