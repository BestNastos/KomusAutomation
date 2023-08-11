package pages.searchautocomplete;

import org.openqa.selenium.support.PageFactory;
import pages.main.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class SearchAutoCompletePage {
    private WebDriver driver;
    MainPage mainPage;

    public SearchAutoCompletePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//button[contains(@class, 'autocomplete-card__btn')]")
    public WebElement buttonToCart;

    @FindBy(xpath = "//*[@id='ui-id-231']/button")
    private WebElement buttonInCart;


//    public void clickButtonElement(){
//        mainPage.clickElements(buttonToCart);
//    }

    public String moveToElementAndClick(){
        Actions actions = new Actions(driver);
        actions.moveToElement(buttonToCart).click();
        return getProductName();
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
