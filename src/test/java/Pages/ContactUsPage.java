package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
    @FindBy(how = How.LINK_TEXT, using="Contact us")
    public static WebElement Contact_us_button;

    @FindBy(how = How.ID, using="id_contact")
    public static WebElement drop_down;


    @FindBy(how = How.ID, using="email")
    public static WebElement email_add;

    @FindBy(how = How.ID, using="id_order")
    public static WebElement order_number;

    @FindBy(how = How.ID, using="message")
    public static WebElement message_box;


    @FindBy(how = How.ID, using="fileUpload")
    public static WebElement add_attachment;


    @FindBy(how = How.ID, using="submitMessage")
    public static WebElement Submit_button;





    public void click_Contact_us_button() {
        Contact_us_button.click();
    }

    public void select_drop_down() {
        new Select(drop_down).selectByVisibleText("Customer service");

    }

    public void enter_email_add() {
        email_add.sendKeys("tony@test.com");
    }

    public void enter_order_number() {
        order_number.sendKeys("23456");
    }


    public void enter_message_box() {
        message_box.sendKeys("This is a test");
    }

    public void click_add_attachment() {
        add_attachment.sendKeys("C:\\Users\\tonyshugar\\OneDrive\\Documents\\pomxd.txt");
    }



    public void click_Submit_button() {
        Submit_button.click();
    }











}
