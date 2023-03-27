import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {

    @Test
    public void successLogin() {
        Configuration.fastSetValue = true; //чтобы быстрее отрабатывало
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//достаточно
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        DashBoardPage dashBoardPage = new DashBoardPage();
        dashBoardPage.dashboardPageIsOpen();
    }
    @Test
    public void invalidLogin() {
        Configuration.fastSetValue = true; //чтобы быстрее отрабатывало
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//достаточно
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("vdvd");
        loginPage.enterPassword("vdvd");
        loginPage.clickOnLoginButton();
        loginPage.checkErrorMessage();
    }
}
