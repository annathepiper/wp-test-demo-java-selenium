import org.testng.Assert;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestFooter
 * @author Angela Korra'ti
 *
 * Last updated 4/24/2019
 * This test class tests that the expected items appear in the footer, and that they link to the expected places. It
 * serves as the parent class for test classes that hit specific pages.
 */
abstract class TestFooter extends BaseTest {
    abstract void methodSetup();

    /**
     * TestFooterSiteTitleLink
     * Verify that the site title link is present, visible, and has the correct text.
     */
    abstract void TestFooterSiteTitleLink();

    /**
     * TestFooterSiteTitleLinkClick
     * Verify that if you click on the site title link, you land on the correct page (the homepage).
     */
    abstract void TestFooterSiteTitleLinkClick();

    /**
     * TestFooterWPLink
     * Verify that the Wordpress link is present, visible, and has the correct text.
     */
    abstract void TestFooterWPLink();

    /**
     * TestFooterWPLinkClick
     * Verify that if you click on the Wordpress link, you land on the correct page (wordpress.org).
     */
    abstract void TestFooterWPLinkClick();

    /**
     * TestFooterSocialFacebookLink
     * Verify that the Facebook link is present, visible, and has the correct text.
     */
    abstract void TestFooterSocialFacebookLink();

    /**
     * TestFooterSocialFacebookLinkClick
     * Verify that if you click on the Facebook link, you land on the correct page (my Facebook account).
     */
    abstract void TestFooterSocialFacebookLinkClick();

    /**
     * TestFooterSocialTwitterLink
     * Verify that the Twitter link is present, visible, and has the correct text.
     */
    abstract void TestFooterSocialTwitterLink();

    /**
     * TestFooterSocialTwitterLinkClick
     * Verify that if you click on the Twitter link, you land on the correct page (my Twitter account).
     */
    abstract void TestFooterSocialTwitterLinkClick();

    /**
     * TestFooterSocialGithubLink
     * Verify that the Github link is present, visible, and has the correct text.
     */
    abstract void TestFooterSocialGithubLink();

    /**
     * TestFooterSocialGithubLinkClick
     * Verify that if you click on the Github link, you land on the correct page (my Github account).
     */
    abstract void TestFooterSocialGithubLinkClick();

    /**
     * TestFooterSocialLinkedInLink
     * Verify that the LinkedIn link is present, visible, and has the correct text.
     */
    abstract void TestFooterSocialLinkedInLink();

    /**
     * TestSocialLinkedInLinkClick
     * Verify that if you click on the LinkedIn link, you land on the correct page (my LinkedIn account).
     */
    abstract void TestSocialLinkedInLinkClick();

    // HELPER METHODS BEGIN HERE
    void verifySiteTitleLink(WPFooter wpFooter) {
        wpFooter.siteTitleElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.siteTitleText(), siteTitle,"Site title doesn't have the correct text.");
    }

    void verifySiteTitleLinkClick(WPFooter wpFooter) {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.siteTitleElement().scrollTo().click();
        Assert.assertEquals(url(), menuHomeLink,"Site title link isn't correct.");
    }

    void verifyWPLink(WPFooter wpFooter) {
        wpFooter.wordpressElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.wordpressElementText(), footerWPLinkText,
                "WordPress footer link doesn't have correct text.");
    }

    void verifyWPLinkClick(WPFooter wpFooter) {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.wordpressElement().scrollTo().click();
        Assert.assertEquals(url(), footerWPLink,"Clicking on Wordpress link doesn't go to expected URL.");
    }

    void verifySocialFacebookLink(WPFooter wpFooter) {
        wpFooter.socialFacebookElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.socialFacebookText(), footerSocialFacebookText,
                "Facebook link doesn't have correct text.");
    }

    void verifySocialFacebookLinkClick(WPFooter wpFooter) {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialFacebookElement().scrollTo().click();
        Assert.assertEquals(url(), footerSocialFacebookLink,
                "Clicking on Facebook link doesn't go to expected destination.");
    }

    void verifySocialTwitterLink(WPFooter wpFooter) {
        wpFooter.socialTwitterElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.socialTwitterText(), footerSocialTwitterText,
                "Twitter link doesn't have correct text.");
    }

    void verifySocialTwitterLinkClick(WPFooter wpFooter) {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialTwitterElement().scrollTo().click();
        Assert.assertEquals(url(), footerSocialTwitterLink,
                "Clicking on Twitter link doesn't go to correct destination.");
    }

    void verifySocialGithubLink(WPFooter wpFooter) {
        wpFooter.socialGithubElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.socialGithubText(), footerSocialGithubText,
                "Github link doesn't have correct text.");
    }

    void verifySocialGithubLinkClick(WPFooter wpFooter) {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialGithubElement().scrollTo().click();
        Assert.assertEquals(url(), footerSocialGithubLink,
                "Clicking on Github link doesn't go to expected destination.");
    }

    void verifySocialLinkedInLink(WPFooter wpFooter) {
        wpFooter.socialLinkedInElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.socialLinkedInText(), footerSocialLinkedInText,
                "LinkedIn link doesn't have correct text.");
    }

    void verifySocialLinkedInLinkClick(WPFooter wpFooter) {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialLinkedInElement().scrollTo().click();
        // Can't doublecheck against my LinkedIn account because apparently Selenium triggers an auth wall?
        Assert.assertTrue(url().startsWith("https://www.linkedin.com"));
    }
}
