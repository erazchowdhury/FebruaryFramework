package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[@class='user-display']")
    public WebElement userDisplay;

    public HomePage(){

        PageFactory.initElements(driver, this);

    }

    public String getAccountName(){

        return getTrimmedElementText(userDisplay);

    }


}
