import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class ResetPasswordPage {
   // private SelenideElement titleResetPassword = $(byAttribute("class","oxd-text oxd-text--h6 orangehrm-forgot-password-title"));
    private SelenideElement titleResetPassword = $(By.className("orangehrm-forgot-password-title"));
    private SelenideElement resetPasswordButton =$(byCssSelector("[type='submit']"));
    public void setTitleResetPassword() {
        titleResetPassword.shouldBe(visible);
        resetPasswordButton.shouldBe(visible);
    }
    public void urlIsCorrect(){
        WebDriverRunner.getAndCheckWebDriver().getCurrentUrl();  //static class availai
    }
}
