package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailField;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy (xpath = "//p[text()='Invalid login']")
    public WebElement invalidLoginMessage;

    @FindBy (xpath = "//div[@class='ui fluid large blue submit button']")
    public WebElement logInButton;

    public AuthenticationPage(){

        PageFactory.initElements(driver,this);

    }

    public void inputEmail(String email){

        sendKeysToElement(emailField, email);

    }

    public void inputPassword(String password){

        sendKeysToElement(passwordField, password);

    }

    public void clickLogInButton(){

        clickOnElement(logInButton);

    }

    public HomePage login(String email, String password){

        inputEmail(email);
        inputPassword(password);
        clickLogInButton();

        return new HomePage();

    }

    public String getInvalidLoginMessage(){

        return getTrimmedElementText(invalidLoginMessage);

    }

}
