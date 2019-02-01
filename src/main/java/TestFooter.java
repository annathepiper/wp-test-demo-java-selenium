import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestFooter
 * @author Angela Korra'ti
 *
 * Last updated 2/1/2019
 * This test class tests that the expected items appear in the footer, and that they link to the expected places.
 */
public class TestFooter extends BaseTest {

    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeMethod
    public void methodSetup() {
        suiteSetup();
        open(wpBaseUri);
    }


    /**
     * TestFooterSiteTitleLink
     * Verify that the site title link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSiteTitleLink() {
        $(byXpath(footerSiteTitleXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(siteTitle));
    }

    /**
     * TestFooterSiteTitleLinkClick
     * Verify that if you click on the site title link, you land on the correct page (the homepage).
     */
    @Test
    public void TestFooterSiteTitleLinkClick() {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        $(byXpath(footerSiteTitleXPath)).scrollTo();
        $(byXpath(footerSiteTitleXPath)).click();
        Assert.assertTrue(url().matches(menuHomeLink));
    }

    /**
     * TestFooterWPLink
     * Verify that the Wordpress link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterWPLink() {
        $(byXpath(footerWPLinkXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(footerWPLinkText));
    }

    /**
     * TestFooterWPLinkClick
     * Verify that if you click on the Wordpress link, you land on the correct page (wordpress.org).
     */
    @Test
    public void TestFooterWPLinkClick() {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        $(byXpath(footerWPLinkXPath)).scrollTo();
        $(byXpath(footerWPLinkXPath)).click();
        Assert.assertTrue(url().matches(footerWPLink));
    }

    /**
     * TestFooterSocialFacebookLink
     * Verify that the Facebook link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialFacebookLink() {
        $(byXpath(footerSocialFacebookXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(footerSocialFacebookText));
    }

    /**
     * TestFooterSocialFacebookLinkClick
     * Verify that if you click on the Facebook link, you land on the correct page (my Facebook account).
     */
    @Test
    public void TestFooterSocialFacebookLinkClick() {
        $(byXpath(footerSocialFacebookXPath)).click();
        Assert.assertTrue(url().matches(footerSocialFacebookLink));
    }

    /**
     * TestFooterSocialTwitterLink
     * Verify that the Twitter link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialTwitterLink() {
        $(byXpath(footerSocialTwitterXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(footerSocialTwitterText));
    }

    /**
     * TestFooterSocialTwitterLinkClick
     * Verify that if you click on the Twitter link, you land on the correct page (my Twitter account).
     */
    @Test
    public void TestFooterSocialTwitterLinkClick() {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        $(byXpath(footerSocialTwitterXPath)).scrollTo();
        $(byXpath(footerSocialTwitterXPath)).click();
        Assert.assertTrue(url().matches(footerSocialTwitterLink));
    }

    /**
     * TestFooterSocialGithubLink
     * Verify that the Github link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialGithubLink() {
        $(byXpath(footerSocialGithubXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(footerSocialGithubText));
    }

    /**
     * TestFooterSocialGithubLinkClick
     * Verify that if you click on the Github link, you land on the correct page (my Github account).
     */
    @Test
    public void TestFooterSocialGithubLinkClick() {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        $(byXpath(footerSocialGithubXPath)).scrollTo();
        $(byXpath(footerSocialGithubXPath)).click();
        Assert.assertTrue(url().matches(footerSocialGithubLink));
    }

    /**
     * TestFooterSocialLinkedInLink
     * Verify that the LinkedIn link is present, visible, and has the correct text.
     */
    @Test
    public void TestFooterSocialLinkedInLink() {
        $(byXpath(footerSocialLinkedInXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(footerSocialLinkedInText));
    }

    /**
     * TestFooterSocialLinkedInLinkClick
     * Verify that if you click on the LinkedIn link, you land on the correct page (my LinkedIn account).
     */
    @Test
    public void TestFooterSocialLinkedInLinkClick() {
        // Scrolling to the link is required, otherwise Selenide complains it's not clickable
        $(byXpath(footerSocialLinkedInXPath)).scrollTo();
        $(byXpath(footerSocialLinkedInXPath)).click();
        // Can't doublecheck against my LinkedIn account because apparently Selenium triggers an auth wall?
        Assert.assertTrue(url().startsWith("https://www.linkedin.com"));
    }
}
