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

       // Configuration.headless = true;//но браузер не будет открываться
        Configuration.browser = "chrome"; // если хотим сменить браузер а по умолчанию тот что установлен можно вообще без этой строки
        Configuration.fastSetValue = true; // для скорости запуск будет через javascript
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());// для отчёта селенида
        //System.setProperty("chromeoptions.args", "--remote-allow-origins=*"); // на случай если хромдрайвер не идет
        open(BASE_URL);

    }

    @After
    public void tearDown() {
        closeWebDriver();
    }

    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
    SideBar sideBar = new SideBar();
    RecruitmentPage recruitmentPage = new RecruitmentPage();
    AdminPage adminPage = new AdminPage();

}
