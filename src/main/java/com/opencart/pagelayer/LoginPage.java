
	package com.opencart.pagelayer;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.opencart.testbase.TestBase;

	

	public class LoginPage extends TestBase {

		
		public LoginPage(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
			
			
		}
		
		@FindBy(xpath="//input[@id=\"input-email\"]")
		private WebElement emailaddress_textbox;
		
		@FindBy(xpath="//input[@id=\"input-password\"]")
		private WebElement password_textbox;
		
		@FindBy(xpath="//input[@value=\"Login\"]")
		private WebElement login_button;
		
		@FindBy(xpath="//body/div[@id='account-login']/div[1]")
		private WebElement loginerror_msg;
		
		
		public void enteremailaddresstextbox(String email) {
			
			emailaddress_textbox.sendKeys(email);
		}
		
		public void enterpasswordtextbox(String password) {
			
			password_textbox.sendKeys(password);
		}
		
		public void clickonloginbutton() {
			
			login_button.click();
			
		}
		public String geterrormsg() {
			
		String errormsg	= loginerror_msg.getText();
		
		return errormsg;
		
		}
		
		
		
		

}
