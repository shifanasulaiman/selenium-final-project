package testscript;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import constants.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base
{
	  @DataProvider(name= "credentials")
	  public Object[][] testData(){
		  Object[][] input= new Object[2][2];
		  input[0][0] = "admin";
		  input[0][1] ="admin";
		  input[1][0] ="admin1234000";
		  input[1][1]="admin";
		return input;
		
		  
	  }
	  @Test(dataProvider ="credentials" )
  public void verify_user_is_able_to_login_valid_credentials(String username, String password) throws IOException 
  {
	 //String username=ExcelUtility.getstringdata(1, 0,"loginpage");
	 //String password=ExcelUtility.getstringdata(1, 1,"loginpage" );
	 LoginPage loginpage=new LoginPage(driver);
	 loginpage.enter_username_field(username);
	 loginpage.enter_password_field(password);
	 loginpage.click_on_signinbutton();
	 boolean is_homePage_loaded=loginpage.is_dashboard_display();
	 Assert.assertTrue(is_homePage_loaded,Constant.ERROR_MESSAGE_FOR_LOGINPAGE);
	 
  }
  @Test
  @Parameters({"username","password"})
  public void verify_user_is_able_to_login_With_valid_username_and_Invalid_password(String username, String password) throws IOException 
  {
	     //String username=ExcelUtility.getstringdata(2,0,"loginpage");
		 //String password=ExcelUtility.getstringdata(2,1,"loginpage");
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enter_username_field(username);
		 loginpage.enter_password_field(password);
		 loginpage.click_on_signinbutton();
		 boolean is_homePage_loaded=loginpage.is_alert_displayed_for_invalidCredentials();
		 Assert.assertTrue(is_homePage_loaded,Constant.ERROR_MESSAGE_FOR_LOGINPAGE);
  }
  @Test(groups = {"smoke"})
  public void verify_user_is_able_to_login_With_Invalid_username_and_valid_password() throws IOException 
  {
	     String username=ExcelUtility.getstringdata(3,0,"loginpage");
		 String password=ExcelUtility.getstringdata(3,1,"loginpage");
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enter_username_field(username);
		 loginpage.enter_password_field(password);
		 loginpage.click_on_signinbutton();
		 boolean is_homePage_loaded=loginpage.is_alert_displayed_for_invalidCredentials();
		 Assert.assertTrue(is_homePage_loaded,Constant.ERROR_MESSAGE_FOR_LOGINPAGE);
  }
  @Test(retryAnalyzer = retry.Retry.class)
  public void verify_user_is_able_to_login_With_Invalid_username_and_Invalid_password() throws IOException 
  {
	     String username=ExcelUtility.getstringdata(4,0,"loginpage");
		 String password=ExcelUtility.getstringdata(4,1,"loginpage");
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.enter_username_field(username);
		 loginpage.enter_password_field(password);
		 loginpage.click_on_signinbutton();
		 boolean is_homePage_loaded=loginpage.is_alert_displayed_for_invalidCredentials();
		 Assert.assertTrue(is_homePage_loaded,Constant.ERROR_MESSAGE_FOR_LOGINPAGE);
  }
  
}
