package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {
    @FindBy(how = How.LINK_TEXT, using="contact us")
    public static WebElement contact_us;
















    public void click_contact_us(){

        contact_us.click();
    }




}
