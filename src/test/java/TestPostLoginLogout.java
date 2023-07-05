import org.testng.annotations.BeforeClass;
import static com.codeborne.selenide.Selenide.open;

public class TestPostLoginLogout extends TestLoginLogout
{
    /**
     * Constructor for the class
     */
    TestPostLoginLogout() {
        // Items pertaining to the test user
        super.testUser = rb.getString("testUser");
        super.testPassword = rb.getString("testPassword");

        // Additional items for login/logout
        super.profileUri = rb.getString("profileUri");
        super.siteNameXPath = rb.getString("siteNameXPath");
    }

    /**
     * Setup
     * This method opens up a post of the test site so we can do tests on it.
     */
    @BeforeClass
    public void classSetup() {
        super.targetUri = wpPostUri;
        open(super.targetUri);
        WPPost wpPost = new WPPost();
        super.wpSidebar = wpPost.wpSidebar;
        super.wpLogin = new WPLogin();
    }
}
