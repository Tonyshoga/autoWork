package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInpage {


        @FindBy(how = How.ID, using="email")
        public static WebElement myemail;

        @FindBy(how = How.ID, using="passwd")
         public static WebElement my_password;

       @FindBy(how = How.LINK_TEXT, using="Forgot your password?")
        public static WebElement forgot_password;


       @FindBy(how = How.ID, using="SubmitLogin")
         public static WebElement Login_button;




    public void enter_myemail(String email) {
        myemail.sendKeys(email);
    }

    public void enter_my_password(String password) {

        my_password.sendKeys(password);
        }


    public void click_forgot_password() {
        forgot_password.click();
    }


    public void click_Login_button() {
        Login_button.click();
    }









}

