import org.testng.Assert;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * TestMenu
 * @author Angela Korra'ti
 *
 * Last updated 4/25/2019
 * This test class is the abstract parent class for testing the menu. Child classes will implement the test cases to
 * test against specific pages.
 */
abstract class TestMenu extends BaseTest {
    abstract void methodSetup();

    /**
     * TestHomeMenuPresent
     * This method verifies that the first visible item on the menu is Home.
     */
    abstract void TestHomeMenuPresent();

    /**
     * TestHomeMenuLink
     * This method verifies that the first visible item on the menu has the correct link.
     */
    abstract void TestHomeMenuLink();

    /**
     * TestHomeMenuClick
     * This method clicks on the first visible item on the menu and verifies you land on the homepage.
     */
    abstract void TestHomeMenuClick();

    /**
     * TestAboutMenuPresent
     * This method verifies that the second visible item on the menu is About.
     */
    abstract void TestAboutMenuPresent();

    /**
     * TestAboutMenuLink
     * This method verifies that the second visible item on the menu has the correct link.
     */
    abstract void TestAboutMenuLink();

    /**
     * TestAboutMenuClick
     * This method clicks on the second visible item on the menu and verifies you land on the About page.
     */
    abstract void TestAboutMenuClick();

    /**
     * TestBooksMenuPresent
     * This method verifies that the third visible item on the menu is Books.
     */
    abstract void TestBooksMenuPresent();

    /**
     * TestBooksMenuLink
     * This method verifies that the third visible item on the menu has the correct link.
     */
    abstract void TestBooksMenuLink();

    /**
     * TestBooksMenuClick
     * This method clicks on the third visible item on the menu and verifies you land on the Books page.
     */
    abstract void TestBooksMenuClick();

    /**
     * TestBlogMenuPresent
     * This method verifies that the fourth visible item on the menu is Blog.
     */
    abstract void TestBlogMenuPresent();

    /**
     * TestBlogMenuLink
     * This method verifies that the fourth visible item on the menu has the correct link.
     */
    abstract void TestBlogMenuLink();

    /**
     * TestBlogMenuClick
     * This method clicks on the fourth visible item on the menu and verifies you land on the Blog page.
     */
    abstract void TestBlogMenuClick();

    /**
     * TestContactMenuPresent
     * This method verifies that the fifth visible item on the menu is Contact.
     */
    abstract void TestContactMenuPresent();

    /**
     * TestContactMenuLink
     * This method verifies that the fifth visible item on the menu has the correct link.
     */
    abstract void TestContactMenuLink();

    /**
     * TestContactMenuClick
     * This method clicks on the fifth visible item on the menu and verifies you land on the Contact page.
     */
    abstract void TestContactMenuClick();

    /**
     * TestStoreMenuPresent
     * This method verifies that the sixth visible item on the menu is Store.
     */
    abstract void TestStoreMenuPresent();

    /**
     * TestStoreMenuLink
     * This method verifies that the sixth visible item on the menu has the correct link.
     */
    abstract void TestStoreMenuLink();

    /**
     * TestStoreMenuClick
     * This method clicks on the sixth visible item on the menu and verifies you land on the Store page.
     */
    abstract void TestStoreMenuClick();

    // HELPER METHODS BEGIN HERE
    void verifyHomeMenuPresent(WPMenu wpMenu) {
        wpMenu.homeMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.homeMenuText(),menuHomeText,"Home menu does not have correct text.");
    }

    void verifyHomeMenuLink(WPMenu wpMenu) {
        Assert.assertEquals(wpMenu.homeMenuLink(),menuHomeLink,"Home menu does not have correct link.");
    }

    void verifyHomeMenuClick(WPMenu wpMenu) {
        wpMenu.homeMenuElement().click();
        Assert.assertEquals(url(),menuHomeLink,"Clicking on Home does not go to correct destination.");
    }

    void verifyAboutMenuPresent(WPMenu wpMenu) {
        wpMenu.aboutMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.aboutMenuText(),menuAboutText,"About menu does not have correct text.");
    }

    void verifyAboutMenuLink(WPMenu wpMenu) {
        Assert.assertEquals(wpMenu.aboutMenuLink(),menuAboutLink,"About menu does not have correct link.");
    }

    void verifyAboutMenuClick(WPMenu wpMenu) {
        wpMenu.aboutMenuElement().click();
        Assert.assertEquals(url(),menuAboutLink,"Clicking on About does not go to correct destination.");
    }

    void verifyBooksMenuPresent(WPMenu wpMenu) {
        wpMenu.booksMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.booksMenuText(),menuBooksText,"Books menu does not have correct text.");
    }

    void verifyBooksMenuLink(WPMenu wpMenu) {
        Assert.assertEquals(wpMenu.booksMenuLink(),menuBooksLink,"Books menu does not have correct link.");
    }

    void verifyBooksMenuClick(WPMenu wpMenu) {
        wpMenu.booksMenuElement().click();
        Assert.assertEquals(url(),menuBooksLink);
    }

    void verifyBlogMenuPresent(WPMenu wpMenu) {
        wpMenu.blogMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.blogMenuText(),menuBlogText,"Blog menu does not have correct text.");
    }

    void verifyBlogMenuLink(WPMenu wpMenu) {
        Assert.assertEquals(wpMenu.blogMenuLink(),menuBlogLink,"Blog menu does not have correct link.");
    }

    void verifyBlogMenuClick(WPMenu wpMenu) {
        wpMenu.blogMenuElement().click();
        Assert.assertEquals(url(),menuBlogLink);
    }

    void verifyContactMenuPresent(WPMenu wpMenu) {
        wpMenu.contactMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.contactMenuText(),menuContactText,"Contact menu does not have correct text.");
    }

    void verifyContactMenuLink(WPMenu wpMenu) {
        Assert.assertEquals(wpMenu.contactMenuLink(),menuContactLink,"Contact menu does not have correct link.");
    }

    void verifyContactMenuClick(WPMenu wpMenu) {
        wpMenu.contactMenuElement().click();
        Assert.assertEquals(url(),menuContactLink);
    }

    void verifyStoreMenuPresent(WPMenu wpMenu) {
        wpMenu.storeMenuElement().should(exist).shouldBe(visible);
        Assert.assertEquals(wpMenu.storeMenuText(),menuStoreText,"Store menu does not have correct text.");
    }

    void verifyStoreMenuLink(WPMenu wpMenu) {
        Assert.assertEquals(wpMenu.storeMenuLink(),menuStoreLink,"Store menu does not have correct link.");
    }

    void verifyStoreMenuClick(WPMenu wpMenu) {
        wpMenu.storeMenuElement().click();
        Assert.assertEquals(url(),menuStoreLink);
    }
}