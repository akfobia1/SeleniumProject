package pages;

import com.google.common.primitives.Chars;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChooseASize {
    public ChooseASize(WebDriver driver){
        PageFactory.initElements(driver, this);


    }
    @FindBy(id = "group_1")
    WebElement sizeChoose;
    public void selectSize(String rozmiar){
        Select selectByValue= new Select (sizeChoose) ;
        selectByValue.selectByVisibleText(rozmiar);
       sizeChoose.click();
    }

}
