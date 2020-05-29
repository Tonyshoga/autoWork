package eComms;

import Pages.*;
import base.testbase;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import java.io.IOException;

public class StepDefinations extends testbase {
	@Before
	public  void setup () throws IOException {
		initialize();
	}



	@Given("^I  am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {
		driver.get(CONFIG.getProperty("URL"));
	    driver.manage().window().maximize();
		
	    
	}

	@Given("^I Click on the log in link$")
	public void i_Click_on_the_log_in_link() throws Throwable {
		HomePage homePage = PageFactory.initElements(driver,HomePage.class);
		homePage.click_Sign_in();
	
	}

	@When("^I enter my new email address$")
	public void iEnterMyNewEmailAddress() {
		random = 100 + (int) (Math.random()*((100-1)+1));
		driver.findElement(By.id("email_create")).sendKeys("tony"+random+"tony@aol.com");

	}

	@Given("^I enter password$")
	public void i_enter_password() throws Throwable {
		driver.findElement(By.name("passwd")).sendKeys("password1");
	}

	@When("^I click on the login  in button$")
	public void i_click_on_the_login_in_button() throws Throwable {
		SignInpage signInpage = PageFactory.initElements(driver,SignInpage.class);
		signInpage.click_Login_button();


	}


	@Then("^I verify that \"([^\"]*)\"  logged in successfully$")
	public void iVerifyThatLoggedInSuccessfully(String user) throws Throwable {
		MyAccountPage myAccountPage = PageFactory.initElements(driver,MyAccountPage.class);
		myAccountPage.I_verify_my_account(user);


//		Assert.assertEquals(user,driver.findElement(By.cssSelector("span")).getText());
	
	}

	@Then("^I sign out successfuly$")
	public void i_sign_out_successfuly() throws Throwable {
		 MyAccountPage myAccountPage = PageFactory.initElements(driver,MyAccountPage.class);
		 myAccountPage.click_Sign_out();


	}

	@Given("^I enter email \"([^\"]*)\"address$")
	public void i_enter_email_address(String email) throws Throwable {
		SignInpage signInpage = PageFactory.initElements(driver,SignInpage.class);
		signInpage.enter_myemail(email);


	}

	@Given("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String password) throws Throwable {
		SignInpage signInpage = PageFactory.initElements(driver,SignInpage.class);
		signInpage.enter_my_password(password);


	}


@When("^I enter my \"([^\"]*)\" adddress$")
public void i_enter_my_adddress(String email) throws Throwable {
    driver.findElement(By.name("email_create")).sendKeys(email);
}



@When("^I click on the crate account button$")
public void i_click_on_the_crate_account_button() throws Throwable {
  RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
  registerPage.click_Create_account_button();

}

    
@When("^I click on the male radio button$")
public void i_click_on_the_male_radio_button() throws Throwable {
	     Thread.sleep(3000);
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.click_male_radio_button();
}


@Then("^I enter \"([^\"]*)\"$")
public void i_enter(String firstname ) throws Throwable {
 RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
 registerPage.enter_Customer_firstname_label(firstname);

}


@Then("^I enter a  \"([^\"]*)\" Lastname$")
public void i_enter_a_Lastname(String lastname ) throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.enter_Customer_lastname_label(lastname);


	}

@Then("^I enter a  \"([^\"]*)\"$")
public void i_enter_a(String password) throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.enter_Customer_password(password);


	}


@Then("^I enter date of birth$")
public void i_enter_date_of_birth() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.select_dob_day();
	registerPage.click_dob_month();
	registerPage.select_dob_year();


	}

@Then("^I enter address$")
public void i_enter_address() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.enter_address();

	}

@Then("^I enter a city$")
public void i_enter_a_city() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.type_enter_city();


	}

@Then("^I enter a state$")
public void i_enter_a_state() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.enter_state();
}

@Then("^I enter a Zip Code$")
public void i_enter_a_Zip_Code() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.enter_postcode();
}

@Then("^I enter a country$")
public void i_enter_a_country() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.enter_country();

}

@Then("^I enter a mobile number$")
public void i_enter_a_mobile_number() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.enter_phone_mobile();
}

@When("^I click the register button$")
public void i_click_the_register_button() throws Throwable {
	RegisterPage registerPage = PageFactory.initElements(driver,RegisterPage.class);
	registerPage.click_Register_button();

	}

	@Then("^I verify that\"([^\"]*)\" is logged in$")
	public void iVerifyThatIsLoggedIn(String user) throws Throwable {
		MyAccountPage myAccountPage = PageFactory.initElements(driver,MyAccountPage.class);
		myAccountPage.I_verify_my_account(user);

	}


@Then("^I  sign out successfully$")
public void i_sign_out_successfully() throws Throwable {
	MyAccountPage myAccountPage = PageFactory.initElements(driver,MyAccountPage.class);
	myAccountPage.click_Sign_out();


}



	@Given("^I click on the contact us link$")
	public void i_click_on_the_contact_us_link() throws Throwable {
		ContactUsPage contactUsPage = PageFactory.initElements(driver,ContactUsPage.class);
		contactUsPage.click_Contact_us_button();
		Thread.sleep(3000);

	}

	@When("^I select the drop down$")
	public void i_select_the_drop_down() throws Throwable {
		ContactUsPage contactUsPage = PageFactory.initElements(driver,ContactUsPage.class);
		contactUsPage.select_drop_down();



	}


	@When("^Enter an email address$")
	public void enter_an_email_address() throws Throwable {
		ContactUsPage contactUsPage = PageFactory.initElements(driver,ContactUsPage.class);
		contactUsPage.enter_email_add();

	}

	@When("^Enter an order number$")
	public void enter_an_order_number() throws Throwable {

		ContactUsPage contactUsPage = PageFactory.initElements(driver,ContactUsPage.class);
		contactUsPage.enter_order_number();


	}

	@When("^I send a message in message box$")
	public void i_send_a_message_in_message_box() throws Throwable {

		ContactUsPage contactUsPage = PageFactory.initElements(driver,ContactUsPage.class);
		contactUsPage.enter_message_box();


	}

	@When("^I upload an attachment$")
	public void i_upload_an_attachment() throws Throwable {
		ContactUsPage contactUsPage = PageFactory.initElements(driver,ContactUsPage.class);
		contactUsPage.click_add_attachment();


		Thread.sleep(3000);

	}

	@Then("^I click on submit$")
	public void i_click_on_submit() throws Throwable {
		ContactUsPage contactUsPage = PageFactory.initElements(driver,ContactUsPage.class);
		contactUsPage.click_Submit_button();

		Thread.sleep(3000);
	}




}
