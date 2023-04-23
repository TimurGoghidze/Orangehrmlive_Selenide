import org.junit.Test;
import org.junit.experimental.categories.Category;

public class DirectoryTests extends BaseTest {
    @Test
    @Category(Smoke.class)
    public void checkCardInfo() {
        loginPage.successLogin("Admin", "admin123");
        sideBar.searchInputIsDisplayed();
        sideBar.clickOnDirectoryButton();
        directoryPage.clickOnFirstCard();
        directoryPage.nameIsDisplayed();
               // directoryPage.photoIsDisplayed();
    }
}
