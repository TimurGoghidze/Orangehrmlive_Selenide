import org.junit.Test;

public class AdminTests extends BaseTest {
    @Test
    public void allRequiredFieldsAreEmpty() {
        loginPage.successLogin("Admin", "admin123");
        sideBar.searchInputIsDisplayed();
        sideBar.clickOnAdminButton();
        adminPage.clickOnAddButton();
        adminPage.clickOnSaveButton();
        adminPage.requiredFieldErrorMessagesAreDisplayedCorrectly();


    }
}
