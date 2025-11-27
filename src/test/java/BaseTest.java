import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest {
    @BeforeMethod
    public void setUp() {
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.baseUrl = "http://app.qase.io/";
    }

    @AfterMethod
    public void close() {
        closeWebDriver();
        clearBrowserCache();
    }
}
