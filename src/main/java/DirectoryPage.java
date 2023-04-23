import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DirectoryPage {
    private ElementsCollection personalCards = $$(byXpath("//div[@class='orangehrm-corporate-directory']//div[@class='oxd-grid-item oxd-grid-item--gutters']"));
    private SelenideElement nameSelectedCard = $(byXpath("(//div[@class='orangehrm-corporate-directory']//p)[5]"));

    private SelenideElement photoOfCard = $(By.cssSelector("img[src='/web/index.php/pim/viewPhoto/empNumber/2']"));

    public void clickOnFirstCard() {
        personalCards.get(0).shouldBe(visible);
        personalCards.get(0).click();
    }

    public void nameIsDisplayed() {
        nameSelectedCard.shouldBe(visible);
        nameSelectedCard.shouldNotBe(empty);
    }

    public void photoIsDisplayed() {
        photoOfCard.shouldBe(visible);


    }


}
