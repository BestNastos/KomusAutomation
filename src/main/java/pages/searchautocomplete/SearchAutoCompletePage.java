package pages.searchautocomplete;

import org.openqa.selenium.support.PageFactory;
import pages.main.MainPage;
import сonfiguration.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchAutoCompletePage {
    private final WebDriver driver;
    private final Actions actions;
    MainPage mainPage;

    public SearchAutoCompletePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(Long
//                .parseLong(ConfigProperties
//                        .getProperty("login.page.time_out"))));
    }


    @FindBy(xpath = "//button[contains(@class, 'autocomplete-card__btn')]")
    public WebElement buttonToCart;

    @FindBy(xpath = "//*[@id=\"ui-id-231\"]/button")
    private WebElement buttonInCart;


    public void clickButtonElement(){
        mainPage.clickElements(buttonToCart);
    }

    public void moveToElementAndClick(Actions actions, WebElement element){
        actions.moveToElement(element).click().build().perform();
    }

    public String getProductName(){
        return buttonInCart.getText();
    }

    String autoCompleteProductNameLast = getProductName();

    public String getChangeButtonText(){
        return buttonToCart.getText();
    }

    String autoCompleteProductName = getProductName();

}
