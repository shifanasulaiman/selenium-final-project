package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_contactPage 
{
	WebDriver driver;
	public Manage_contactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']") WebElement manage_contactMoreInfo;
	@FindBy(xpath="//i[@class='fas fa-edit']") WebElement actionbutton;
	@FindBy(xpath="//input[@id='phone']") WebElement Phonefield;
	@FindBy(xpath="//input[@id='email']") WebElement emailfield;
	@FindBy(xpath="//textarea[@name='address']") WebElement addressfield;
	@FindBy(xpath="//textarea[@name='del_time']") WebElement delivarytime;
	@FindBy(xpath="//input[@id='del_limit']") WebElement del_chargelmt;
	@FindBy(xpath="//button[@type='submit']") WebElement submitContact;
    public void is_manage_contact_page_is_opened()
    {
    	manage_contactMoreInfo.click();
    }
    public void is_action_button_is_clickable()
    {
    	actionbutton.click();
    }
    public void is_user_able_to_enetr_the_phone_number(String mobilenumber)
    {
    	Phonefield.clear();
    	Phonefield.sendKeys(mobilenumber);
    }
    public void is_user_able_to_enetr_the_email(String emailValue)
    {
    	emailfield.clear();
    	emailfield.sendKeys(emailValue);
    }
    public void is_user_able_to_enetr_the_address(String addressvalue)
    {
    	addressfield.clear();
    	addressfield.sendKeys(addressvalue);
    }
    public void is_user_able_to_enetr_the_delivarytime(String delivarytimeValue)
    {
    	delivarytime.clear();
    	delivarytime.sendKeys(delivarytimeValue);
    }
    public void is_user_able_to_enetr_the_delivarychargeLimit(String delivaryChargeLimit)
    {
    	del_chargelmt.clear();
    	del_chargelmt.sendKeys(delivaryChargeLimit);
    }
    public void is_user_able_to_submit_the_Conatct_information()
    {
     JavascriptExecutor js=(JavascriptExecutor) driver;
  	  js.executeScript("window.scrollBy(0,2000)");
  	  js.executeScript("window.scrollBy(0,-500)");
  	  js.executeScript("arguments[0].click();",submitContact);
  	  submitContact.click();
    }
    
    
}
