package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GotoMyAddress {

    public GotoMyAddress(WebDriver driver){PageFactory.initElements(driver, this);}

    @FindBy(css ="#footer_account_list > li:nth-child(4) > a")
    WebElement myAddress;

    public void goToMyAddress(){
        myAddress.click();

    }

}
