package pages.cart;

import сonfiguration.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private final WebDriver driver;
    private final Actions actions;

    public CartPage(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(Long
                .parseLong(ConfigProperties
                        .getProperty("login.page.time_out"))));
    }


    @FindBy(xpath = "//*[@id=\"ui-id-94\"]/button")
    private WebElement productName; // добавить локатор хпаз done
                                    // написать асерт на кнопку в корзину - в корзине,
                                    // асерт на название в блоке и в корзине,
                                    // подумать над выбором товаров по порядку в подсказках done
    public String getProductName(){
        return productName.getText();
    }

    String cartProductName = getProductName();
}
