package system.popup;

import application.page_library.HomePage;
import application.page_library.SearchResultsPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDismissPopup extends BasePage {

    @Test (groups = {"smoke"})
    public void testDismissPopup() {

        HomePage homePage = new HomePage();
        homePage.clickPopupCloseButton();
        SearchResultsPage searchResultsPage = homePage.doSearch("rings");

        Assert.assertEquals(searchResultsPage.getSearchResultTitle(), "The huge assortment of rings," +
                " handcrafted by experts at Angara, is sure to leave you spoilt for choice. From classic to " +
                "contemporary and minimalistic to elaborate, there's a ring for every personality, style and budget. Have you explored the collection yet?");

    }
}
