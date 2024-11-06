package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Admin_UserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class Admin_UserTest extends Base
{
  @Test
  public void verify_user_is_able_to_Create_New_user() throws IOException 
  {
	     String username=ExcelUtility.getstringdata(1, 0,"loginpage");
		 String password=ExcelUtility.getstringdata(1, 1,"loginpage");
		 String adminUserName=ExcelUtility.getstringdata(1, 0,"adminuser");
		 String adminPassword=ExcelUtility.getstringdata(1, 1,"adminuser");
		 String usertype=ExcelUtility.getstringdata(1, 2, "adminuser");
	     LoginPage loginpage=new LoginPage(driver);
		 loginpage.enter_username_field(username);
		 loginpage.enter_password_field(password);
		 loginpage.click_on_signinbutton(); 
		 
		 Admin_UserPage adminUserpage=new Admin_UserPage(driver);
		 adminUserpage.isUser_user_is_able_to_clickOn_AdminUserInfo_morelink();
		 adminUserpage.is_user_is_able_to_clickOn_AdminUser_NewButton();
		 adminUserpage.is_admin_able_enter_the_userName(adminUserName);
		 adminUserpage.is_admin_able_enter_the_password(adminPassword);
		 adminUserpage.selectAdmin_userType(usertype);
		 adminUserpage.is_user_able_to_click_the_create_button();
		 boolean isnewUserCreated=adminUserpage.getvalid_confirmationFrom_user_creation();
		 Assert.assertTrue(isnewUserCreated,Constant.ERROR_FOR_ADMIN_USER_CREATION);
  }
}