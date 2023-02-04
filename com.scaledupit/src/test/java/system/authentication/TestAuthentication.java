package system.authentication;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.AuthenticationPage;
import page_library.HomePage;
import page_library.MyAccountPage;

public class TestAuthentication extends BasePage {

    @Test (groups = {"smoke", "authentication"})
    public void testLogin(){

        HomePage homePage = new HomePage();
        AuthenticationPage authenticationPage = homePage.clickMyAccountButton();

        MyAccountPage myAccountPage = authenticationPage.logIn("jadehades12@gmail.com","Eraz1234$");

        Assert.assertEquals(myAccountPage.getAccountName(), "jadehades12");

    }

    @Test (groups = {"smoke", "authentication"}, dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLogin")
    public void testLoginWithDataProvider(String email, String password, String expectedAccountName){

        HomePage homePage = new HomePage();
        AuthenticationPage authenticationPage = homePage.clickMyAccountButton();

        MyAccountPage myAccountPage = authenticationPage.logIn(email,password);

        Assert.assertEquals(myAccountPage.getAccountName(), expectedAccountName);

    }

}
