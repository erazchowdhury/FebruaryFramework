package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

@FindBy(xpath = "//a[@class='my-account']")
public WebElement myAccountButton;

    public HomePage() {

        PageFactory.initElements(driver,this);

    }

    public AuthenticationPage clickMyAccountButton(){

        clickOnElement(myAccountButton);

        return new AuthenticationPage();

    }

}
