
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTests extends BaseTest{

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

    @Test
    public void elementsAreVisible1() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.checkImageLogo();

    }

    @Test
    public void elementsAreVisible2() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.logoIsDisplayed();
        loginPage.logoImageIsCorrect();
        loginPage.credSectionIsDisplayed();
    }

    @Test
    public void forgotYourPasswordLink() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        LoginPage loginPage = new LoginPage();
        loginPage.followTheForgotYourPasswordLink();
        ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
        resetPasswordPage.setTitleResetPassword();
        //resetPasswordPage.urlIsCorrect();
        resetPasswordPage.URLisCorrectContainsDesiredPeace();
    }
}
