import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

/**
 * TestPostSidebar
 * @author Angela Korra'ti
 *
 * Last updated 4/25/2019
 * This class conducts tests against the submenus on a post of the test WordPress site. Inherits its tests from the
 * TestSubmenus class.
 */
public class TestPostSubmenus extends TestSubmenus {

    /**
     * Setup
     * This method opens up a post of the test site so we can do tests on it.
     */
    @BeforeClass
    public void classSetup() {
        open(wpPostUri);
    }
}