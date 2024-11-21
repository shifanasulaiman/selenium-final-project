package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Wait_Utility;

public class Manage_contactPage 
{   Wait_Utility wait;
	WebDriver driver;

	public Manage_contactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact'
	// and @class='small-box-footer']") WebElement manage_contactMoreInfo; used in
	// home page
	@FindBy(xpath = "//i[@class='fas fa-edit']")
	WebElement actionbutton;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement Phonefield;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailfield;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement addressfield;
	@FindBy(xpath = "//textarea[@name='del_time']")
	WebElement delivarytime;
	@FindBy(xpath = "//input[@id='del_limit']")
	WebElement del_chargelmt;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitContact;

	/*
	 * public void is_manage_contact_page_is_opened() {
	 * manage_contactMoreInfo.click(); }
	 */
	public Manage_contactPage is_action_button_is_clickable() {
		actionbutton.click();
		return this;
	}

	public Manage_contactPage is_user_able_to_enetr_the_phone_number(String mobilenumber) {
		Phonefield.clear();
		Phonefield.sendKeys(mobilenumber);
		return this;
	}

	public Manage_contactPage is_user_able_to_enetr_the_email(String emailValue) {
		emailfield.clear();
		emailfield.sendKeys(emailValue);
		return this;
	}

	public void is_user_able_to_enetr_the_address(String addressvalue) {
		addressfield.clear();
		addressfield.sendKeys(addressvalue);
	}

	public Manage_contactPage is_user_able_to_enetr_the_delivarytime(String delivarytimeValue) {
		delivarytime.clear();
		delivarytime.sendKeys(delivarytimeValue);
		return this;
	}

	public Manage_contactPage is_user_able_to_enetr_the_delivarychargeLimit(String delivaryChargeLimit) {
		del_chargelmt.clear();
		del_chargelmt.sendKeys(delivaryChargeLimit);
		return this;
	}
	
	public Manage_contactPage is_user_able_to_submit_the_Conatct_information() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		js.executeScript("window.scrollBy(0,-500)");
		js.executeScript("arguments[0].click();", submitContact);
		submitContact.click();
		return this;
	}
	public boolean waitfor_Success_Alert()
	{
		return wait.waitForTextToBePresent(driver, submitContact, "Contact Updated Successfully");
		
	}

}
