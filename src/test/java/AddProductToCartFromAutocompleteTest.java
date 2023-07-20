import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.cart.CartPage;
import pages.main.MainPage;
import pages.searchautocomplete.SearchAutoCompletePage;
import сonfiguration.ConfigProperties;

import java.time.Duration;

public class AddProductToCartFromAutocompleteTest {
    public static CartPage cartPage;
    public static MainPage mainPage;
    public static SearchAutoCompletePage searchAutoCompletePage;
    public static WebDriver driver;
    public static ConfigProperties configProperties;
    Actions actions;

    @BeforeAll
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfigProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfigProperties.getProperty("loginpages"));
    }

    @Test
    public void addProductToCartFromAutocompleteTest() throws InterruptedException {
        mainPage.acceptRegion();
        mainPage.clickElement();
        mainPage.setTextToSearchField();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000L));
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//li[contains(@class, \"autocomplete-card\")][1]")));
        searchAutoCompletePage.moveToElementAndClick(actions, searchAutoCompletePage.buttonToCart);
        String b = searchAutoCompletePage.getProductName();
        System.out.println(b);
    }
    @AfterAll
    public static void shotDown(){
        driver.close();
}
}
