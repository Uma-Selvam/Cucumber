package org.pom;

import org.Base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagepom  extends Baseclass{

		public LoginPagepom() {
			PageFactory.initElements(driver,this);
		}
		@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter registered email'])[1]")
		private WebElement username;
		public WebElement getUsername() {
			return username;
		}
		@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter password'])[1]")
		private WebElement password;
		public WebElement getPassword() {
			return password;
		}
		@FindBy(how=How.XPATH,using="//button[contains(text(),'LOGIN')]")
		private WebElement signin;
		public WebElement getSignin() {
			return signin;
		}
		@FindBy(how=How.XPATH,using="(//a[@class='button is-info'])[1]")
		private WebElement workspace;
		public WebElement getWorkspace() {
			return workspace;
		}
		@FindBy(how=How.XPATH,using="//a[contains(text(),'Edit')]")
		private WebElement inputButton;
		public WebElement getInputButton() {
			return inputButton;
		}
		@FindBy(how=How.XPATH,using="//input[@id='fullName']")
		private WebElement textentered;
		public WebElement getTextentered() {
			return textentered;
		}
		@FindBy(how=How.XPATH,using="//a[contains(text(),'Drop-Down')]")
		private WebElement dropDownclick;

		public WebElement getDropDownclick() {
			return dropDownclick;
		}
		@FindBy(how=How.XPATH,using="//select[@id='fruits']")
		private WebElement dropDown;
		public WebElement getDropDown() {
			return dropDown;
		}
		@FindBy(how=How.XPATH,using="//select[@id='country']")
		private WebElement dropdownnext;
		public WebElement getDropdownnext() {
			return dropdownnext;
		}
		@FindBy(how=How.XPATH,using="//select[@id='superheros']")
		private WebElement scrolldown;
		public WebElement getScrolldown() {
			return scrolldown;
		}
		@FindBy(how=How.XPATH,using="(//a[@class='card-footer-item'])[4]")
		private WebElement promptAlret;
		public WebElement getpromptAlret() {
			return promptAlret;
		}
		@FindBy(how=How.XPATH,using="//button[text()='Simple Alert']")
		private WebElement simpleAlert;
		public WebElement getSimpleAlert() {
			return simpleAlert;
		}
		@FindBy(how=How.XPATH,using="//button[text()='Confirm Alert']")
		private WebElement confirmAlert;
		public WebElement getConfirmAlert() {
			return confirmAlert;
		}
			@FindBy(how=How.XPATH,using="//button[@id='prompt']")
			private WebElement confirmAlertusingsendkey;
			public WebElement getConfirmAlertusingsendkey() {
				return confirmAlertusingsendkey;
				
		}	@FindBy(how=How.XPATH,using="//a[text()='Tabs']")
			private WebElement windows;
			public WebElement getWindows() {
				return windows;
			}
			@FindBy(how=How.XPATH,using="//button[@id='multi']")
			private WebElement multiwindowclick;
			public WebElement getMultiwindowclick() {
				return multiwindowclick;
			}
}
