package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//strong[1]")
    public WebElement accountName;

    public MyAccountPage() {

        PageFactory.initElements(driver,this);

    }

    public String getAccountName(){

       return getTrimmedElementText(accountName);

    }

}
