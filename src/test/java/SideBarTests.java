import org.junit.Test;

public class SideBarTests extends BaseTest {

    @Test
    public void allItemsAreDisplayed() {
        loginPage.successLogin("Admin", "admin123");
        sideBar.checkElementsAreVisible();
        sideBar.searchInputIsDisplayed();

    }

    @Test
    public void closeSideBar() {
        loginPage.successLogin("Admin", "admin123");
        sideBar.clickOnSidebar();
        sideBar.checkSideBarRolled();
    }
}
