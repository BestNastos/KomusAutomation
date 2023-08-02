import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;
import pages.cart.CartPage;
import pages.main.MainPage;
import pages.searchautocomplete.SearchAutoCompletePage;
import сonfiguration.ConfigProperties;

public class AddProductToCartFromAutocompleteTest extends BaseTestClass{
    public static CartPage cartPage;
    public static MainPage mainPage;
    public static SearchAutoCompletePage searchAutoCompletePage;
    public static ConfigProperties configProperties;
    Actions actions;



    @Test
    public void addProductToCartFromAutocompleteTest()  {
        mainPage.clickElement()
                .setTextToSearchField();
        searchAutoCompletePage.moveToElementAndClick(actions, searchAutoCompletePage.buttonToCart);

        searchAutoCompletePage.getProductName();
    }

}

