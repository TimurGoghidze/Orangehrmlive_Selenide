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
        //WebDriverRunner.getAndCheckWebDriver().getCurrentUrl();  //static class available
        // Получаем текущий URL страницы
        String currentUrl = WebDriverRunner.getAndCheckWebDriver().getCurrentUrl();
//В этом коде используется метод можно getWebDriver() вместо getAndCheckWebDriver(), так как он
// возвращает экземпляр WebDriver без проверки на null, что может быть полезным в некоторых ситуациях.
// Проверяем, что текущий URL соответствует ожидаемому
        if (currentUrl.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode")) {
            System.out.println("Текущий URL соответствует ожидаемому");
        } else {
            System.out.println("Текущий URL не соответствует ожидаемому");
        }

    }
}
