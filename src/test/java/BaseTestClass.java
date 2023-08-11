import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import сonfiguration.ConfigProperties;
import java.time.Duration;

public class BaseTestClass {

    public WebDriver driver;
//    public static ConfigProperties configProperties;

    @BeforeEach
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

    @AfterEach
    public void shotDown() {

        driver.close();

    }
}