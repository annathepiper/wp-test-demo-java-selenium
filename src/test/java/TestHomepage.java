import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

/**
 * TestHomepage
 * @author Angela Korra'ti
 * Last updated 5/9/2019
 * This class conducts tests against the homepage of the test Wordpress site.
 * IMPORTANT NOTES:
 * 1. Some of my test cases here aren't as concise as I'd like, as I discovered that the shouldHave(text()) calls
 * apparently aren't case-sensitive. So I'm adjusting the structure of impacted cases as necessary to account for this.
 * See the TestHomepageDescription test case for an example.
 */
public class TestHomepage extends BaseTest {
    private WPHomepage wpHomepage;

    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeClass
    public void classSetup() {
        suiteSetup();
        open(wpBaseUri);
        wpHomepage = new WPHomepage();
    }

    /**
     * TestHomepageTitle
     * Verify that the homepage title is set to the expected value and is visible.
     */
    @Test
    public void TestHomepageTitle() {
        wpHomepage.siteTitleElement().shouldBe(visible).shouldHave(text(siteTitle));
    }

    /**
     * TestHomepageDescription
     * Verify that the homepage description is set to the expected value and is visible.
     */
    @Test
    public void TestHomepageDescription() {
        wpHomepage.siteDescriptionElement().shouldBe(visible);
        String descriptionText = wpHomepage.siteDescription();
        Assert.assertEquals(descriptionText, siteDescription, "Site description isn't set to the right string.");
    }

    /**
     * TestPrimaryMenu
     * Verify that the primary menu exists and is visible.
     */
    @Test
    public void TestPrimaryMenu() {
        wpHomepage.wpMenu.menuElement().should(exist).shouldBe(visible);
    }

    /**
     * TestContentArea
     * Verify that the site content area of the page is present and visible.
     */
    @Test
    public void TestContentArea() {
        wpHomepage.contentAreaElement().should(exist).shouldBe(visible);
    }

    /**
     * TestPrimaryContentArea
     * Verify that the primary site content area of the page (where the posts go) is present and visible.
     */
    @Test
    public void TestPrimaryContentArea() {
        wpHomepage.primaryContentAreaElement().should(exist).shouldBe(visible);
    }

    /**
     * TestSecondaryContentArea
     * Verify that the secondary site content area of the page (where the sidebar goes) is present and visible.
     */
    @Test
    public void TestSecondaryContentArea() {
        wpHomepage.secondaryContentAreaElement().should(exist).shouldBe(visible);
    }

    /**
     * TestFooter
     * Verify that the footer area of the page is present and visible.
     */
    @Test
    public void TestFooter() {
        wpHomepage.wpFooter.footerElement().should(exist).shouldBe(visible);
    }

    /**
     * TestFooterSocialMenu
     * Verify that the social menu is present and visible.
     */
    @Test
    public void TestFooterSocialMenu() {
        wpHomepage.wpFooter.socialMenuElement().should(exist).shouldBe(visible);
    }

    /**
     * TestFooterSiteInfo
     * Verify that the site info section of the footer is present and visible.
     */
    @Test
    public void TestFooterSiteInfo() {
        wpHomepage.wpFooter.siteInfoElement().should(exist).shouldBe(visible);
    }
}
