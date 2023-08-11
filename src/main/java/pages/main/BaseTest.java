package pages.main;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import сonfiguration.ConfigProperties;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public void setup() throws WebDriverException {
        //определение пути до драйвера и его настройка
        WebDriverManager.chromedriver().setup();
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfigProperties.getProperty("loginpages"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(alwaysRun = true)
    public void shutDown() {

        driver.close();

    }
}