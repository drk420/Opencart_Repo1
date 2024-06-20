package com.opencart.pagelayer;


	

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;

import com.opencart.testbase.TestBase;



	public class MyAccount extends TestBase{

		
		
		public MyAccount (WebDriver driver) {
			
			PageFactory.initElements(driver,this);
			
		}
		
		@FindBy(xpath="//a[@title=\"My Account\"]")
		private WebElement myaccount_dropdown;
		
		
		@FindBy(xpath="(//a[text()=\"Logout\"])[1]")
		private WebElement logout_link;
		
		@FindBy(xpath="//h1[text()=\"Account Logout\"]")
		private WebElement logout_msg;
		
		@FindBy(xpath="(//a[text()=\"Logout\"])[2]")
		private WebElement logout_button;
		@FindBy(xpath="//input[@type=\"text\"]")
		private WebElement search_textbox;
		
		@FindBy(xpath="(//button[@type=\"button\"])[4]")
		private WebElement searchicon_button;
		
		@FindBy(xpath="//a[text()=\"Desktops\"]")
		private WebElement desktop_link;
		@FindBy(xpath="//a[text()=\"Show All Desktops\"]")
		private WebElement ShowAllDesktops_link;
		
		@FindBy(xpath="//a[contains(text(),'Register for an affiliate account')]")
		private WebElement registerforanaffilateaccount_link;
		
		@FindBy(xpath="//body/div[@id='account-account']/div[1]")
		private WebElement accountsuccess_msg;
		@FindBy(xpath="//a[contains(text(),'Edit your affiliate information')]")
		private WebElement editaffilateinformation_link;
		
		
			public void myaccountdropdown() {
				
		
				myaccount_dropdown.click();
				logout_link.click();
				
			}
			
			public void clickonlogoutlink() {
			logout_link.click();
			
		}
		
		public String getlogoutmsg() {
		String logoutmsg	= logout_msg.getText();
		return logoutmsg;
		
		
		
		}
		
		public void clickonlogoutbutton() {
			
			logout_button.click();
			
			
		}
	public void enterdatainsearchtextbox(String productname) {
			
			search_textbox.sendKeys(productname);
			
		}
		
		public void clickonsearchiconbutton() {
			
			searchicon_button.click();
			
		}
		
		public void mouseoverondesktop() {
			
			
			Actions act = new Actions(driver);
			act.moveToElement(desktop_link).perform();
			ShowAllDesktops_link.click();
			
			}
		
		
		public void clickaffilateaccountlink() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			registerforanaffilateaccount_link.click();
			
		}
		public String getaccountsuccess() {
			
			String accountsuccessmsg = accountsuccess_msg.getText();
			return accountsuccessmsg;
		}
		
			public void clickoneditaffilateaccountlink() {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
				editaffilateinformation_link.click();
				
			}
			
		}
		
		
		
		
		
		



