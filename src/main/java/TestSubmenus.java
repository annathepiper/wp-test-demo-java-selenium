import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestSubmenus
 * @author Angela Korra'ti
 * Last updated 4/25/2019
 * This test class is the parent class for testing the submenus, and it tests against the menu on the homepage. Child
 * classes will do appropriate setup to test against other specific pages.
 */
public class TestSubmenus extends BaseTest {
    WPMenu wpMenu;
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
        wpMenu = wpHomepage.wpMenu;
    }

    /**
     * TestHomeSubmenu
     * This method verifies the submenu underneath Home.
     */
    @Test
    public void TestHomeSubmenu() {
        wpLogger.info(String.format("Testing the Home submenu on: %s",targetUri));
        // Test the things that are testable when the menu isn't visible.
        wpMenu.homeSubmenuElement().should(exist).shouldNotBe(visible);
        Assert.assertEquals(wpMenu.homeSubmenuLink(),submenuHomeLink,"Home submenu does not have correct link.");

        // Now do a hover and check the things for when the menu is visible.
        wpMenu.homeMenuElement().hover();
        wpMenu.homeSubmenuElement().shouldBe(visible);
        Assert.assertEquals(wpMenu.homeSubmenuText(),submenuHomeText,"Home submenu does not have correct text.");
        wpMenu.homeSubmenuElement().click();
        Assert.assertEquals(url(),submenuHomeLink,"Clicking on Home submenu does not go to correct destination.");
    }

    /**
     * TestBooksSubmenu
     * This method verifies the submenu underneath Books.
     */
    @Test
    public void TestBooksSubmenu() {
        wpLogger.info(String.format("Testing the Books submenu on: %s",targetUri));
        // Test the things that are testable when the menu isn't visible.
        wpMenu.booksSubmenuElement().should(exist).shouldNotBe(visible);

        // Now verify the menu is visible when you hover.
        wpMenu.booksMenuElement().hover();
        wpMenu.booksSubmenuElement().shouldBe(visible);
    }

    /**
     * TestFaerieSubmenu
     * This method verifies the Faerie Blood item on the Books submenu.
     */
    @Test
    public void TestFaerieSubmenu() {
        wpLogger.info(String.format("Testing the Faerie Blood item under Books on: %s",targetUri));
        wpMenu.booksMenuElement().hover();
        wpMenu.faerieSubmenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.faerieSubmenuText(),submenuFaerieText,
                "Faerie Blood menu item doesn't have correct text.");
        Assert.assertEquals(wpMenu.faerieSubmenuLink(),submenuFaerieLink,
                "Faerie Blood menu item doesn't have correct link.");
        wpMenu.faerieSubmenuElement().click();
        Assert.assertEquals(url(),submenuFaerieLink,
                "Clicking on Faerie Blood menu item doesn't go to correct destination.");
    }

    /**
     * TestBoneSubmenu
     * This method verifies the Bone Walker item on the Books submenu.
     */
    @Test
    public void TestBoneSubmenu() {
        wpLogger.info(String.format("Testing the Bone Walker item under Books on: %s",targetUri));
        wpMenu.booksMenuElement().hover();
        wpMenu.boneSubmenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.boneSubmenuText(),submenuBoneText,
                "Bone Walker menu item doesn't have correct text.");
        Assert.assertEquals(wpMenu.boneSubmenuLink(),submenuBoneLink,
                "Bone Walker menu item doesn't have correct link.");
        wpMenu.boneSubmenuElement().click();
        Assert.assertEquals(url(),submenuBoneLink,
                "Clicking on Bone Walker menu item doesn't go to correct destination.");
    }

    /**
     * TestValorSubmenu
     * This method verifies the Valor of the Healer item on the Books submenu.
     */
    @Test
    public void TestValorSubmenu() {
        wpLogger.info(String.format("Testing the Valor of the Healer item under Books on: %s",targetUri));
        wpMenu.booksMenuElement().hover();
        wpMenu.valorSubmenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.valorSubmenuText(),submenuValorText,
                "Valor of the Healer menu item doesn't have correct text.");
        Assert.assertEquals(wpMenu.valorSubmenuLink(),submenuValorLink,
                "Valor of the Healer menu item doesn't have correct link.");
        wpMenu.valorSubmenuElement().click();
        Assert.assertEquals(url(),submenuValorLink,
                "Clicking on Valor of the Healer menu item doesn't go to correct destination.");
    }

    /**
     * TestVengeanceSubmenu
     * This method verifies the Vengeance of the Hunter item on the Books submenu.
     */
    @Test
    public void TestVengeanceSubmenu() {
        wpLogger.info(String.format("Testing the Vengeance of the Hunter item under Books on: %s",targetUri));
        wpMenu.booksMenuElement().hover();
        wpMenu.vengeanceSubmenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.vengeanceSubmenuText(),submenuVengeanceText,
                "Vengeance of the Hunter menu item doesn't have correct text.");
        Assert.assertEquals(wpMenu.vengeanceSubmenuLink(),submenuVengeanceLink,
                "Vengeance of the Hunter menu item doesn't have correct link.");
        wpMenu.vengeanceSubmenuElement().click();
        Assert.assertEquals(url(),submenuVengeanceLink,
                "Clicking on Vengeance of the Hunter menu item doesn't go to correct destination.");
    }

    /**
     * TestVictorySubmenu
     * This method verifies the Victory of the Hawk item on the Books submenu.
     */
    @Test
    public void TestVictorySubmenu() {
        wpLogger.info(String.format("Testing the Victory of the Hawk item under Books on: %s",targetUri));
        wpMenu.booksMenuElement().hover();
        wpMenu.victorySubmenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.victorySubmenuText(),submenuVictoryText,
                "Victory of the Hawk menu item doesn't have correct text.");
        Assert.assertEquals(wpMenu.victorySubmenuLink(),submenuVictoryLink,
                "Victory of the Hawk menu item doesn't have correct link.");
        wpMenu.victorySubmenuElement().click();
        Assert.assertEquals(url(),submenuVictoryLink,
                "Clicking on Victory of the Hawk menu item doesn't go to correct destination.");
    }

    /**
     * TestShortSubmenu
     * This method verifies the Short Stories item on the Books submenu.
     */
    @Test
    public void TestShortSubmenu() {
        wpLogger.info(String.format("Testing the Short Stories item under Books on: %s",targetUri));
        wpMenu.booksMenuElement().hover();
        wpMenu.shortSubmenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.shortSubmenuText(),submenuShortText,
                "Short Stories menu item doesn't have correct text.");
        Assert.assertEquals(wpMenu.shortSubmenuLink(),submenuShortLink,
                "Short Stories menu item doesn't have correct link.");
        wpMenu.shortSubmenuElement().click();
        Assert.assertEquals(url(),submenuShortLink,
                "Clicking on Short Stories menu item doesn't go to correct destination.");
    }

    /**
     * TestStoreSubmenu
     * This method verifies the submenu underneath Store.
     */
    @Test
    public void TestStoreSubmenu() {
        wpLogger.info(String.format("Testing the Store submenu on: %s",targetUri));
        // Test the things that are testable when the menu isn't visible.
        wpMenu.storeSubmenuElement().should(exist).shouldNotBe(visible);
        Assert.assertEquals(wpMenu.storeSubmenuLink(),submenuStoreLink,"Store submenu does not have correct link.");

        // Now do a hover and check the things for when the menu is visible.
        wpMenu.storeMenuElement().hover();
        wpMenu.storeSubmenuElement().shouldBe(visible);
        Assert.assertEquals(wpMenu.storeSubmenuText(),submenuStoreText,"Store submenu does not have correct text.");
        wpMenu.storeSubmenuElement().click();
        Assert.assertEquals(url(),submenuStoreLink,"Clicking on Store submenu does not go to correct destination.");
    }
}
