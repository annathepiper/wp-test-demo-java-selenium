import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

/**
 * TestPost
 * @author Angela Korra'ti
 *
 * Last updated 5/9/2019
 * This class conducts tests against the homepage of the test Wordpress site.
 *
 * IMPORTANT NOTES:
 * 1. Some of my test cases here aren't as concise as I'd like, as I discovered that the shouldHave(text()) calls
 * apparently aren't case-sensitive. So I'm adjusting the structure of impacted cases as necessary to account for this.
 * See the TestHomepageDescription test case for an example.
 */
public class TestPost extends BaseTest {
    private WPPost wpPost;

    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeClass
    public void classSetup() {
        suiteSetup();
        open(wpPostUri);
        wpPost = new WPPost();
    }

    /**
     * TestPostSiteTitle
     * Verify that the post site title is set to the expected value and is visible.
     */
    @Test
    public void TestPostSiteTitle() {
        wpPost.siteTitleElement().shouldBe(visible).shouldHave(text(siteTitle));
    }

    /**
     * TestPostDescription
     * Verify that the post site description is set to the expected value and is visible.
     */
    @Test
    public void TestPostSiteDescription() {
        wpPost.siteDescriptionElement().shouldBe(visible);
        String descriptionText = wpPost.siteDescription();
        Assert.assertEquals(descriptionText, siteDescription, "Site description isn't set to the right string.");
    }

    /**
     * TestPostTitle
     * Verify that the post title is set to the expected value and is visible.
     */
    @Test
    public void TestPostTitle() {
        wpPost.postTitleElement().shouldBe(visible).shouldHave(text(postTitle));
    }

    /**
     * TestPrimaryMenu
     * Verify that the primary menu exists and is visible.
     */
    @Test
    public void TestPrimaryMenu() {
        wpPost.wpMenu.menuElement().should(exist).shouldBe(visible);
    }

    /**
     * TestContentArea
     * Verify that the site content area of the post is present and visible.
     */
    @Test
    public void TestContentArea() {
        wpPost.contentAreaElement().should(exist).shouldBe(visible);
    }

    /**
     * TestPrimaryContentArea
     * Verify that the primary site content area of the post is present and visible.
     */
    @Test
    public void TestPrimaryContentArea() {
        wpPost.primaryContentAreaElement().should(exist).shouldBe(visible);
    }

    /**
     * TestSecondaryContentArea
     * Verify that the secondary site content area of the post (where the sidebar goes) is present and visible.
     */
    @Test
    public void TestSecondaryContentArea() {
        wpPost.secondaryContentAreaElement().should(exist).shouldBe(visible);
    }

    /**
     * TestFooter
     * Verify that the footer area of the post is present and visible.
     */
    @Test
    public void TestFooter() {
        wpPost.wpFooter.footerElement().should(exist).shouldBe(visible);
    }

    /**
     * TestFooterSocialMenu
     * Verify that the social menu is present and visible.
     */
    @Test
    public void TestFooterSocialMenu() {
        wpPost.wpFooter.socialMenuElement().should(exist).shouldBe(visible);
    }

    /**
     * TestFooterSiteInfo
     * Verify that the site info section of the footer is present and visible.
     */
    @Test
    public void TestFooterSiteInfo() {
        wpPost.wpFooter.siteInfoElement().should(exist).shouldBe(visible);
    }
}
