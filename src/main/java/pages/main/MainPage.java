package pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// https://testrail.komus.net/index.php?/cases/view/1912956
// ТОДО
// инициализировать драйвер
// Посмотреть видео
// Прочитать статью

public class MainPage extends BasePage{

    public MainPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        }


    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id= 'tippy-2']/div[2]/div[3]/a")
    private WebElement acceptRegion;

    @FindBy(css = ".qa-search-button")
    private WebElement searchButton;


//    public void clickElements(WebElement element){
//        element.click();
//    }

    public MainPage setTextToSearchField(String text){
        searchInput.clear();
        searchInput.sendKeys(text);
        return this;
    }

    public void clickSearchButton(){
        searchButton.click();
    }

//    public MainPage clickElement(){
//        clickElements(searchInput);
//        return this;
//    }
//    public SearchAutoCompletePage setTextToSearchField(){
//        setTextToSearchFields(searchInput);
//        return new SearchAutoCompletePage(driver);
//
//    }
}
