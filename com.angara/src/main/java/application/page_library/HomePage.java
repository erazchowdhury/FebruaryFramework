package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy (xpath = "//button[@id='closeIconContainer']")
    public WebElement popupCloseButton;

    @FindBy (id = "attentive_creative")
    public WebElement popupIFrame;

    @FindBy (xpath = "//input[@placeholder='Search']")
    public WebElement searchBar;

    public HomePage() {

        PageFactory.initElements(driver,this);

    }

    public void clickPopupCloseButton(){

        switchToFrameByElement(popupIFrame);
        clickOnElement(popupCloseButton);

    }

    public SearchResultsPage doSearch(String searchTerm){

        sendKeysToElement(searchBar,searchTerm);
        pressEnter();

        return new SearchResultsPage();

    }

}
