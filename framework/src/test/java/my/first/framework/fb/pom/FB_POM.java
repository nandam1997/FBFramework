package my.first.framework.fb.pom;

import my.first.framework.fb.testdata.FB_TestData;
import my.first.framework.fb.utility.FB_Utility;

public class FB_POM {
	public static final String email = "name_email";
	public static final String password = "name_pass";
	public static final String login = "xpath_//*[@name='login']";
	
	
	
	public void login_verify() {
		FB_Utility.get_element(email).sendKeys(FB_TestData.EMAIL);
		FB_Utility.get_element(password).sendKeys(FB_TestData.PASSWORD);
		FB_Utility.get_element(login).click();
		


	}
	

}
