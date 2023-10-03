package org.step;

import java.time.Duration;

import org.Base.Baseclass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.pom.LoginPagepom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepClass extends Baseclass{
	
	
		public static Baseclass b=new Baseclass();

		public static LoginPagepom pom;

		@Given("User should be in Login page")
		public void tc01() {
			b.initializeDriver();
			b.maxWindow();
			b.getUrl("https://letcode.in/signin");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		}
		@When("User should enter the {string} and {string}")
		public void tc03(String user,String pass) throws InterruptedException {
				pom=new LoginPagepom();
				WebElement username = pom.getUsername();
				username.sendKeys(user);
				WebElement password = pom.getPassword();
				password.sendKeys(pass);
		}
		@Then("User should to Click the buttons")
		public void userShouldToClickTheButtons() throws InterruptedException  {
		WebElement signin = pom.getSignin();
				signin.click();
				//s.screenShot("image1");
				Thread.sleep(3000);
		
		}



	}


