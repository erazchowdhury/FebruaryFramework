package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class='d-flex dfsb pb15 short-description p8 ']/p")
    public WebElement searchResultMessage;

    public SearchResultsPage() {

        PageFactory.initElements(driver,this);

    }

    public String getSearchResultTitle(){

        return getTrimmedElementText(searchResultMessage);


    }

}
