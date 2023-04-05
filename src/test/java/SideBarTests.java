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
    public void checkRecruitmentPage() {
        loginPage.successLogin("Admin", "admin123");
        sideBar.clickOnRecruitmentButton();
        recruitmentPage.recruitmentTitleIsDisplayed();
        recruitmentPage.URLisCorrectContainsViewCandidates();
    }

    @Test
    public void checkSearchItem() {//ввод Time и проверка что она появилась
        loginPage.successLogin("Admin", "admin123");
        sideBar.searchInputIsDisplayed();
        sideBar.enterValueToSearch("Time");
        sideBar.buttonHasExpectedText("Time");
    }

    @Test
    public void searchInputOneValue() {//ввод Time и проверка что она появилась
        String searchValue = "Time"; //введем
        loginPage.successLogin("Admin", "admin123");
        sideBar.searchInputIsDisplayed();
        sideBar.enterValueToSearch(searchValue);
        sideBar.quantityButtonIsDisplayed();
        sideBar.buttonHasExpectedText(searchValue);
    }

    @Test
    public void searchInvalidButton() {
        loginPage.successLogin("Admin", "admin123");
        sideBar.searchInputIsDisplayed();
        String searchValue = "eee"; //введем
        sideBar.enterValueToSearch(searchValue);
        sideBar.quantityButtonIsNotDisplayed();
    }

    @Test
    public void searchPartText() {
        String searchValue = "re"; //
        loginPage.successLogin("Admin", "admin123");
        sideBar.searchInputIsDisplayed();
        sideBar.enterValueToSearch(searchValue);
        sideBar.searchPartTextCheck();
    }
    @Test
    public void searchPartText2(){
        String searchValue = "re"; //
        loginPage.successLogin("Admin", "admin123");
        sideBar.searchInputIsDisplayed();
        sideBar.enterValueToSearch(searchValue);
        sideBar.quantityOfVisibleButtons(2);
        sideBar.eachCollectionElementHasPartTest(searchValue);


    }
}
