package com.opencart.pagelayer;



	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.opencart.testbase.TestBase;

	public class HomePage extends TestBase{
		
		public HomePage(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//a[text()=\"MacBook\"]")
		private WebElement MacBook_link;
		
		@FindBy(xpath="//span[text()=\"My Account\"]")
		private WebElement myaccount_link;
		
		@FindBy(xpath="//a[text()=\"Register\"]")
		private WebElement register_link;
		
		@FindBy(xpath="//a[text()=\"Login\"]")
		private WebElement login_link;
		
		
		
		public void clickonmacbook() {
			
			MacBook_link.click();
			
		}
		
		public void clickonmyaccountlink() {
			myaccount_link.click();
			
		}
		
		public void clickonlinkregisterlink() {
			register_link.click();
			
		}
		
		public void clickonloginlink() {
			
			login_link.click();
		}
		
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

