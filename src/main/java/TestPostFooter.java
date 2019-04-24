import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

/**
 * TestPostFooter
 * @author Angela Korra'ti
 *
 * Last updated 4/24/2019
 * This test class extends the TestFooter class, which tests against the homepage, and conducts the same tests
 * against an example post.
 */

public class TestPostFooter extends TestFooter {
    private WPFooter wpFooter;

    /**
     * Setup
     * This method opens up a target post of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        suiteSetup();
        open(wpPostUri);
        WPPost wpPost = new WPPost();
        wpFooter = wpPost.wpFooter;
    }

    /**
     * TestFooterSiteTitleLink
     * Verify that the site title link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSiteTitleLink() {
        verifySiteTitleLink(wpFooter);
    }

    /**
     * TestFooterSiteTitleLinkClick
     * Verify that if you click on the site title link, you land on the correct page (the homepage).
     */
    @Test
    public void TestFooterSiteTitleLinkClick() {
        verifySiteTitleLinkClick(wpFooter);
    }

    /**
     * TestFooterWPLink
     * Verify that the Wordpress link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterWPLink() {
        verifyWPLink(wpFooter);
    }

    /**
     * TestFooterWPLinkClick
     * Verify that if you click on the Wordpress link, you land on the correct page (wordpress.org).
     */
    @Test
    public void TestFooterWPLinkClick() {
        verifyWPLinkClick(wpFooter);
    }

    /**
     * TestFooterSocialFacebookLink
     * Verify that the Facebook link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialFacebookLink() {
        verifySocialFacebookLink(wpFooter);
    }

    /**
     * TestFooterSocialFacebookLinkClick
     * Verify that if you click on the Facebook link, you land on the correct page (my Facebook account).
     */
    @Test
    public void TestFooterSocialFacebookLinkClick() {
        verifySocialFacebookLinkClick(wpFooter);
    }

    /**
     * TestFooterSocialTwitterLink
     * Verify that the Twitter link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialTwitterLink() {
        verifySocialTwitterLink(wpFooter);
    }

    /**
     * TestFooterSocialTwitterLinkClick
     * Verify that if you click on the Twitter link, you land on the correct page (my Twitter account).
     */
    @Test
    public void TestFooterSocialTwitterLinkClick() {
        verifySocialTwitterLinkClick(wpFooter);
    }

    /**
     * TestFooterSocialGithubLink
     * Verify that the Github link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialGithubLink() {
        verifySocialGithubLink(wpFooter);
    }

    /**
     * TestFooterSocialGithubLinkClick
     * Verify that if you click on the Github link, you land on the correct page (my Github account).
     */
    @Test
    public void TestFooterSocialGithubLinkClick() {
        verifySocialGithubLinkClick(wpFooter);
    }

    /**
     * TestFooterSocialLinkedInLink
     * Verify that the LinkedIn link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialLinkedInLink() {
        verifySocialLinkedInLink(wpFooter);
    }

    /**
     * TestSocialLinkedInLinkClick
     * Verify that if you click on the LinkedIn link, you land on the correct page (my LinkedIn account).
     */
    @Test
    public void TestSocialLinkedInLinkClick() {
        verifySocialLinkedInLinkClick(wpFooter);
    }
}
