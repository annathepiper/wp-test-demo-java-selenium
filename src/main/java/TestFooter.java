import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestFooter
 * @author Angela Korra'ti
 *
 * Last updated 4/25/2019
 * This test class tests that the expected items appear in the footer, and that they link to the expected places.
 * This parent class hits the homepage for its testing. It also serves as the parent class for test classes that hit
 * other pages.
 */
public class TestFooter extends BaseTest {
    WPFooter wpFooter;
    String targetUri;

    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        open(wpBaseUri);
        targetUri = wpBaseUri;
        WPHomepage wpHomepage = new WPHomepage();
        wpFooter = wpHomepage.wpFooter;
    }

    /**
     * TestFooterSiteTitleLink
     * Verify that the site title link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSiteTitleLink() {
        wpLogger.info(String.format("Testing the footer site title link on: %s",targetUri));
        wpFooter.siteTitleElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.siteTitleText(), siteTitle,"Site title doesn't have the correct text.");
    }

    /**
     * TestFooterSiteTitleLinkClick
     * Verify that if you click on the site title link, you land on the correct page (the homepage).
     */
    @Test
    public void TestFooterSiteTitleLinkClick() {
        wpLogger.info(String.format("Testing clicking the footer site title link on: %s",targetUri));
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.siteTitleElement().scrollTo().click();
        Assert.assertEquals(url(), menuHomeLink,"Site title link isn't correct.");
    }

    /**
     * TestFooterWPLink
     * Verify that the Wordpress link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterWPLink() {
        wpLogger.info(String.format("Testing the footer WordPress link on: %s",targetUri));
        wpFooter.wordpressElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.wordpressElementText(), footerWPLinkText,
                "WordPress footer link doesn't have correct text.");
    }

    /**
     * TestFooterWPLinkClick
     * Verify that if you click on the Wordpress link, you land on the correct page (wordpress.org).
     */
    @Test
    public void TestFooterWPLinkClick() {
        wpLogger.info(String.format("Testing clicking the footer WordPress link on: %s",targetUri));
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.wordpressElement().scrollTo().click();
        Assert.assertEquals(url(), footerWPLink,"Clicking on Wordpress link doesn't go to expected URL.");
    }

    /**
     * TestFooterSocialFacebookLink
     * Verify that the Facebook link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialFacebookLink() {
        wpLogger.info(String.format("Testing the footer Facebook link on: %s",targetUri));
        wpFooter.socialFacebookElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.socialFacebookText(), footerSocialFacebookText,
                "Facebook link doesn't have correct text.");
    }

    /**
     * TestFooterSocialFacebookLinkClick
     * Verify that if you click on the Facebook link, you land on the correct page (my Facebook account).
     */
    @Test
    public void TestFooterSocialFacebookLinkClick() {
        wpLogger.info(String.format("Testing clicking the footer Facebook link on: %s",targetUri));
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialFacebookElement().scrollTo().click();
        Assert.assertEquals(url(), footerSocialFacebookLink,
                "Clicking on Facebook link doesn't go to expected destination.");
    }

    /**
     * TestFooterSocialTwitterLink
     * Verify that the Twitter link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialTwitterLink() {
        wpLogger.info(String.format("Testing the footer Twitter link on: %s",targetUri));
        wpFooter.socialTwitterElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.socialTwitterText(), footerSocialTwitterText,
                "Twitter link doesn't have correct text.");
    }

    /**
     * TestFooterSocialTwitterLinkClick
     * Verify that if you click on the Twitter link, you land on the correct page (my Twitter account).
     */
    @Test
    public void TestFooterSocialTwitterLinkClick() {
        wpLogger.info(String.format("Testing clicking the footer Twitter link on: %s",targetUri));
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialTwitterElement().scrollTo().click();
        Assert.assertEquals(url(), footerSocialTwitterLink,
                "Clicking on Twitter link doesn't go to correct destination.");
    }

    /**
     * TestFooterSocialGithubLink
     * Verify that the Github link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialGithubLink() {
        wpLogger.info(String.format("Testing the footer Github link on: %s",targetUri));
        wpFooter.socialGithubElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.socialGithubText(), footerSocialGithubText,
                "Github link doesn't have correct text.");
    }

    /**
     * TestFooterSocialGithubLinkClick
     * Verify that if you click on the Github link, you land on the correct page (my Github account).
     */
    @Test
    public void TestFooterSocialGithubLinkClick() {
        wpLogger.info(String.format("Testing clicking the footer Github link on: %s",targetUri));
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialGithubElement().scrollTo().click();
        Assert.assertEquals(url(), footerSocialGithubLink,
                "Clicking on Github link doesn't go to expected destination.");
    }

    /**
     * TestFooterSocialLinkedInLink
     * Verify that the LinkedIn link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialLinkedInLink() {
        wpLogger.info(String.format("Testing the footer LinkedIn link on: %s",targetUri));
        wpFooter.socialLinkedInElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.socialLinkedInText(), footerSocialLinkedInText,
                "LinkedIn link doesn't have correct text.");
    }

    /**
     * TestSocialLinkedInLinkClick
     * Verify that if you click on the LinkedIn link, you land on the correct page (my LinkedIn account).
     */
    @Test
    public void TestSocialLinkedInLinkClick() {
        wpLogger.info(String.format("Testing clicking the footer LinkedIn link on: %s",targetUri));
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialLinkedInElement().scrollTo().click();
        // Can't doublecheck against my LinkedIn account because apparently Selenium triggers an auth wall?
        Assert.assertTrue(url().startsWith("https://www.linkedin.com"));
    }
}
