package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@class='my-account']")
public WebElement myAccountButton;

    @FindBy (xpath = "//aside[@id='online_shop_wc_products-7']//a[@data-product_id='179']")
    public WebElement addLightShoesButton;

    @FindBy (xpath = "//a[@class='added_to_cart wc-forward']")
    public WebElement viewCartButton;

    public HomePage() {

        PageFactory.initElements(driver,this);

    }

    public AuthenticationPage clickMyAccountButton(){

        clickOnElement(myAccountButton);

        return new AuthenticationPage();

    }

    public void clickOnAddLightShoesButton(){

        clickOnElement(addLightShoesButton);

    }

    public void clickOnViewCartButton(){

        clickOnElement(viewCartButton);

    }

    public ShoppingCartPage addAndViewItemToCart(){

        clickOnAddLightShoesButton();
        clickOnViewCartButton();

        return  new ShoppingCartPage();

    }

}
