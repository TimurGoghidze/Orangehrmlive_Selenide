import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class SideBar {

    private ElementsCollection collection = $$(byCssSelector("[class = 'oxd-main-menu-item-wrapper']"));
    private SelenideElement searchInput = $(By.cssSelector("[placeholder='Search']"));
    private SelenideElement openCloseSidebarButton = $(byCssSelector("[class ='oxd-icon-button oxd-main-menu-button']"));
    private SelenideElement switchSidebar = $(byAttribute("type", "button"));
    private SelenideElement sideBar = $(byClassName("oxd-sidepanel"));
    private SelenideElement recruitmentButton = $(byAttribute("href", "/web/index.php/recruitment/viewRecruitmentModule"));

    private ElementsCollection sideBarButtons = $$(byClassName("oxd-main-menu-item-wrapper"));
    private SelenideElement timeButton = $(byAttribute("href","/web/index.php/time/viewTimeModule"));
    private SelenideElement AdminButton = $(byCssSelector("[class='oxd-text oxd-text--span oxd-main-menu-item--name']"));

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
        switchSidebar.click();


    }

    public void sidebarIsOpen() {
        switchSidebar.shouldBe(visible);
        //switchSidebar.click(ClickOptions.usingJavaScript()); // сквозь сообщения
    }


    public void sideBarRolled() {
        sideBar.click();
    }

    public void checkSideBarRolled() {
        sideBar.shouldHave(Condition.attributeMatching("class", ".*toggled.*"));
    }

    public void clickOnRecruitmentButton() {
        recruitmentButton.click();
    }

    public void enterValueToSearch(String expectedText) {
                searchInput.setValue(expectedText);

    }
    public void buttonHasExpectedText(String expectedText){
        sideBarButtons.get(0).shouldHave(text(expectedText));
        //timeButton.shouldHave(text(expectedText));
    }
    public void searchInputClick(){
        searchInput.click();
    }



    public void quantityButtonIsDisplayed(){
        sideBarButtons.filterBy(visible).shouldHave(size(1));
    }

    public void quantityButtonIsNotDisplayed(){
        sideBarButtons.filterBy(visible).shouldHave(size(0));
    }

    public void searchPartTextCheck(){
       // sideBar.shouldHave(Condition.attributeMatching("class", ".*re.*"));
        sideBar.shouldHave(partialText("re"));
    }
    public void quantityOfVisibleButtons(Integer expectedQuantity){
        sideBarButtons.shouldHave(size(expectedQuantity));
    }
    public void eachCollectionElementHasPartTest(String expectedText){
        for (SelenideElement button:
        sideBarButtons){
            button.shouldHave((partialText(expectedText)));
        }
    }
    public void clickOnAdminButton(){
        AdminButton.shouldBe(visible);
        AdminButton.click();
    }
}
