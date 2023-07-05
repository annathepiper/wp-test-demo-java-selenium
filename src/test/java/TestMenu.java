import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestMenu
 * @author Angela Korra'ti
 * Last updated 7/4/2023
 * This test class is the parent class for testing the menu, and it tests against the menu on the homepage. Child
 * classes will do appropriate setup to test against other specific pages.
 */
public class TestMenu extends WPMenu {
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
     * TestHomeMenu
     * This method verifies the Home menu is present, visible, and has the correct text and destination.
     */
    @Test
    public void TestHomeMenu() {
        wpLogger.info(String.format("Testing Home menu on: %s",targetUri));
        wpMenu.homeMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.homeMenuText(),menuHomeText,"Home menu does not have correct text.");
        Assert.assertEquals(wpMenu.homeMenuLink(),menuHomeLink,"Home menu does not have correct link.");
        wpMenu.homeMenuElement().click();
        Assert.assertEquals(url(),menuHomeLink,"Clicking on Home does not go to correct destination.");
    }

    /**
     * TestAboutMenu
     * This method verifies the About menu is present, visible, and has the correct text and destination.
     */
    @Test
    public void TestAboutMenu() {
        wpLogger.info(String.format("Testing About menu on: %s",targetUri));
        wpMenu.aboutMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.aboutMenuText(),menuAboutText,"About menu does not have correct text.");
        Assert.assertEquals(wpMenu.aboutMenuLink(),menuAboutLink,"About menu does not have correct link.");
        wpMenu.aboutMenuElement().click();
        Assert.assertEquals(url(),menuAboutLink,"Clicking on About does not go to correct destination.");

    }

    /**
     * TestBooksMenu
     * This method verifies the Books menu is present, visible, and has the correct text and destination.
     */
    @Test
    public void TestBooksMenu() {
        wpLogger.info(String.format("Testing Books menu on: %s",targetUri));
        wpMenu.booksMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.booksMenuText(),menuBooksText,"Books menu does not have correct text.");
        Assert.assertEquals(wpMenu.booksMenuLink(),menuBooksLink,"Books menu does not have correct link.");
        wpMenu.booksMenuElement().click();
        Assert.assertEquals(url(),menuBooksLink,"Clicking on Books does not go to correct destination.");
    }

    /**
     * TestBlogMenu
     * This method verifies the Blog menu is present, visible, and has the correct text and destination.
     */
    @Test
    public void TestBlogMenu() {
        wpLogger.info(String.format("Testing Blog menu on: %s",targetUri));
        wpMenu.blogMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.blogMenuText(),menuBlogText,"Blog menu does not have correct text.");
        Assert.assertEquals(wpMenu.blogMenuLink(),menuBlogLink,"Blog menu does not have correct link.");
        wpMenu.blogMenuElement().click();
        Assert.assertEquals(url(),menuBlogLink,"Clicking on Blog does not go to correct destination.");
    }

    /**
     * TestContactMenu
     * This method verifies the Contact menu is present, visible, and has the correct text and destination.
     */
    @Test
    public void TestContactMenu() {
        wpLogger.info(String.format("Testing Contact menu on: %s",targetUri));
        wpMenu.contactMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.contactMenuText(),menuContactText,"Contact menu does not have correct text.");
        Assert.assertEquals(wpMenu.contactMenuLink(),menuContactLink,"Contact menu does not have correct link.");
        wpMenu.contactMenuElement().click();
        Assert.assertEquals(url(),menuContactLink,"Clicking on Contact does not go to correct destination.");
    }

    /**
     * TestStoreMenu
     * This method verifies the Store menu is present, visible, and has the correct text and destination.
     */
    @Test
    public void TestStoreMenu() {
        wpLogger.info(String.format("Testing Store menu on: %s",targetUri));
        wpMenu.storeMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.storeMenuText(),menuStoreText,"Store menu does not have correct text.");
        Assert.assertEquals(wpMenu.storeMenuLink(),menuStoreLink,"Store menu does not have correct link.");
        wpMenu.storeMenuElement().click();
        wpMenu.storeMenuElement().should(disappear);
        Assert.assertEquals(url(),menuStoreLink,"Clicking on Store does not go to correct destination.");
    }
}