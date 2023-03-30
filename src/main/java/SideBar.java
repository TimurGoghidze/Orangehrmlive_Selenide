import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class SideBar {
    private ElementsCollection collection = $$(byCssSelector("[class = 'oxd-main-menu-item-wrapper']"));
    private SelenideElement searchInput = $(By.cssSelector("[placeholder='Search']"));
    private SelenideElement openCloseSidebarButton = $(byCssSelector("[class ='oxd-icon-button oxd-main-menu-button']"));
    private SelenideElement switchSidebar = $(byAttribute("type", "button"));
    private SelenideElement rolledSidebar = $(byClassName("oxd-sidepanel"));

    public void checkElementsAreVisible() {
        for (SelenideElement element :
                collection) {
            element.shouldBe(visible);
        }
        // collection.filterBy(Condition.visible).shouldHave(CollectionCondition.size(11));//на случай если знаем колличество
    }

    public void searchInputIsDisplayed() {
        searchInput.shouldBe(visible);
    }

    public void clickOnSidebar() {
        openCloseSidebarButton.click();


    }
    public void sidebarIsOpen(){
        switchSidebar.shouldBe(visible);
    }

    public void checkSideBarRolled() {
        rolledSidebar.shouldHave(Condition.attributeMatching("class", ".*toggled.*"));}
}
