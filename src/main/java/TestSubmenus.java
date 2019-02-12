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
 * Last updated 2/11/2019
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
     * TestHomeSubmenuText
     * This method verifies that the Home menu's submenu has the correct text. Selenide wants me to hover over the
     * Home menu in order to make that visible.
     */
    @Test
    public void TestHomeSubmenuText() {
        $(byXpath(menuHomeXPath)).hover();
        $(byXpath(submenuHomeXPath))
                .shouldHave(text(submenuHomeText));
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
     * TestFaerieSubmenuText
     * Tests that the first item under the Books menu has the correct text (Faerie Blood).
     */
    @Test
    public void TestFaerieSubmenuText() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuFaerieXPath))
                .shouldHave(text(submenuFaerieText));
    }

    /**
     * TestFaerieSubmenuLink
     * Tests that the first item under the Books menu is the link to the Faerie Blood page.
     */
    @Test
    public void TestFaerieSubmenuLink() {
        $(byXpath(submenuFaerieXPath))
                .should(exist)
                .shouldHave(attribute("href", submenuFaerieLink));
    }

    /**
     * TestFaerieSubmenuLinkClick
     * Tests that if you hover over the Books menu and then click on the Faerie Blood item, you'll be taken to the
     * correct page.
     */
    @Test
    public void TestFaerieSubmenuLinkClick() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuFaerieXPath)).click();
        Assert.assertTrue(url().matches(submenuFaerieLink));
    }

    /**
     * TestBoneSubmenuText
     * Tests that the second item under the Books menu has the correct text (Bone Walker).
     */
    @Test
    public void TestBoneSubmenuText() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuBoneXPath))
                .shouldHave(text(submenuBoneText));
    }

    /**
     * TestBoneSubmenuLink
     * Tests that the second item under the Books menu is the link to the Bone Walker page.
     */
    @Test
    public void TestBoneSubmenuLink() {
        $(byXpath(submenuBoneXPath))
                .should(exist)
                .shouldHave(attribute("href", submenuBoneLink));
    }

    /**
     * TestBoneSubmenuLinkClick
     * Tests that if you hover over the Books menu and then click on the Bone Walker item, you'll be taken to the
     * correct page.
     */
    @Test
    public void TestBoneSubmenuLinkClick() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuBoneXPath)).click();
        Assert.assertTrue(url().matches(submenuBoneLink));
    }

    /**
     * TestValorSubmenuText
     * Tests that the third item under the Books menu has the correct text (Valor of the Healer).
     */
    @Test
    public void TestValorSubmenuText() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuValorXPath))
                .shouldHave(text(submenuValorText));
    }

    /**
     * TestValorSubmenuLink
     * Tests that the third item under the Books menu is the link to the Valor of the Healer page.
     */
    @Test
    public void TestValorSubmenuLink() {
        $(byXpath(submenuValorXPath))
                .should(exist)
                .shouldHave(attribute("href", submenuValorLink));
    }

    /**
     * TestValorSubmenuLinkClick
     * Tests that if you hover over the Books menu and then click on the Valor of the Healer item, you'll be taken to
     * the correct page.
     */
    @Test
    public void TestValorSubmenuLinkClick() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuValorXPath)).click();
        Assert.assertTrue(url().matches(submenuValorLink));
    }

    /**
     * TestVengeanceSubmenuText
     * Tests that the fourth item under the Books menu has the correct text (Vengeance of the Hunter).
     */
    @Test
    public void TestVengeanceSubmenuText() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuVengeanceXPath))
                .shouldHave(text(submenuVengeanceText));
    }

    /**
     * TestVengeanceSubmenuLink
     * Tests that the fourth item under the Books menu is the link to the Vengeance of the Hunter page.
     */
    @Test
    public void TestVengeanceSubmenuLink() {
        $(byXpath(submenuVengeanceXPath))
                .should(exist)
                .shouldHave(attribute("href", submenuVengeanceLink));
    }

    /**
     * TestVengeanceSubmenuLinkClick
     * Tests that if you hover over the Books menu and then click on the Vengeance of the Hunter item, you'll be
     * taken to the correct page.
     */
    @Test
    public void TestVengeanceSubmenuLinkClick() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuVengeanceXPath)).click();
        Assert.assertTrue(url().matches(submenuVengeanceLink));
    }

    /**
     * TestVictorySubmenuText
     * Tests that the fifth item under the Books menu has the correct text (Victory of the Hawk).
     */
    @Test
    public void TestVictorySubmenuText() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuVictoryXPath))
                .shouldHave(text(submenuVictoryText));
    }

    /**
     * TestVictorySubmenuLink
     * Tests that the fifth item under the Books menu is the link to the Victory of the Hawk page.
     */
    @Test
    public void TestVictorySubmenuLink() {
        $(byXpath(submenuVictoryXPath))
                .should(exist)
                .shouldHave(attribute("href", submenuVictoryLink));
    }

    /**
     * TestVictorySubmenuLinkClick
     * Tests that if you hover over the Books menu and then click on the Victory of the Hawk item, you'll be taken to
     * the correct page.
     */
    @Test
    public void TestVictorySubmenuLinkClick() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuVictoryXPath)).click();
        Assert.assertTrue(url().matches(submenuVictoryLink));
    }

    /**
     * TestShortSubmenuText
     * Tests that the sixth item under the Books menu has the correct text (Short Storise).
     */
    @Test
    public void TestShortSubmenuText() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuShortXPath))
                .shouldHave(text(submenuShortText));
    }

    /**
     * TestShortSubmenuLink
     * Tests that the sixth item under the Books menu is the link to the Short Stories page.
     */
    @Test
    public void TestShortSubmenuLink() {
        $(byXpath(submenuShortXPath))
                .should(exist)
                .shouldHave(attribute("href", submenuShortLink));
    }

    /**
     * TestShortSubmenuLinkClick
     * Tests that if you hover over the Books menu and then click on the Short Stories item, you'll be taken to the
     * correct page.
     */
    @Test
    public void TestShortSubmenuLinkClick() {
        $(byXpath(menuBooksXPath)).hover();
        $(byXpath(submenuShortXPath)).click();
        Assert.assertTrue(url().matches(submenuShortLink));
    }

    /**
     * TestStoreSubmenuNotVisible
     * This method verifies that the submenu underneath Store isn't visible by default.
     */
    @Test
    public void TestStoreSubmenuNotVisible() {
        $(byXpath(submenuStoreXPath))
                .should(exist)
                .shouldNotBe(visible);
    }

    /**
     * TestStoreSubmenuVisibleOnHover
     * This method verifies that if you hover over the Store menu, the submenu should be visible.
     */
    @Test
    public void TestStoreSubmenuVisibleOnHover() {
        $(byXpath(menuStoreXPath)).hover();
        $(byXpath(submenuStoreXPath))
                .should(exist)
                .shouldBe(visible);
    }

    /**
     * TestStoreSubmenuText
     * This method verifies that the Store menu's submenu has the correct text. Selenide wants me to hover over the
     * Store menu in order to make that visible.
     */
    @Test
    public void TestStoreSubmenuText() {
        $(byXpath(menuStoreXPath)).hover();
        $(byXpath(submenuStoreXPath))
                .shouldHave(text(submenuStoreText));
    }

    /**
     * TestStoreSubmenuLink
     * This method verifies that the Store menu's submenu has the correct link. Does not require the submenu to be
     * visible to check this.
     */
    @Test
    public void TestStoreSubmenuLink() {
        $(byXpath(submenuStoreXPath))
                .shouldHave(attribute("href", submenuStoreLink));
    }

    /**
     * TestStoreSubmenuLinkClick
     * This test case hovers over the Store menu, and then clicks on the submenu link and verifies you land on the
     * appropriate page (the link for the Bone Walker Soundtrack page).
     */
    @Test
    public void TestStoreSubmenuLinkClick() {
        $(byXpath(menuStoreXPath)).hover();
        $(byXpath(submenuStoreXPath)).click();
        Assert.assertTrue(url().matches(submenuStoreLink));
    }
}
