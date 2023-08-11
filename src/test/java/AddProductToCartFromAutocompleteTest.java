import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.main.BaseTest;
import pages.main.MainPage;

public class AddProductToCartFromAutocompleteTest extends BaseTest {
    public MainPage mainPage;

    @BeforeMethod(alwaysRun = true)
    public void testRun(){
        mainPage = new MainPage(driver);
    }

    @Test
    public void addProductToCartFromAutocompleteTest()  {
        mainPage.setTextToSearchField("кар")
                .clickSearchButton();
    }

}

