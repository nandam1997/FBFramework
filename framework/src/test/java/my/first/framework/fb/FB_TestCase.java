package my.first.framework.fb;

import org.testng.annotations.Test;

import my.first.framework.fb.pom.FB_POM;
import my.first.framework.fb.testdata.FB_TestData;
import my.first.framework.fb.utility.FB_Utility;

public class FB_TestCase {

	FB_POM fb_pom = new FB_POM();

	@Test
	public void fb_login() {
		
		FB_Utility.getDriver("chrome");
		FB_Utility.load_website(FB_TestData.URL);
		fb_pom.login_verify();
		FB_Utility.tear_down();
		
	}
}
