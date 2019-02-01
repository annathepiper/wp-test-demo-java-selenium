import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestSubmenus
 * @author Angela Korra'ti
 *
 * Last updated 1/31/2019
 * Test class for verifying the submenus on the test site's main menu.
 */
public class TestSubmenus extends BaseTest {

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
     * TestHomeSubmenuNotVisible
     * This method verifies that the submenu underneath Home isn't visible by default.
     */
    @Test
    public void TestHomeSubmenuNotVisible() {
        $(byXpath(submenuHomeXPath))
                .should(exist)
                .shouldNotBe(visible);
    }

    /**
     * TestHomeSubmenuVisibleOnHover
     * This method verifies that if you hover over the Home menu, the submenu should be visible.
     */
    @Test
    public void TestHomeSubmenuVisibleOnHover() {
        $(byXpath(menuHomeXPath)).hover();
        $(byXpath(submenuHomeXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestHomeSubmenuLink
     * This method verifies that the Home menu's submenu has the correct link. Does not require the submenu to be
     * visible to check this.
     */
    @Test
    public void TestHomeSubmenuLink() {
        $(byXpath(submenuHomeXPath))
                .shouldHave(attribute("href", submenuHomeLink));
    }

    /**
     * TestHomeSubmenuLinkClick
     * This test case hovers over the Home menu, and then clicks on the submenu link and verifies you land on the
     * appropriate page (angelahighland.com).
     */
    @Test
    public void TestHomeSubmenuLinkClick() {
        $(byXpath(menuHomeXPath)).hover();
        $(byXpath(submenuHomeXPath)).click();
        Assert.assertTrue(url().matches(submenuHomeLink));
    }

    /**
     * TestBooksSubmenuNotVisible
     * This method verifies that the submenu underneath Books isn't visible by default.
     */
    @Test
    public void TestBooksSubmenuNotVisible() {
        $(byXpath(submenuBooksXPath))
                .should(exist)
                .shouldNotBe(visible);
    }

    /**
     * TestBooksSubmenuVisibleOnHover
     * This method verifies that if you hover over the Books menu, the submenu should be visible.
     */
    @Test
    public void TestBooksSubmenuVisibleOnHover() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuBooksXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestFBSubmenuLink
     * Tests that the first item under the Books menu is the link to the Faerie Blood page.
     */
    @Test
    public void TestFBSubmenuLink() {
        $(byXpath(submenuFBXPath))
                .should(exist)
                .shouldHave(attribute("href", submenuFBLink));
    }

    /**
     * TestFBSubmenuLinkClick
     * Tests that if you hover over the Books menu and then click on the Faerie Blood item, you'll be taken to the
     * correct page.
     */
    @Test
    public void TestFBSubmenuLinkClick() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuFBXPath)).click();
        Assert.assertTrue(url().matches(submenuFBLink));
    }

    /**
     * TestBWSubmenuLink
     * Tests that the second item under the Books menu is the link to the Bone Walker page.
     */
    @Test
    public void TestBWSubmenuLink() {
        $(byXpath(submenuBWXPath))
                .should(exist)
                .shouldHave(attribute("href", submenuBWLink));
    }

    /**
     * TestBWSubmenuLinkClick
     * Tests that if you hover over the Books menu and then click on the Bone Walker item, you'll be taken to the
     * correct page.
     */
    @Test
    public void TestBWSubmenuLinkClick() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuBWXPath)).click();
        Assert.assertTrue(url().matches(submenuBWLink));
    }
}
