import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;

/**
 * TestPostMenu
 * @author Angela Korra'ti
 *
 * Last updated 4/12/2019
 * This test class tests the menu functionality on my test Wordpress site. It does the same tests as TestMenu, only
 * against a post rather than the homepage.
 */
public class TestPostMenu extends TestMenu {

    /**
     * Setup
     * This method opens up an example post of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        suiteSetup();
        open(wpBaseUri);
    }
}
