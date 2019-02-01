import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * TestHomepage
 * @author Angela Korra'ti
 *
 * Last updated 2/1/2019
 * This class conducts tests against the homepage of the test Wordpress site.
 */
public class TestHomepage extends BaseTest {

    /**
     * Setup
     * This method opens up the homepage of the test site so we can do tests on it.
     */
    @BeforeClass
    public void classSetup() {
        suiteSetup();
        open(wpBaseUri);
    }

    /**
     * TestHomepageTitle
     * Verify that the homepage title is set to the expected value and is visible.
     */
    @Test
    public void TestHomepageTitle() {
        $(byClassName(siteTitleClass))
                .shouldBe(visible)
                .shouldHave(text(siteTitle));
    }

    /**
     * TestHomepageDescription
     * Verify that the homepage description is set to the expected value and is visible.
     */
    @Test
    public void TestHomepageDescription() {
        $(byClassName(siteDescriptionClass))
                .shouldBe(visible)
                .shouldHave(text(siteDescription));
    }

    /**
     * TestPrimaryMenu
     * Verify that the primary menu exists and is visible.
     */
    @Test
    public void TestPrimaryMenu() {
        $(byId(menuId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestContentArea
     * Verify that the site content area of the page is present and visible.
     */
    @Test
    public void TestContentArea() {
        $(byId(contentId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestPrimaryContentArea
     * Verify that the primary site content area of the page (where the posts go) is present and visible.
     */
    @Test
    public void TestPrimaryContentArea() {
        $(byId(primaryContentId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestSecondaryContentArea
     * Verify that the secondary site content area of the page (where the sidebar goes) is present and visible.
     */
    @Test
    public void TestSecondaryContentArea() {
        $(byId(secondaryContentId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestFooter
     * Verify that the footer area of the page is present and visible.
     */
    @Test
    public void TestFooter() {
        $(byId(footerId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestFooterSocialMenu
     * Verify that the social menu is present and visible.
     */
    @Test
    public void TestFooterSocialMenu() {
        $(byId(footerSocialMenuId))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestFooterSiteInfo
     * Verify that the site info section of the footer is present and visible.
     */
    @Test
    public void TestFooterSiteInfo() {
        $(byClassName(footerSiteInfoClass))
                .should(exist)
                .shouldBe(visible);
    }
}
