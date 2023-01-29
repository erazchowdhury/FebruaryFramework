package system.authentication;

import application.page_library.AuthenticationPage;
import application.page_library.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test (groups = {"smoke", "authentication"})
    public void testLogin(){

        AuthenticationPage authenticationPage = new AuthenticationPage();

        HomePage homePage = authenticationPage.login("erazchow@gmail.com", "Eraz1234");

        Assert.assertEquals(homePage.getAccountName(), "Eraz Chowdhury");
    }

}
