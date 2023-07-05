import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestFooter
 * @author Angela Korra'ti
 * Last updated 7/4/2023
 * This test class tests that the expected items appear in the footer, and that they link to the expected places.
 * This parent class hits the homepage for its testing. It also serves as the parent class for test classes that hit
 * other pages.
 */
public class TestFooter extends WPFooter {
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
     * Verify that the site title link is present, visible, and has the correct text and destination.
     */
    @Test
    public void TestFooterSiteTitleLink() {
        wpLogger.info(String.format("Testing the footer site title link on: %s",targetUri));

        wpFooter.siteTitleElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.siteTitleText(), siteTitle,"Site title doesn't have the correct text.");

        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.siteTitleElement().scrollTo().click();
        Assert.assertEquals(url(), WPMenu.menuHomeLink,"Site title link isn't correct.");
    }

    /**
     * TestFooterWPLink
     * Verify that the Wordpress link is present, visible, and has the correct text and destination.
     */
    @Test
    public void TestFooterWPLink() {
        wpLogger.info(String.format("Testing the footer WordPress link on: %s",targetUri));
        wpFooter.wordpressElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.wordpressElementText(), footerWPLinkText,
                "WordPress footer link doesn't have correct text.");

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

        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialFacebookElement().scrollTo().click();

        // 7/4/2023 Current behavior is that Facebook demands a login if I click off the
        // footer, so since this is a test run and I assume I am not logged in, I'm checking for the
        // "log in if you want to see this account" link
        String facebookWantsLogin = "https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2Fannathepiper";
        Assert.assertEquals(url(), facebookWantsLogin,
                "Clicking Facebook link doesn't go to expected destination.");
    }

    /**
     * TestFooterSocialTwitterLink
     * Verify that the Twitter link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialMastodonLink() {
        wpLogger.info(String.format("Testing the footer Mastodon link on: %s",targetUri));
        wpFooter.socialMastodonElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpFooter.socialMastodonText(), footerSocialMastodonText,
                "Mastodon link doesn't have correct text.");

        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialMastodonElement().scrollTo().click();
        Assert.assertEquals(url(), footerSocialMastodonLink,
                "Clicking on Mastodon link doesn't go to correct destination.");
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

        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        wpFooter.socialLinkedInElement().scrollTo().click();

        // 7/4/2023 Current behavior of LinkedIn link is that sometimes the link has a referer
        // parameter on the end and sometimes it doesn't, so let's check for both possibilities
        String linkedInRefererSuffix = "?original_referer=http%3A%2F%2Fwordpress.local%2F";
        Assert.assertTrue(url().equals(footerSocialLinkedInLink) ||
                url().equals(footerSocialLinkedInLink + linkedInRefererSuffix),
                "Clicking LinkedIn link doesn't go to expected destination.");
    }
}
