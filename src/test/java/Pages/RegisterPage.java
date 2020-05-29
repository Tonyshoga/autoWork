package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    @FindBy(how = How.ID, using="SubmitCreate")
    public static WebElement Create_account_button;


    @FindBy(how = How.ID, using="id_gender1")
    public static WebElement male_radio_button;


    @FindBy(how = How.NAME, using="customer_firstname")
    public static WebElement Customer_firstname_label;

    @FindBy(how = How.NAME, using="customer_lastname")
    public static WebElement Customer_lastname_label;

    @FindBy(how = How.ID, using="passwd")
    public static WebElement Customer_password;

    @FindBy(how = How.NAME, using="days")
    public static WebElement dob_day;
    @FindBy(how = How.NAME, using="months")
    public static WebElement dob_month;
    @FindBy(how = How.NAME, using="years")
    public static WebElement dob_year;


    @FindBy(how = How.NAME, using="address1")
    public static WebElement enter_address;


    @FindBy(how = How.NAME, using="city")
    public static WebElement enter_city;

    @FindBy(how = How.NAME, using="id_state")
    public static WebElement enter_state;

    @FindBy(how = How.NAME, using="postcode")
    public static WebElement enter_postcode;

    @FindBy(how = How.NAME, using="id_country")
    public static WebElement enter_country;

    @FindBy(how = How.NAME, using="phone_mobile")
    public static WebElement enter_phone_mobile;


    @FindBy(how = How.ID, using="submitAccount")
    public static WebElement Register_button;






















    public void click_Create_account_button() {
        Create_account_button.click();
    }

    public void click_male_radio_button() {
        male_radio_button.click();
    }

    public void enter_Customer_firstname_label(String firstname) {
        Customer_firstname_label.sendKeys(firstname);
    }

    public void enter_Customer_lastname_label(String lastname ) {
        Customer_lastname_label.sendKeys(lastname );
    }

    public void enter_Customer_password(String password) {
        Customer_password.sendKeys(password);
    }

    public void select_dob_day() {
        new Select(dob_day).selectByValue("8");

    }
    public void click_dob_month() {
        new Select(dob_month).selectByValue("8");

    }

    public void select_dob_year() {
        new Select(dob_year).selectByValue("2017");

    }
    public void enter_address() {
        enter_address.sendKeys("Dallas");
    }
    public void type_enter_city() {
        enter_city.sendKeys("Texas");
    }

    public void enter_state() {
        new Select(enter_state).selectByValue("43");

    }
    public void enter_postcode() {
        enter_postcode.sendKeys("12345");
    }

    public void enter_country() {
        new Select(enter_country).selectByValue("21");

    }

    public void enter_phone_mobile() {

        enter_phone_mobile.sendKeys("07832736456");
    }

    public void click_Register_button() {
        Register_button.click();
    }










}
