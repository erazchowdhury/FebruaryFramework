package system.shopping_cart;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.ShoppingCartPage;

public class TestShoppingCart extends BasePage {

    @Test (groups = {"smoke", "shopping cart"})
    public void testAddItemToShoppingCart() {

        HomePage homePage = new HomePage();
        ShoppingCartPage shoppingCartPage = homePage.addAndViewItemToCart();

        Assert.assertEquals(shoppingCartPage.getItemName(), "Light Shoes");
    }

}
