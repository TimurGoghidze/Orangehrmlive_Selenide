import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement usernameField = $(byName("username"));
    private SelenideElement passwordField = $(byCssSelector("[name='password']"));
    private SelenideElement loginButton = $(byAttribute("type", "submit"));
    private SelenideElement errorMessage = $(byCssSelector("[class = 'oxd-alert oxd-alert--error']"));


    public void enterUsername(String usernameValue) {
        usernameField.shouldBe(visible); //обеспечиваем явное ожидание
        usernameField.setValue(usernameValue);//получим из тестов
    }

    public void enterPassword(String passwordValue) {
        passwordField.setValue(passwordValue);//получим из тестов
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void checkErrorMessage() {
        errorMessage.shouldHave(text("Invalid credentials"));//чтобы изъять данные текстовые
    }
}
