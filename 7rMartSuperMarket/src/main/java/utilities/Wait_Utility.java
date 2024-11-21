package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Utility 
{
	public WebDriver driver;
	public void waitforvisibilityofWebElement(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(element));   
	}
	public void waitforElementTobeClickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(element));   
	}
    public boolean waitForTextToBePresent(WebDriver driver,WebElement element,String expectedtext )
    {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(200));
        return wait.until(ExpectedConditions.textToBePresentInElement(element,expectedtext)); 
    }
}




