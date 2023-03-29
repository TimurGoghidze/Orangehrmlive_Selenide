import com.codeborne.selenide.Configuration;
import org.junit.Test;


public class LoginTests extends BaseTest {

    @Test
    public void successLogin() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        dashBoardPage.dashboardPageIsOpen();
    }

    @Test
    public void invalidLogin() {
        Configuration.fastSetValue = true;
        loginPage.enterUsername("vdvd");
        loginPage.enterPassword("vdvd");
        loginPage.clickOnLoginButton();
        loginPage.checkErrorMessage();
    }

    @Test
    public void elementsAreVisible1() {
        loginPage.checkImageLogo();

    }

    @Test
    public void elementsAreVisible2() {
        loginPage.logoIsDisplayed();
        loginPage.logoImageIsCorrect();
        loginPage.credSectionIsDisplayed();
    }

    @Test
    public void forgotYourPasswordLink() {
        loginPage.followTheForgotYourPasswordLink();
        resetPasswordPage.setTitleResetPassword();
        //resetPasswordPage.urlIsCorrect();
        resetPasswordPage.URLisCorrectContainsDesiredPeace();
    }
}
