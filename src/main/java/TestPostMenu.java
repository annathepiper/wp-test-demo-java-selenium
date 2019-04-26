import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

/**
 * TestPostMenu
 * @author Angela Korra'ti
 *
 * Last updated 4/25/2019
 * This test class extends the TestMenu class, and conducts menu tests against an example post.
 */
public class TestPostMenu extends TestMenu {
    /**
     * Setup
     * This method opens up an example post of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        open(wpPostUri);
        super.targetUri = wpPostUri;
        WPPost wpPost = new WPPost();
        super.wpMenu = wpPost.wpMenu;
    }
}
