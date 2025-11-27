import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private SelenideElement emeilInput = $("[name=email]");
    private SelenideElement passwordInput = $("[name=password]");
    private SelenideElement loginBtn = $x("//span[text()='Sign in']");

    public void openPage() {
        open("login");
    }

    public void login() {
        emeilInput.setValue("свой емайл");
        passwordInput.sendKeys("свой пароль");
        loginBtn.click();
    }
}
