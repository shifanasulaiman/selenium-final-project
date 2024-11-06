package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomePagetest extends Base
{
  @Test
  public void verify_user_is_able_to_logout() throws IOException 
  {
		 String username=ExcelUtility.getstringdata(1, 0, "loginpage");
		 String password=ExcelUtility.getstringdata(1, 1, "loginpage");
	     LoginPage loginpage=new LoginPage(driver);
		 loginpage.enter_username_field(username);
		 loginpage.enter_password_field(password);
		 loginpage.click_on_signinbutton(); 
		 HomePage homepage=new HomePage(driver);
		 homepage.is_ableto_click_the_admin();
		 homepage.is_ableTo_Logout();
  }
}
