import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)
@Suite.SuiteClasses({LoginTests.class, SideBarTests.class, AdminTests.class, DirectoryTests1.class})
public class RunnerTest extends BaseTest{
}
