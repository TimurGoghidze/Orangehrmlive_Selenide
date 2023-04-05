import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AdminPage {
    private ElementsCollection requiredFieldErrorMessages = $$(By.className("oxd-input-field-error-message"));
    private SelenideElement sideBar = $(byCssSelector("[type='submit']"));
    private SelenideElement addButton = $(byCssSelector("[class='oxd-icon bi-plus oxd-button-icon']"));
    private SelenideElement saveButton = $(byCssSelector("[type='submit']"));


    public void requiredFieldErrorMessagesAreDisplayedCorrectly() {
        //6
        //visible
        // все содержат текстRequired
        requiredFieldErrorMessages.filterBy(visible).shouldHave(CollectionCondition.size(6));
        for (SelenideElement element : requiredFieldErrorMessages) {
            element.shouldHave(text("Required"));
        }
    }

        public void clickOnAddButton() {
            addButton.click();
        }
        public void clickOnSaveButton() {
            saveButton.click();
        }
    }
