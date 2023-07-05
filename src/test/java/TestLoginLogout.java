import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

/**
 * TestLoginLogout
 * @author Angela Korra'ti
 * Last updated 7/4/2023
 * This class conducts login and logout testing on the test WordPress site, using relevant links on the sidebar. I'm
 * doing this testing in its own class vs. in the TestSidebarLinks class, because login and logout is interesting enough
 * to me by itself that I wanted to give it its own class. Also, I didn't want the TestSidebarLinks class to get too
 * large.
 */
public class TestLoginLogout extends WPSidebar {
    WPSidebar wpSidebar;
    WPLogin wpLogin;

    // Test user data
    static String testUser;
    static String testPassword;

    // Additional items for login/logout testing
    static String profileUri;
    static String siteNameXPath;

    // This is to track what page I'm actually testing against
    static String targetUri;

    /**
     * Constructor for the class
     */
    TestLoginLogout() {
        // Items pertaining to the test user
        testUser = rb.getString("testUser");
        testPassword = rb.getString("testPassword");

        // Additional items for login/logout
        siteNameXPath = rb.getString("siteNameXPath");
    }

    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeClass
    public void classSetup() {
        WPHomepage wpHomepage = new WPHomepage();
        targetUri = wpBaseUri;
        wpSidebar = wpHomepage.wpSidebar;
        wpLogin = new WPLogin();
    }

    /**
     * TestLoginLinkClick
     * Verify that clicking on the Log in link takes you to the login page and logs you in successfully.
     */
    @Test
    public void TestLoginLinkClick() {
        open(targetUri);
        wpLogger.info(String.format("Testing clicking the first meta link on %s", targetUri));
        // Have to scroll to the categories title element for the login link to be visible
        wpSidebar.categoriesTitleElement().scrollTo();
        wpSidebar.metaLoginLink().click();
        Assert.assertEquals(url(), wpLoginUri, "Test did not land on the login page as expected.");
    }

    /**
     * TestLoginPageElements
     * Verify that the login page has the username and password fields and the login button present.
     */
    @Test (dependsOnMethods = {"TestLoginLinkClick"})
    public void TestLoginPageElements() {
        wpLogger.info("Testing that the login page has appropriate elements present");
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
        wpLogger.info("Testing that logging in lands on the profile page");

        // Fill them the page and do the login
        wpLogin.usernameField().setValue(testUser);
        wpLogin.passwordField().setValue(testPassword);
        wpLogin.loginButton().click();

        // We should now be on the WordPress profile page which is all that the test user should have access to
        Assert.assertEquals(url(), wpProfileUri, "Test did not land on the profile page as expected.");
    }

    /**
     * TestReturnToHomepage
     * Verify returning to the homepage from the profile page
     */
    @Test (dependsOnMethods = {"TestLoginButtonClick"})
    public void TestReturnToHomepage() {
        wpLogger.info("Testing that you can return to the homepage from the profile page");
        $(byXpath(siteNameXPath)).click();
        Assert.assertEquals(url(), wpBaseUri);
    }

    /**
     * TestSiteAdminLinkPresent
     * Verify that the Site Admin link is present after logging in
     */
    @Test (dependsOnMethods = {"TestReturnToHomepage"})
    public void TestSiteAdminLinkPresent() {
        wpLogger.info("Testing that the Site Admin link is now present on the homepage sidebar");
        metaSiteAdminLink().should(exist).shouldBe(visible);
    }

    /**
     * TestLogoutLinkPresent
     * Verify that the Log out link is present after logging in
     */
    @Test (dependsOnMethods = {"TestSiteAdminLinkPresent"})
    public void TestLogoutLinkPresent() {
        wpLogger.info("Testing that the Log out link is now present on the homepage sidebar");
        metaLogoutLink().should(exist).shouldBe(visible);
    }

    /**
     * TestLogoutWorks
     * Verify that logging out lands you on the login page
     */
    @Test (dependsOnMethods = {"TestLogoutLinkPresent"})
    public void TestLogoutWorks() {
        wpLogger.info("Testing that logging out returns you to login page");
        metaLogoutLink().scrollTo().click();
        wpLogin.usernameField().shouldBe(visible);
        Assert.assertEquals(url(), wpLoginUri + "?loggedout=true&wp_lang=en_US");
    }

    /**
     * Verify that the Log in link is back when returning to your original page
     */
    @Test (dependsOnMethods = {"TestLogoutWorks"})
    public void TestLoginLinkIsBack() {
        wpLogger.info("Testing that the Log in link is back on the page being tested");
        if (targetUri.equals(wpBaseUri)) {
            wpLogin.loginBackToBlog().click();
        } else {
            open(targetUri);
        }
        Assert.assertEquals(url(), targetUri);
        metaLoginLink().should(exist).shouldBe(visible);
        metaSiteAdminLink().shouldNot(exist);
        metaLogoutLink().shouldNot(exist);
    }
}
