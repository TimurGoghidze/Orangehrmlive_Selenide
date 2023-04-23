import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AdminTests extends BaseTest {
    @Test
    @Category(Smoke.class)
    public void allRequiredFieldsAreEmpty() {
        loginPage.successLogin("Admin", "admin123");
        sideBar.searchInputIsDisplayed();
        sideBar.clickOnAdminButton();
        adminPage.clickOnAddButton();
        adminPage.clickOnSaveButton();
        adminPage.requiredFieldErrorMessagesAreDisplayedCorrectly();


    }
}
