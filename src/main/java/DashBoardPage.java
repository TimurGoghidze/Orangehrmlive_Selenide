
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class DashBoardPage {
    private SelenideElement sideBar = $(byCssSelector("[role='navigation']"));

    public void dashboardPageIsOpen() {
        sideBar.shouldBe(visible, Duration.ofSeconds(5)); //или так, эти 2 строки словно assert
        // $(byCssSelector("[class='oxd-navbar-nav']")).shouldBe(Condition.visible, Duration.ofSeconds(10)); //default 4 seconds
    }
}