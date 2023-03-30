import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public final String BASE_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());// для отчёта селенида
        open(BASE_URL);
        Configuration.fastSetValue = true; // для скорости
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }

    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
    SideBar sideBar = new SideBar();
}
