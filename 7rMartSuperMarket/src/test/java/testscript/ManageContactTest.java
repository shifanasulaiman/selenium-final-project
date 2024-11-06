package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.Manage_contactPage;
import utilities.ExcelUtility;

public class ManageContactTest  extends Base
{
  @Test
  public void verify_user_able_to_update_the_contact_informatopn() throws IOException 
  {
	  String username=ExcelUtility.getstringdata(1, 0,"loginpage");
		 String password=ExcelUtility.getstringdata(1, 1,"loginpage" );
		 String phone=ExcelUtility.getIntegerdata(1, 0, "contact");
		 String email=ExcelUtility.getstringdata(1, 1, "contact");
		 String address=ExcelUtility.getstringdata(1, 2, "contact");
		 String delivaryTime=ExcelUtility.getstringdata(1, 3, "contact");
		 String delivary_charge=ExcelUtility.getIntegerdata(1,4 , "contact");
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enter_username_field(username);
		 loginpage.enter_password_field(password);
		 loginpage.click_on_signinbutton();
		 Manage_contactPage managecontact=new Manage_contactPage(driver);
		 managecontact.is_manage_contact_page_is_opened();
		 managecontact.is_action_button_is_clickable();
		 managecontact.is_user_able_to_enetr_the_phone_number(phone);
		 managecontact.is_user_able_to_enetr_the_email(email);
		 managecontact.is_user_able_to_enetr_the_address(address);
		 managecontact.is_user_able_to_enetr_the_delivarytime(delivaryTime);
		 managecontact.is_user_able_to_enetr_the_delivarychargeLimit(delivary_charge);
		 managecontact.is_user_able_to_submit_the_Conatct_information();
	  
  }
}
