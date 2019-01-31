import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestMenu
 * @author Angela Korra'ti
 *
 * Last updated 1/31/2019
 * This test class tests the menu functionality on my test Wordpress site.
 */
public class TestMenu extends BaseTest {

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
     * TestHomeMenuPresent
     * This method verifies that the first visible item on the menu is Home.
     */
    @Test
    public void TestHomeMenuPresent() {
        $(byXpath(menuHomeXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(menuHomeText));
    }

    /**
     * TestHomeMenuLink
     * This method verifies that the first visible item on the menu has the correct link.
     */
    @Test
    public void TestHomeMenuLink() {
        $(byXpath(menuHomeXPath))
                .shouldHave(attribute("href", menuHomeLink));
    }

    /**
     * TestHomeMenuClick
     * This method clicks on the first visible item on the menu and verifies you land on the homepage.
     */
    @Test
    public void TestHomeMenuClick() {
        $(byXpath(menuHomeXPath)).click();
        url().matches(menuHomeLink);
        url().matches(wpBaseUri);
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
        url().matches(submenuHomeLink);
    }

    /**
     * TestAboutMenuPresent
     * This method verifies that the second visible item on the menu is About.
     */
    @Test
    public void TestAboutMenuPresent() {
        $(byXpath(menuAboutXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(menuAboutText));
    }

    /**
     * TestAboutMenuLink
     * This method verifies that the second visible item on the menu has the correct link.
     */
    @Test
    public void TestAboutMenuLink() {
        $(byXpath(menuAboutXPath))
                .shouldHave(attribute("href", menuAboutLink));
    }

    /**
     * TestAboutMenuClick
     * This method clicks on the second visible item on the menu and verifies you land on the About page.
     */
    @Test
    public void TestAboutMenuClick() {
        $(byXpath(menuAboutXPath)).click();
        url().matches(menuAboutLink);
    }

    /**
     * TestBooksMenuPresent
     * This method verifies that the third visible item on the menu is Books.
     */
    @Test
    public void TestBooksMenuPresent() {
        $(byXpath(menuBooksXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(menuBooksText));
    }

    /**
     * TestBooksMenuLink
     * This method verifies that the third visible item on the menu has the correct link.
     */
    @Test
    public void TestBooksMenuLink() {
        $(byXpath(menuBooksXPath))
                .shouldHave(attribute("href", menuBooksLink));
    }

    /**
     * TestBooksMenuClick
     * This method clicks on the third visible item on the menu and verifies you land on the Books page.
     */
    @Test
    public void TestBooksMenuClick() {
        $(byXpath(menuBooksXPath)).click();
        url().matches(menuBooksLink);
    }

    /**
     * TestBlogMenuPresent
     * This method verifies that the fourth visible item on the menu is Blog.
     */
    @Test
    public void TestBlogMenuPresent() {
        $(byXpath(menuBlogXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(menuBlogText));
    }

    /**
     * TestBlogMenuLink
     * This method verifies that the fourth visible item on the menu has the correct link.
     */
    @Test
    public void TestBlogMenuLink() {
        $(byXpath(menuBlogXPath))
                .shouldHave(attribute("href", menuBlogLink));
    }

    /**
     * TestBlogMenuClick
     * This method clicks on the fourth visible item on the menu and verifies you land on the Blog page.
     */
    @Test
    public void TestBlogMenuClick() {
        $(byXpath(menuBlogXPath)).click();
        url().matches(menuBlogLink);
    }

    /**
     * TestContactMenuPresent
     * This method verifies that the fifth visible item on the menu is Contact.
     */
    @Test
    public void TestContactMenuPresent() {
        $(byXpath(menuContactXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(menuContactText));
    }

    /**
     * TestContactMenuLink
     * This method verifies that the fifth visible item on the menu has the correct link.
     */
    @Test
    public void TestContactMenuLink() {
        $(byXpath(menuContactXPath))
                .shouldHave(attribute("href", menuContactLink));
    }

    /**
     * TestContactMenuClick
     * This method clicks on the fifth visible item on the menu and verifies you land on the Contact page.
     */
    @Test
    public void TestContactMenuClick() {
        $(byXpath(menuContactXPath)).click();
        url().matches(menuContactLink);
    }

    /**
     * TestStoreMenuPresent
     * This method verifies that the sixth visible item on the menu is Store.
     */
    @Test
    public void TestStoreMenuPresent() {
        $(byXpath(menuStoreXPath))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text(menuStoreText));
    }

    /**
     * TestStoreMenuLink
     * This method verifies that the sixth visible item on the menu has the correct link.
     */
    @Test
    public void TestStoreMenuLink() {
        $(byXpath(menuStoreXPath))
                .shouldHave(attribute("href", menuStoreLink));
    }

    /**
     * TestStoreMenuClick
     * This method clicks on the sixth visible item on the menu and verifies you land on the Store page.
     */
    @Test
    public void TestStoreMenuClick() {
        $(byXpath(menuStoreXPath)).click();
        url().matches(menuStoreLink);
    }
}