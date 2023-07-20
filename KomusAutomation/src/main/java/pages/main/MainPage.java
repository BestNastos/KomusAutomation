package pages.main;

import org.openqa.selenium.support.PageFactory;
import сonfiguration.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
// https://testrail.komus.net/index.php?/cases/view/1912956
// ТОДО
// инициализировать драйвер
// Посмотреть видео
// Прочитать статью

public class MainPage {
    private final WebDriver driver;
    private final Actions actions;
    private final WebDriverWait wait;


    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofMillis(Long.parseLong(ConfigProperties.getProperty("login.page.time_out"))));
        }


    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id=\"tippy-2\"]/div[2]/div[3]/a")
    private WebElement acceptRegion;




//    public void setSearchInput(Actions actions, WebElement element){
//        actions.moveToElement(element).click().build().perform();
//        actions.sendKeys("карандаш");
//    }



    public void waitElementShouldBeClick(WebDriverWait wait, WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void acceptRegion() {
        waitElementShouldBeClick(wait, acceptRegion);
        clickElements(acceptRegion);
    }

    public void clickElements(WebElement element){
        element.click();
    }

    public void setTextToSearchFields(WebElement element){
        element.sendKeys("кар");

    }

    public void clickElement(){
        clickElements(searchInput);
    }
    public void setTextToSearchField(){
        setTextToSearchFields(searchInput);

    }
}
