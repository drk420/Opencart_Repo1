package com.opencart.testlayer;


	

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.opencart.pagelayer.HomePage;
	import com.opencart.pagelayer.LoginPage;
import com.opencart.testbase.TestBase;
	

	public class LoginTest extends TestBase{

		
		@Test
		public void verifylogintestwithvalidcredentials() {
			
		String Expected_Result= "My Account";
		HomePage homepage_obj = new HomePage (driver);
		homepage_obj.clickonmyaccountlink();
		homepage_obj.clickonloginlink();
		
		LoginPage loginpage_obj = new LoginPage(driver);
		
		loginpage_obj.enteremailaddresstextbox("kinikardnyaneshwar28@gmail.com");
		loginpage_obj.enterpasswordtextbox("1234");
		loginpage_obj.clickonloginbutton();
		
		String Actual_Result=driver.getTitle();
		System.out.println(Actual_Result);
		Assert.assertEquals(Expected_Result,Actual_Result);
		
		}
		
		@Test
		public void verifylogintestwithinvalidcredentials() {
			
			String Expected_Result= "Warning: No match for E-Mail Address and/or Password.";
			HomePage homepage_obj = new HomePage (driver);
			homepage_obj.clickonmyaccountlink();
			homepage_obj.clickonloginlink();
			
			LoginPage loginpage_obj = new LoginPage(driver);
			
			loginpage_obj.enteremailaddresstextbox("david22@.com");
			loginpage_obj.enterpasswordtextbox("12345");
			loginpage_obj.clickonloginbutton();
			
			String Actual_Result = loginpage_obj.geterrormsg();
			System.out.println(Actual_Result);
			Assert.assertEquals(Actual_Result,Expected_Result);
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}


