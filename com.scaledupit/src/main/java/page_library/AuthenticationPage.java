package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {

    @FindBy (id = "username")
    public WebElement usernameField;

    @FindBy (id = "password")
    public WebElement passwordField;

    @FindBy (name = "login")
    public WebElement logInButton;

    public AuthenticationPage() {

        PageFactory.initElements(driver,this);

    }

    public void inputUsername(String username){

        sendKeysToElement(usernameField,username);

    }

    public void inputPassword(String password){

        sendKeysToElement(passwordField,password);

    }

    public void clickLogInButton(){

        clickOnElement(logInButton);

    }

    public MyAccountPage logIn(String email, String password){

        inputUsername(email);
        inputPassword(password);
        clickLogInButton();


        return new MyAccountPage();
    }


}
