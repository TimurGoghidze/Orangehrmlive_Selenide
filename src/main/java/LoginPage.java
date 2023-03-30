import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byName;


public class LoginPage {
    private SelenideElement usernameField = $(byName("username"));
    private SelenideElement passwordField = $(byCssSelector("[name='password']"));
    private SelenideElement loginButton = $(byAttribute("type", "submit"));
    private SelenideElement errorMessage = $(byCssSelector("[class = 'oxd-alert oxd-alert--error']"));
    private SelenideElement topLogoOnLoginPage = $(byAttribute("alt", "company-branding"));
    private SelenideElement infoForLogin = $(byClassName("orangehrm-login-error"));
    private SelenideElement logoBySRC = $(byAttribute("src", "/web/images/ohrm_branding.png?1672659722816"));
    private SelenideElement credSection = $(byClassName("orangehrm-demo-credentials"));
    private SelenideElement forgotYourPasswordButton = $(byClassName("orangehrm-login-forgot"));

    public void enterUsername(String usernameValue) {
        usernameField.shouldBe(visible, Duration.ofSeconds(10)); //обеспечиваем явное ожидание
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

    public void logoIsDisplayed() {
        topLogoOnLoginPage.shouldBe(visible);
    }

    public void logoImageIsCorrect() {
        //  topLogoOnLoginPage.shouldHave(attribute("src", "https://opensource-demo.orangehrmlive.com/web/images/ohrm_branding.png?1672659722816"));
        topLogoOnLoginPage.shouldHave(attributeMatching("src", ".*branding.png.*")); // только по куску нашел типа LIKE % %
    }

    public void checkImageLogo() {
        topLogoOnLoginPage.shouldBe(visible);
        // logoBySRC.shouldBe(visible); //second option
        infoForLogin.shouldBe(Condition.text("Admin"));

    }

    public void credSectionIsDisplayed() {
        credSection.shouldBe(visible);
    }

    public void followTheForgotYourPasswordLink() {
        forgotYourPasswordButton.click();
    }

    public void successLogin(String userNameValue, String passwordValue){
        enterUsername(userNameValue);
        enterPassword(passwordValue);
        clickOnLoginButton();
    }
}
