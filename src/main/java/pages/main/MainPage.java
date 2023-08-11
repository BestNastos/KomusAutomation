package pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.searchautocomplete.SearchAutoCompletePage;
// https://testrail.komus.net/index.php?/cases/view/1912956
// ТОДО
// инициализировать драйвер
// Посмотреть видео
// Прочитать статью

public class MainPage {

    protected WebDriver driver;



    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        }


    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id= 'tippy-2']/div[2]/div[3]/a")
    private WebElement acceptRegion;


    public void clickElements(WebElement element){
        element.click();
    }

    public void setTextToSearchFields(WebElement element){
        element.sendKeys("кар");

    }

    public MainPage clickElement(){
        clickElements(searchInput);
        return this;
    }
    public SearchAutoCompletePage setTextToSearchField(){
        setTextToSearchFields(searchInput);
        return new SearchAutoCompletePage(driver);

    }
}
