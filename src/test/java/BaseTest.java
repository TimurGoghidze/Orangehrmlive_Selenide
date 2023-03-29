import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public final String BASE_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    LoginPage loginPage = new LoginPage();
    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    @Before
    public void setUp(){
        open(BASE_URL);
        Configuration.fastSetValue = true; // для скорости
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}
