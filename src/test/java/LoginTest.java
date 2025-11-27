import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest extends BaseTest {
    @Test
    public void openProject() {

        $x("//h1[text()='Projects']").shouldBe(Condition.visible);
        $x("//h1[text()='Projects']").
                shouldHave(cssValue("background-color", "rgba(64, 64, 220, 1)"));
    }
}
