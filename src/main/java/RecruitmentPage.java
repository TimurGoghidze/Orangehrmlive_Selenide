import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class RecruitmentPage {
    private SelenideElement titleRecruitment = $(By.className("oxd-topbar-header-breadcrumb"));


    public void recruitmentTitleIsDisplayed(){
       titleRecruitment.shouldBe(visible);
       //titleRecruitment.shouldHave(text("Recruitment"));
    }
    public void URLisCorrectContainsViewCandidates() {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(currentUrl.contains("viewCandidates"));
    }


}
