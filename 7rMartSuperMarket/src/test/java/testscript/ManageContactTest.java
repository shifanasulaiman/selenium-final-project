package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.Manage_contactPage;

public class ManageContactTest extends Base {
	HomePage homepage;
	Manage_contactPage managecontact;

	@Test
	@Parameters({ "username", "password", "phone", "email", "address", "delivaryTime", "delivaryCharge" })
	public void verify_user_able_to_update_the_contact_informatopn(String username, String password, String phone,
			String email, String address, String delivaryTime, String delivaryCharge) throws IOException 
	{

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enter_username_field(username);
		loginpage.enter_password_field(password);
		homepage = loginpage.click_on_signinbutton();
		managecontact = homepage.is_manage_contact_page_is_opened();
		managecontact.is_action_button_is_clickable();
		managecontact.is_user_able_to_enetr_the_phone_number(phone);
		managecontact.is_user_able_to_enetr_the_email(email);
		managecontact.is_user_able_to_enetr_the_address(address);
		managecontact.is_user_able_to_enetr_the_delivarytime(delivaryTime);
		managecontact.is_user_able_to_enetr_the_delivarychargeLimit(delivaryCharge);
		managecontact.is_user_able_to_submit_the_Conatct_information();
		boolean waitElementPresent=managecontact.waitfor_Success_Alert();
		Assert.assertTrue(waitElementPresent,Constant.SUCCESMESSAGE);

	}
}
