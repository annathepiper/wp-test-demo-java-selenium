import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;

/**
 * TestPostSidebar
 * @author Angela Korra'ti
 *
 * Last updated 4/26/2019
 * This class conducts tests against the sidebar on a post of the test WordPress site. Inherits its tests from the
 * TestSidebar class.
 */
public class TestPostSidebar extends TestSidebar {

    /**
     * Setup
     * This method opens up a post of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        open(wpPostUri);
        super.targetUri = wpPostUri;
        WPPost wpPost = new WPPost();
        super.wpSidebar = wpPost.wpSidebar;
    }
}
