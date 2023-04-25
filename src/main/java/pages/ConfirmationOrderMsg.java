package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ConfirmationOrderMsg {
    public ConfirmationOrderMsg(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3")
    WebElement successOrderMsg;

    public String confirmMsg() {
        return successOrderMsg.getText().replaceAll("[^a-zA-Z\\s]", "");

    }
}
