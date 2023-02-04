package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BasePage {

    @FindBy (xpath = "//tr[@class='woocommerce-cart-form__cart-item cart_item']//*[text()='Light Shoes']")
    public WebElement itemName;

    public ShoppingCartPage() {

        PageFactory.initElements(driver,this);

    }

    public String getItemName(){

        return getTrimmedElementText(itemName);

    }

}
