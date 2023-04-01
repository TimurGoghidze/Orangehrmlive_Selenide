import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SideBarTests extends BaseTest {

    @Test
    public void allItemsAreDisplayed() {
        loginPage.successLogin("Admin", "admin123");
        sideBar.checkElementsAreVisible();
        sideBar.searchInputIsDisplayed();

    }

    @Test
    @Category(Smoke.class)
    public void closeSideBar() {
        loginPage.successLogin("Admin", "admin123");
        sideBar.clickOnSidebar();
        sideBar.checkSideBarRolled();
    }

    @Test
    public void checkRecruitmentPage(){
        loginPage.successLogin("Admin", "admin123");
        sideBar.clickOnRecruitmentButton();
        recruitmentPage.recruitmentTitleIsDisplayed();
       recruitmentPage.URLisCorrectContainsViewCandidates();
    }
}
