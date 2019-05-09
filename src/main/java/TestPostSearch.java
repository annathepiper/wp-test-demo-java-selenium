import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

/**
 * TestPostSearch
 * @author Angela Korra'ti
 *
 * Last updated 5/9/2019
 * This test class extends the TestSearch class, and conducts search tests against an example post.
 */
public class TestPostSearch extends TestSearch {
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