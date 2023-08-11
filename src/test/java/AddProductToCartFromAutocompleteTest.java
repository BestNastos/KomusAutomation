import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.cart.CartPage;
import pages.main.MainPage;
import pages.searchautocomplete.SearchAutoCompletePage;
import сonfiguration.ConfigProperties;

public class AddProductToCartFromAutocompleteTest extends BaseTestClass{
    public static MainPage mainPage;
    public static SearchAutoCompletePage searchAutoCompletePage;
    public WebDriver driver;





    @Test
    public void addProductToCartFromAutocompleteTest()  {
        mainPage.clickElement()
                .setTextToSearchField()
                .moveToElementAndClick();


        searchAutoCompletePage.getProductName();
    }

}

