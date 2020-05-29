package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {


    @FindBy(how = How.LINK_TEXT, using="Sign in")
    public static WebElement Sign_in;

    @FindBy(how = How.NAME, using="search_query")
    public static WebElement Search_box;

    @FindBy(how = How.NAME, using="submit_search")
    public static WebElement Search_icon;

    @FindBy(how = How.XPATH, using="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")
    public static WebElement Cart;




    public void click_Sign_in(){

        Sign_in.click();
    }

    public void type_Search_box(){

        Search_box.sendKeys();
    }

    public void click_Search_icon(){

        Search_icon.click();
    }

    public void click_Cart(){
        Cart.click();
    }


}
