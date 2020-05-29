package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage {
    @FindBy(how = How.LINK_TEXT, using="Sign out")
    public static WebElement Sign_out;

    @FindBy(how = How.CSS, using="span")
    public static WebElement my_account_name;






    public void click_Sign_out() {

        Sign_out.click();
    }


    public void I_verify_my_account(String user){
        Assert.assertEquals(user,my_account_name.getText());


    }



}


