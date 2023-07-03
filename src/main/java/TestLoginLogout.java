import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static com.codeborne.selenide.Condition.*;


/**
 * TestLoginLogout
 * @author Angela Korra'ti
 * Last updated 7/3/2023
 * This class conducts login and logout testing on the test Wordpress site, using relevant links on the sidebar. I'm
 * doing this testing in its own class vs. in the TestSidebarLinks class, because login and logout is interesting enough
 * to me by itself that I wanted to give it its own class. Also, I didn't want the TestSidebarLinks class to get too
 * large.
 */
public class TestLoginLogout extends BaseTest {
    WPSidebar wpSidebar;
    WPLogin wpLogin;

    // Test user data
    static String testUser;
    static String testPassword;

    // Additional items for login/logout testing
    static String profileUri;

    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        WPHomepage wpHomepage = new WPHomepage();
        wpSidebar = wpHomepage.wpSidebar;
        wpLogin = new WPLogin();

        // Items pertaining to the test user
        testUser = rb.getString("testUser");
        testPassword = rb.getString("testPassword");

        // Additional items for login/logout
        profileUri = rb.getString("profileUri");
    }

    /**
     * TestLoginLinkClick
     * Verify that clicking on the Log in link takes you to the login page and logs you in successfully.
     */
    @Test
    public void TestLoginLinkClick() {
        open(wpBaseUri);
        wpLogger.info(String.format("Testing clicking the first meta link on %s", wpBaseUri));
        // Have to scroll to the last item in the Recent Comments lists for the meta links to be visible
        wpSidebar.metaLoginLink().scrollTo();

        // Now click on the actual log in link
        wpSidebar.metaLoginLink().click();
        Assert.assertEquals(url(), wpBaseUri + metaLoginUri);
    }

    /**
     * TestLoginPageElements
     * Verify that the login page has the username and password fields and the login button present.
     */
    @Test (dependsOnMethods = {"TestLoginLinkClick"})
    public void TestLoginPageElements() {
        wpLogger.info(String.format("Testing that the login page has appropriate elements present"));
        wpLogin.usernameField().shouldBe(visible);
        wpLogin.passwordField().shouldBe(visible);
        wpLogin.loginButton().shouldBe(visible);
    }

    /**
     * TestLoginButtonClick
     * Verify that clicking on the login button takes you to the profile page
     */
    @Test (dependsOnMethods = {"TestLoginPageElements"})
    public void TestLoginButtonClick() {
        wpLogger.info(String.format("Testing that logging in lands on the profile page"));

        // Fill them the page and do the login
        wpLogin.usernameField().setValue(testUser);
        wpLogin.passwordField().setValue(testPassword);
        wpLogin.loginButton().click();

        // We should now be on the Wordpress profile page which is all that the test user should have access to
        Assert.assertEquals(url(), wpBaseUri + profileUri);
    }
}
