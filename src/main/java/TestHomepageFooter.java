import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * TestHomepageFooter
 * @author Angela Korra'ti
 *
 * Last updated 4/25/2019
 * This test class extends the TestFooter class, and conducts footer tests against the homepage.
 */
public class TestHomepageFooter extends TestFooter {
    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        open(wpBaseUri);
        WPHomepage wpHomepage = new WPHomepage();
        super.wpFooter = wpHomepage.wpFooter;
    }
}