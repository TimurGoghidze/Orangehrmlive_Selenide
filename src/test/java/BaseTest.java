import org.junit.After;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    @After
    public void tearDown() {
        closeWebDriver();
    }
}
